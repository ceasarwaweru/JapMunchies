package com.ceasar.japmunchies.Models;

import android.graphics.Bitmap;

import java.util.ArrayList;
import java.util.List;

public class Recipe {
    private String mImageThumbnail;
    private Bitmap mImageThumbnailBitmap;
    private String mName;
    private String mRecipeId;
    private List<RecipeStep> mRecipeSteps = new ArrayList<>();
    private String mDescription;
    private List<Ingredient> mRecipeIngredients = new ArrayList<>();


    public Recipe(){}

    public Recipe(String imageThumbnail,String name, String recipeId, List<RecipeStep> steps,String Desc, List<Ingredient> ingredients){
        this.mImageThumbnail = imageThumbnail;
        this.mName = name;
        this.mRecipeId = recipeId;
        this.mRecipeSteps = steps;
        this.mDescription = Desc;
        this.mRecipeIngredients = ingredients;
    }


    public String getImageThumbnail() {
        return mImageThumbnail;
    }

    public void setImageThumbnail(String mImageThumbnail) {
        this.mImageThumbnail = mImageThumbnail;
    }

    public Bitmap getImageThumbnailBitmap() {
        return mImageThumbnailBitmap;
    }

    public void setmImageThumbnailBitmap(Bitmap mImageThumbnailBitmap) {
        this.mImageThumbnailBitmap = mImageThumbnailBitmap;
    }

    public String getName() {
        return mName;
    }

    public void setName(String mName) {
        this.mName = mName;
    }

    public String getRecipeId() {
        return mRecipeId;
    }

    public void setRecipeId(String mRecipeId) {
        this.mRecipeId = mRecipeId;
    }

    public List<RecipeStep> getRecipeSteps() {
        return mRecipeSteps;
    }

    public void setmRecipeSteps(List<RecipeStep> mRecipeSteps) {
        this.mRecipeSteps = mRecipeSteps;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String mDescription) {
        this.mDescription = mDescription;
    }

    public List<Ingredient> getRecipeIngredients() {
        return mRecipeIngredients;
    }

    public void setRecipeIngredients(List<Ingredient> mRecipeIngredients) {
        this.mRecipeIngredients = mRecipeIngredients;
    }
}
