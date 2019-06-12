package com.ceasar.japmunchies.Activities;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.ceasar.japmunchies.Adapters.FeaturedRecipeAdapter;
import com.ceasar.japmunchies.Adapters.IngredientAdapter;
import com.ceasar.japmunchies.Fragments.SpecificRecipeStepFragment;
import com.ceasar.japmunchies.Models.Recipe;
import com.ceasar.japmunchies.R;
import com.ceasar.japmunchies.Services.DatabaseManager;
import com.ceasar.japmunchies.Variables;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

public class SpecificRecipe extends AppCompatActivity {
    private Recipe mChosenRecipe;
    private Context mContext;
    @Bind(R.id.recipeName) TextView mRecipeName;
    @Bind(R.id.recipeDescription) TextView mRecipeDescription;
    @Bind(R.id.recipeImage) ImageView mRecipeImage;
    @Bind(R.id.ingredientsItemsRecyclerView) RecyclerView mIngredientsItemsRecyclerView;
    @Bind(R.id.chatButton) ImageButton chatButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_specific_recipe);
        mChosenRecipe = Variables.chosenRecipe;
        mContext = this.getApplicationContext();

        ButterKnife.bind(this);

        setData();
    }

    private void setData() {
        mRecipeName.setText(mChosenRecipe.getName());
        mRecipeDescription.setText(mChosenRecipe.getDescription());
        mRecipeImage.setImageBitmap(mChosenRecipe.getImageThumbnailBitmap());
        if(mChosenRecipe.getImageId()==0){
            Glide.with(mContext).load(mChosenRecipe.getImageThumbnail()).into(mRecipeImage);
        }else {
            mRecipeImage.setBackground(getDrawable(mChosenRecipe.getImageId()));
        }

        IngredientAdapter adapter = new IngredientAdapter(mChosenRecipe.getRecipeIngredients(),SpecificRecipe.this);
        mIngredientsItemsRecyclerView.setAdapter(adapter);
        mIngredientsItemsRecyclerView.setLayoutManager(new LinearLayoutManager(this));


        findViewById(R.id.viewButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Variables.chosenRecipe = mChosenRecipe;
                Intent i = new Intent(SpecificRecipe.this,SpecificRecipeStepActivity.class);
                startActivity(i);
            }
        });

        chatButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SpecificRecipe.this,ChatActivity.class);
                Variables.chosenRecipe = mChosenRecipe;
                startActivity(i);
            }
        });
    }
}
