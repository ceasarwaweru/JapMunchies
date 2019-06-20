package com.ceasar.japmunchies.Adapters;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.ceasar.japmunchies.Models.Ingredient;
import com.ceasar.japmunchies.Models.Recipe;
import com.ceasar.japmunchies.R;

import java.util.List;

public class IngredientAdapter extends RecyclerView.Adapter<IngredientAdapter.ViewHolder>  {
    private List<Ingredient> mRecipeIngredients;
    private Activity mActivity;


    public IngredientAdapter(List<Ingredient> recipeIngredients, Activity activity) {
        mRecipeIngredients = recipeIngredients;
        this.mActivity = activity;
    }

    @NonNull
    @Override
    public IngredientAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View recipeView = inflater.inflate(R.layout.ingredient_list_item, viewGroup, false);
        return new IngredientAdapter.ViewHolder(recipeView);
    }

    @Override
    public void onBindViewHolder(@NonNull IngredientAdapter.ViewHolder viewHolder, int i) {
        final Ingredient ingredient = mRecipeIngredients.get(i);

        viewHolder.ingredientName.setText(ingredient.getIngredientName());
//        viewHolder.ingredientImage.setImageBitmap(ingredient.getIngredientThumbnailBitmap());
//        viewHolder.ingredientImage.setBackground(mActivity.getDrawable(ingredient.getImageId()));

        if(ingredient.getImageId()==0){
            Glide.with(mActivity).load(ingredient.getIngredientThumbnail()).apply(new RequestOptions().override(50, 50))
                    .apply(RequestOptions.circleCropTransform()).into(viewHolder.ingredientImage);
        }
    }

    @Override
    public int getItemCount() {
        return mRecipeIngredients.size();
    }


    class ViewHolder extends RecyclerView.ViewHolder{
        ImageView ingredientImage;
        TextView ingredientName;
        ViewHolder(View itemView) {
            super(itemView);
            ingredientName = itemView.findViewById(R.id.ingredientName);
            ingredientImage = itemView.findViewById(R.id.ingredientImage);
        }
    }

}
