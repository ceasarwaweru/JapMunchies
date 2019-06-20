package com.ceasar.japmunchies.Activities;

import android.animation.Animator;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.ShareCompat;
import android.support.v4.view.animation.LinearOutSlowInInterpolator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.ImageButton;
import android.widget.RelativeLayout;

import com.ceasar.japmunchies.Adapters.FeaturedRecipeAdapter;
import com.ceasar.japmunchies.Adapters.SuggestionsAdapter;
import com.ceasar.japmunchies.Models.Recipe;
import com.ceasar.japmunchies.R;
import com.ceasar.japmunchies.Services.DatabaseManager;
import com.ceasar.japmunchies.Variables;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;


/* Ill comment my code some other time when I feel like it.*/
public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Context mContext;
    private List<Recipe> mAllRecipes = new ArrayList<>();
    @Bind(R.id.searchEditText) AutoCompleteTextView mSearchEditText;
    @Bind(R.id.searchView) RelativeLayout mSearchView;
    @Bind(R.id.searchViewBack) RelativeLayout mSearchViewBack;
    @Bind(R.id.SearchCardView) CardView mSearchCardView;
    @Bind(R.id.suggestionsCard) CardView suggestionsCard;
    @Bind(R.id.SuggestionsRecyclerView) RecyclerView SuggestionsRecyclerView;
    @Bind(R.id.SearchField) AutoCompleteTextView SearchField;
    @Bind(R.id.chatIcon) ImageButton mChatIcon;
    @Bind(R.id.ShareAppBtn) ImageButton ShareAppBtn;

    private LinkedHashMap<String,Recipe> qualifiedRecipes = new LinkedHashMap<>();
    private boolean isSearchViewOpen = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        mContext = this.getApplicationContext();
        addFeaturedItems();

        mSearchEditText.setOnClickListener(this);
        mChatIcon.setOnClickListener(this);
    }

    private void addFeaturedItems() {
        RecyclerView rvContacts = findViewById(R.id.featuredItemsRecyclerView);

        mAllRecipes= new DatabaseManager(mContext).createTestRecipes();
        FeaturedRecipeAdapter adapter = new FeaturedRecipeAdapter(mAllRecipes,MainActivity.this);
        rvContacts.setAdapter(adapter);
        rvContacts.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    public void onClick(View v) {
        if(v.equals(mSearchEditText)) showSearchPart();
        else if(v.equals(mChatIcon)){
            Intent intent = new Intent(MainActivity.this,AccountActivity.class);
            startActivity(intent);
        }else if(v.equals(ShareAppBtn)){
            Intent shareIntent = ShareCompat.IntentBuilder.from(MainActivity.this)
                    .setType("text/plain")
                    .setText("Check out JapMunchies, a japanese food recipes app.")
                    .getIntent();
            if (shareIntent.resolveActivity(getPackageManager()) != null) {
                startActivity(shareIntent);
            }
        }
    }

    private void showSearchPart(){
        isSearchViewOpen = true;
        mSearchView.setVisibility(View.VISIBLE);
        mSearchViewBack.setVisibility(View.VISIBLE);

        mSearchViewBack.animate().alpha(0.6f).setDuration(300).setInterpolator(new LinearOutSlowInInterpolator()).start();
        mSearchCardView.animate().translationY(0).setDuration(300).setInterpolator(new LinearOutSlowInInterpolator()).start();
        suggestionsCard.animate().translationY(0).setDuration(300).setInterpolator(new LinearOutSlowInInterpolator()).setListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animation) {

            }

            @Override
            public void onAnimationEnd(Animator animation) {
                mSearchView.setVisibility(View.VISIBLE);
                mSearchViewBack.setVisibility(View.VISIBLE);
                mSearchViewBack.setAlpha(0.6f);
                mSearchCardView.setTranslationY(DpToPx(0));
                suggestionsCard.setTranslationY(DpToPx(0));
                findViewById(R.id.searchFoodLayout).setVisibility(View.INVISIBLE);
            }

            @Override
            public void onAnimationCancel(Animator animation) {

            }

            @Override
            public void onAnimationRepeat(Animator animation) {

            }
        }).start();


        SuggestionsAdapter adapter = new SuggestionsAdapter(mAllRecipes,MainActivity.this);
        SuggestionsRecyclerView.setAdapter(adapter);
        SuggestionsRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        setSearchListener();
    }

    private void setSearchListener() {
        SearchField.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                List<Recipe> recipes = new ArrayList<>();

                for(Recipe r: mAllRecipes){
                    for(int i=0;i<s.length();i++) {
                        if(r.getName().contains(s)){
                            recipes.add(r);
                        }
                    }
                }
                if(s.length()==0) updateSuggestionsRecyclerView(mAllRecipes);
                else updateSuggestionsRecyclerView(recipes);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    @Override
    protected void onPause(){
        super.onPause();
        closeSearchPart();
    }

    private void closeSearchPart(){
        mSearchViewBack.animate().alpha(0f).setDuration(300).setInterpolator(new LinearOutSlowInInterpolator()).start();
        mSearchCardView.animate().translationY(DpToPx(55)).setDuration(300).setInterpolator(new LinearOutSlowInInterpolator()).start();
        suggestionsCard.animate().translationY(DpToPx(255)).setDuration(300).setInterpolator(new LinearOutSlowInInterpolator())
                .setListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animation) {

            }

            @Override
            public void onAnimationEnd(Animator animation) {
                mSearchView.setVisibility(View.GONE);
                mSearchViewBack.setVisibility(View.GONE);
                mSearchViewBack.setAlpha(0f);
                mSearchCardView.setTranslationY(DpToPx(55));
                suggestionsCard.setTranslationY(DpToPx(55));

                findViewById(R.id.searchFoodLayout).setVisibility(View.VISIBLE);
            }

            @Override
            public void onAnimationCancel(Animator animation) {

            }

            @Override
            public void onAnimationRepeat(Animator animation) {

            }
        }).start();
        isSearchViewOpen = false;
    }

    public float DpToPx(float dp) {
        return dp * getResources().getDisplayMetrics().density;
    }

    private void updateSuggestionsRecyclerView(List<Recipe> recipes){
        SuggestionsAdapter adapter = new SuggestionsAdapter(recipes,MainActivity.this);
        SuggestionsRecyclerView.setAdapter(adapter);
        SuggestionsRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    public void onBackPressed(){
        if(isSearchViewOpen)closeSearchPart();
        else super.onBackPressed();
    }
}
