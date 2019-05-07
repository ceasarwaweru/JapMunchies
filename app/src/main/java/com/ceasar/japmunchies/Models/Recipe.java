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


    public String getmImageThumbnail() {
        return mImageThumbnail;
    }

    public void setmImageThumbnail(String mImageThumbnail) {
        this.mImageThumbnail = mImageThumbnail;
    }

    public Bitmap getmImageThumbnailBitmap() {
        return mImageThumbnailBitmap;
    }

    public void setmImageThumbnailBitmap(Bitmap mImageThumbnailBitmap) {
        this.mImageThumbnailBitmap = mImageThumbnailBitmap;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmRecipeId() {
        return mRecipeId;
    }

    public void setmRecipeId(String mRecipeId) {
        this.mRecipeId = mRecipeId;
    }

    public List<RecipeStep> getmRecipeSteps() {
        return mRecipeSteps;
    }

    public void setmRecipeSteps(List<RecipeStep> mRecipeSteps) {
        this.mRecipeSteps = mRecipeSteps;
    }

    public String getmDescription() {
        return mDescription;
    }

    public void setmDescription(String mDescription) {
        this.mDescription = mDescription;
    }

    public List<Ingredient> getmRecipeIngredients() {
        return mRecipeIngredients;
    }

    public void setmRecipeIngredients(List<Ingredient> mRecipeIngredients) {
        this.mRecipeIngredients = mRecipeIngredients;
    }
}
