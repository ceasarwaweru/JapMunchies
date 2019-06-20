package com.ceasar.japmunchies.Activities;

import android.animation.Animator;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.Image;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.v4.view.animation.LinearOutSlowInInterpolator;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.ceasar.japmunchies.R;
import com.ceasar.japmunchies.Services.SharedPreferenceManager;
import com.google.firebase.auth.FirebaseAuth;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import butterknife.Bind;
import butterknife.ButterKnife;

public class AccountActivity extends AppCompatActivity implements View.OnClickListener{
    private static final int PICK_IMAGE_REQUEST = 234;
    private Uri mFilepath;
    private Context mContext;

    @Bind(R.id.backBtn) ImageView backBtn;
    @Bind(R.id.settingsBtn) ImageView settingsBtn;
    @Bind(R.id.blackBackForSettings) RelativeLayout blackBackForSettings;
    @Bind(R.id.settingsView) RelativeLayout settingsView;
    @Bind(R.id.pickAvatarIcon) ImageView pickAvatarIcon;
    @Bind(R.id.avatarIconSet) ImageView avatarIconSet;
    @Bind(R.id.setDataButton) Button setDataButton;
    @Bind(R.id.nameEditText) EditText nameEditText;
    @Bind(R.id.emailEditText) EditText emailEditText;
    @Bind(R.id.phoneEditText) EditText phoneEditText;
    @Bind(R.id.genderEditText) EditText genderEditText;
    @Bind(R.id.usernameId) TextView usernameId;
    @Bind(R.id.emailId) TextView emailId;
    @Bind(R.id.phoneNoId) TextView phoneNoId;
    @Bind(R.id.genderId) TextView genderId;
    @Bind(R.id.LogoutCard) CardView LogoutCard;
    @Bind(R.id.avatarImage) ImageView avatarImage;

