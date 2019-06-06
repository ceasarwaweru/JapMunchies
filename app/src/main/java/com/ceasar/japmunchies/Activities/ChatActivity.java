package com.ceasar.japmunchies.Activities;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import com.ceasar.japmunchies.Adapters.IngredientAdapter;
import com.ceasar.japmunchies.Adapters.MessagesAdapter;
import com.ceasar.japmunchies.Models.MessageItem;
import com.ceasar.japmunchies.Models.Recipe;
import com.ceasar.japmunchies.R;
import com.ceasar.japmunchies.Variables;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

public class ChatActivity extends AppCompatActivity {
    private Context mContext;
    private Recipe mChosenRecipe;
    @Bind(R.id.backButton) ImageButton backButton;
    @Bind(R.id.recipeName) TextView recipeName;
    @Bind(R.id.messagesRecyclerView) RecyclerView messagesRecyclerView;
    @Bind(R.id.MessageEditText) EditText MessageEditText;
    @Bind(R.id.sendButton) ImageButton sendButton;
    MessagesAdapter mMessagesAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);
        ButterKnife.bind(this);
        mContext = getApplicationContext();
        mChosenRecipe = Variables.chosenRecipe;

        setStuff();
    }

    private void setStuff() {
        List<MessageItem> testMessages = new ArrayList<>();
        testMessages.add(new MessageItem("1","Hello World!","Dev Id","Dev","",mChosenRecipe.getRecipeId()));
        testMessages.add(new MessageItem("2","Hello World, Again!","Dev Id","Dev2","",mChosenRecipe.getRecipeId()));
        testMessages.add(new MessageItem("3","Good Recipe","Dev Id","Dev 3","",mChosenRecipe.getRecipeId()));

        mMessagesAdapter = new MessagesAdapter(testMessages,ChatActivity.this);
        messagesRecyclerView.setAdapter(mMessagesAdapter);
        messagesRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        recipeName.setText(mChosenRecipe.getName());
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = MessageEditText.getText().toString().trim();
                if(message.equals("")){
                    MessageEditText.setError("Say something");
                }else{
                    List<MessageItem> currentMessages = mMessagesAdapter.getCurrentMessages();
                    currentMessages.add(new MessageItem("X",message,"You"
                            ,"Dev","",mChosenRecipe.getRecipeId()));

                    mMessagesAdapter = new MessagesAdapter(currentMessages,ChatActivity.this);
                    messagesRecyclerView.setAdapter(mMessagesAdapter);

                    MessageEditText.setText("");
                    View view = ChatActivity.this.getCurrentFocus();
                    if (view != null) {
                        InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
                        imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
                    }
                }
            }
        });
    }
}
