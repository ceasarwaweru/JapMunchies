package com.ceasar.japmunchies.Adapters;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.ceasar.japmunchies.Activities.SpecificRecipe;
import com.ceasar.japmunchies.Models.Recipe;
import com.ceasar.japmunchies.R;
import com.ceasar.japmunchies.Variables;

import java.util.List;

public class FeaturedRecipeAdapter extends RecyclerView.Adapter<FeaturedRecipeAdapter.ViewHolder> {
    private List<Recipe> mRecipes;
    private Activity mActivity;

    // Pass in the contact array into the constructor
    public FeaturedRecipeAdapter(List<Recipe> recipes, Activity activity) {
        mRecipes = recipes;
        this.mActivity = activity;
    }

    @NonNull
    @Override
    public FeaturedRecipeAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View recipeView = inflater.inflate(R.layout.featured_recipe_list_item, viewGroup, false);
        return new ViewHolder(recipeView);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder viewHolder, int i) {
        final Recipe recipeName = mRecipes.get(i);

        TextView textView = viewHolder.mNameTextView;

//        viewHolder.mRecipeImage.setImageBitmap(recipeName.getImageThumbnailBitmap());
        if(recipeName.getImageId()==0){
            Glide.with(mActivity).load(recipeName.getImageThumbnail()).into(viewHolder.mRecipeImage);
        }else {
            viewHolder.mRecipeImage.setBackground(mActivity.getDrawable(recipeName.getImageId()));
        }
        textView.setText(recipeName.getName());
        viewHolder.mDetailsTextView.setText(recipeName.getDescription());

        viewHolder.recipeCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewHolder.mViewButton.performClick();
            }
        });

        viewHolder.mViewButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Variables.chosenRecipe = recipeName;
                Intent intent = new Intent(mActivity, SpecificRecipe.class);
                mActivity.startActivity(intent);
            }
        });


    }

    @Override
    public int getItemCount() {
        return mRecipes.size();
    }


    class ViewHolder extends RecyclerView.ViewHolder{
       TextView mNameTextView;
       ImageView mRecipeImage;
       Button mViewButton;
       TextView mDetailsTextView;
       CardView recipeCard;

        ViewHolder(View itemView) {
            super(itemView);
            mNameTextView = itemView.findViewById(R.id.nameTextView);
            mRecipeImage = itemView.findViewById(R.id.recipeImage);
            mViewButton = itemView.findViewById(R.id.viewButton);
            mDetailsTextView  = itemView.findViewById(R.id.detailsTextView);
            recipeCard = itemView.findViewById(R.id.recipeCard);
        }
    }

}
