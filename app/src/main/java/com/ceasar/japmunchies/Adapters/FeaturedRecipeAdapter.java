package com.ceasar.japmunchies.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.ceasar.japmunchies.R;

import java.util.List;

public class FeaturedRecipeAdapter extends RecyclerView.Adapter<FeaturedRecipeAdapter.ViewHolder> {
    private List<String> mRecipes;

    // Pass in the contact array into the constructor
    public FeaturedRecipeAdapter(List<String> recipes) {
        mRecipes = recipes;
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
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        String recipeName = mRecipes.get(i);

        TextView textView = viewHolder.mNameTextView;
        textView.setText(recipeName);
    }

    @Override
    public int getItemCount() {
        return mRecipes.size();
    }


    class ViewHolder extends RecyclerView.ViewHolder{
       TextView mNameTextView;

        ViewHolder(View itemView) {
            super(itemView);
            mNameTextView = itemView.findViewById(R.id.nameTextView);
        }
    }

}
