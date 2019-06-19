package com.ceasar.japmunchies.Adapters;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.ceasar.japmunchies.Activities.SpecificRecipe;
import com.ceasar.japmunchies.Models.Recipe;
import com.ceasar.japmunchies.R;
import com.ceasar.japmunchies.Variables;

import java.util.List;

public class SuggestionsAdapter extends RecyclerView.Adapter<SuggestionsAdapter.ViewHolder> {
    private List<Recipe> mRecipes;
    private Activity mActivity;

    // Pass in the contact array into the constructor
    public SuggestionsAdapter(List<Recipe> recipes, Activity activity) {
        mRecipes = recipes;
        this.mActivity = activity;
    }

    @NonNull
    @Override
    public SuggestionsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View recipeView = inflater.inflate(R.layout.suggested_item_view, viewGroup, false);
        return new SuggestionsAdapter.ViewHolder(recipeView);
    }

    @Override
    public void onBindViewHolder(@NonNull final SuggestionsAdapter.ViewHolder viewHolder, int i) {
        final Recipe recipeName = mRecipes.get(i);

        TextView name = viewHolder.SuggestedRecipeName;
        ImageView image = viewHolder.SuggestedRecipeImage;

        name.setText(recipeName.getName());

//        viewHolder.mRecipeImage.setImageBitmap(recipeName.getImageThumbnailBitmap());
        if(recipeName.getImageId()==0){
            Glide.with(mActivity).load(recipeName.getImageThumbnail()).apply(RequestOptions.circleCropTransform()).into(image);
        }else {
//            image.setBackground(mActivity.getDrawable(recipeName.getImageId()));
            try {
                Glide.with(mActivity).load(mActivity.getDrawable(recipeName.getImageId()))
                        .apply(new RequestOptions().override(50, 50))
                        .apply(RequestOptions.circleCropTransform()).into(image);
            }catch (Exception e){
                e.printStackTrace();
            }
        }

        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
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
        ImageView SuggestedRecipeImage;
        TextView SuggestedRecipeName;
        ViewHolder(View itemView) {
            super(itemView);
            SuggestedRecipeImage = itemView.findViewById(R.id.SuggestedRecipeImage);
            SuggestedRecipeName = itemView.findViewById(R.id.SuggestedRecipeName);
        }
    }
}
