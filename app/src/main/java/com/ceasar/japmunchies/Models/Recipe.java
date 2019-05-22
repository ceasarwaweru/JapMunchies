package com.ceasar.japmunchies.Models;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

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
    private int imageId;


    public Recipe(){}

    public Recipe(String imageThumbnail, Bitmap imageBitmap, String name, String recipeId, List<RecipeStep> steps, String Desc, List<Ingredient> ingredients, int imageId){
        this.mImageThumbnail = imageThumbnail;
        this.mImageThumbnailBitmap = imageBitmap;
        this.mName = name;
        this.mRecipeId = recipeId;
        this.mRecipeSteps = steps;
        this.mDescription = Desc;
        this.mRecipeIngredients = ingredients;
        this.imageId = imageId;
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

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }
}