    private boolean isSettingsOpen = false;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);
        ButterKnife.bind(this);
        mContext = this.getApplicationContext();

        setData();
        backBtn.setOnClickListener(this);
        settingsBtn.setOnClickListener(this);
        LogoutCard.setOnClickListener(this);
    }

    private void setData() {
        try{
//            Uri image = Uri.parse(new SharedPreferenceManager(mContext).loadAvatar());
//            Bitmap bitmap = MediaStore.Images.Media.getBitmap(getContentResolver(), image);

            Bitmap bitmap = loadImageFromStorage(new SharedPreferenceManager(mContext).loadAvatar());
            avatarIconSet.setImageBitmap(bitmap);
            avatarImage.setImageBitmap(bitmap);
        }catch (Exception e){
            e.printStackTrace();
        }

        String username = new SharedPreferenceManager(mContext).loadNameInSharedPref();
        if(!username.equals(""))usernameId.setText(username);

        String Email = new SharedPreferenceManager(mContext).loadEmailInSharedPref();
        if(!Email.equals(""))emailId.setText(Email);

        String phone = new SharedPreferenceManager(mContext).loadPhoneInSharedPref();
        if(!phone.equals(""))phoneNoId.setText(phone);
        else phoneNoId.setText("You haven't set a phone number.");

        String gender = new SharedPreferenceManager(mContext).loadGenderInSharedPref();
        if(!gender.equals(""))genderId.setText(gender);
        else genderId.setText("You haven't set a preferred gender.");
    }

    @Override
    public void onClick(View v) {
        if(v.equals(backBtn)){
            if(!isSettingsOpen)onBackPressed();
        }else if(v.equals(settingsBtn)){
            if(!isSettingsOpen)openSettings();
        }else if(v.equals(LogoutCard)){
            if(!isSettingsOpen)logout();
        }
    }

    private void logout() {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("Logout");
            builder.setMessage("Are you sure you want to log out?")
                    .setCancelable(true)
                    .setPositiveButton("Yes.", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            if (FirebaseAuth.getInstance() != null) {
                                FirebaseAuth.getInstance().signOut();
                            }
                            Intent intent = new Intent(AccountActivity.this, LoginActivity.class);
                            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                            startActivity(intent);
                            finish();
                        }
                    })
                    .setNegativeButton("No!!", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                        }
                    }).show();
    }

    private void openSettings() {
        isSettingsOpen = true;
        blackBackForSettings.setVisibility(View.VISIBLE);
        settingsView.setVisibility(View.VISIBLE);
        blackBackForSettings.animate().alpha(0.65f).setDuration(300).setInterpolator(new LinearOutSlowInInterpolator()).start();
        settingsView.animate().translationY(0).setDuration(300).setInterpolator(new LinearOutSlowInInterpolator())
                .setListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animation) {

            }

            @Override
            public void onAnimationEnd(Animator animation) {
                blackBackForSettings.setVisibility(View.VISIBLE);
                settingsView.setVisibility(View.VISIBLE);

                blackBackForSettings.setAlpha(0.65f);
                settingsView.setTranslationY(0);
            }

            @Override
            public void onAnimationCancel(Animator animation) {

            }

            @Override
            public void onAnimationRepeat(Animator animation) {

            }
        }).start();

        setSettingsActions();

        if(!new SharedPreferenceManager(mContext).loadNameInSharedPref().equals("")) nameEditText.setText(new SharedPreferenceManager(mContext).loadNameInSharedPref());
        if(!new SharedPreferenceManager(mContext).loadEmailInSharedPref().equals("")) emailEditText.setText(new SharedPreferenceManager(mContext).loadEmailInSharedPref());
    }

    private void setSettingsActions() {
        pickAvatarIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chooseImage();
            }
        });

        setDataButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setDataInSharedPrefs();
            }
        });
    }

    private void setDataInSharedPrefs() {
        String name = nameEditText.getText().toString().trim();
        String email = emailEditText.getText().toString().trim();
        String phoneNo = phoneEditText.getText().toString().trim();
        String gender = genderEditText.getText().toString().trim();

        if(name.equals(""))nameEditText.setError("Please add your name");
        else if(email.equals("")) emailEditText.setError("Please add your email");
        else{
            new SharedPreferenceManager(mContext).setNameInSharedPref(name);
            new SharedPreferenceManager(mContext).setEmailInSharedPref(email);
            if(!phoneNo.equals(""))new SharedPreferenceManager(mContext).setPhoneInSharedPref(phoneNo);
            if (!gender.equals(""))new SharedPreferenceManager(mContext).setGenderInSharedPref(gender);

            Toast.makeText(mContext,"Your info has been set",Toast.LENGTH_SHORT).show();
            closeSettings();
            setData();
        }
    }

    private void chooseImage() {
        Intent intent = new Intent();
        intent.setType("image/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(intent.createChooser(intent,"Select Picture"),PICK_IMAGE_REQUEST);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode,Intent data){
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == PICK_IMAGE_REQUEST && resultCode == RESULT_OK && data != null && data.getData() != null) {
            if (data.getData() != null) {
                mFilepath = data.getData();
                try {
                    Bitmap bitmap = MediaStore.Images.Media.getBitmap(getContentResolver(), mFilepath);
                    avatarIconSet.setImageBitmap(bitmap);
                    String i = saveToInternalStorage(bitmap);
                    new SharedPreferenceManager(mContext).setAvatar(i);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    private String saveToInternalStorage(Bitmap bitmapImage){
        ContextWrapper cw = new ContextWrapper(getApplicationContext());
        // path to /data/data/yourapp/app_data/imageDir
        File directory = cw.getDir("imageDir", Context.MODE_PRIVATE);
        // Create imageDir
        File mypath=new File(directory,"profile.jpg");

        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(mypath);
            // Use the compress method on the BitMap object to write image to the OutputStream
            bitmapImage.compress(Bitmap.CompressFormat.PNG, 100, fos);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return directory.getAbsolutePath();
    }

    private Bitmap loadImageFromStorage(String path) {
        Bitmap m = null;
        try {
            File f=new File(path, "profile.jpg");
            m = BitmapFactory.decodeStream(new FileInputStream(f));
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        return m;
    }

    @Override
    public void onBackPressed(){
        if(isSettingsOpen) closeSettings();
        else{
            super.onBackPressed();
        }
    }



    private void closeSettings(){
        isSettingsOpen = false;
        blackBackForSettings.animate().alpha(0f).setDuration(300).setInterpolator(new LinearOutSlowInInterpolator()).start();
        settingsView.animate().translationY(DpToPx(250)).setDuration(300).setInterpolator(new LinearOutSlowInInterpolator())
                .setListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animation) {

            }

            @Override
            public void onAnimationEnd(Animator animation) {
                blackBackForSettings.setVisibility(View.GONE);
                settingsView.setVisibility(View.GONE);

                blackBackForSettings.setAlpha(0f);
                settingsView.setTranslationY(DpToPx(250));
            }

            @Override
            public void onAnimationCancel(Animator animation) {

            }

            @Override
            public void onAnimationRepeat(Animator animation) {

            }
        }).start();
    }

    public float DpToPx(float dp) {
        return dp * getResources().getDisplayMetrics().density;
    }
}
