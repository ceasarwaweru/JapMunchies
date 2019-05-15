package com.ceasar.japmunchies.Models;

import android.graphics.Bitmap;

public class Ingredient {
    private String mIngredientName;
    private String mIngredientId;
    private String mIngredientThumbnail;
    private Bitmap mIngredientThumbnailBitmap;

    public Ingredient(){}

    public Ingredient(String name, String id, String imageThumb,Bitmap imageThumbBitmap){
        this.mIngredientName = name;
        this.mIngredientId = id;
        this.mIngredientThumbnail = imageThumb;
        this.mIngredientThumbnailBitmap = imageThumbBitmap;
    }

    public String getIngredientName() {
        return mIngredientName;
    }

    public void setIngredientName(String mIngredientName) {
        this.mIngredientName = mIngredientName;
    }

    public String getIngredientId() {
        return mIngredientId;
    }

    public void setIngredientId(String mIngredientId) {
        this.mIngredientId = mIngredientId;
    }

    public String getIngredientThumbnail() {
        return mIngredientThumbnail;
    }

    public void setIngredientThumbnail(String mIngredientThumbnail) {
        this.mIngredientThumbnail = mIngredientThumbnail;
    }

    public Bitmap getIngredientThumbnailBitmap() {
        return mIngredientThumbnailBitmap;
    }

    public void setIngredientThumbnailBitmap(Bitmap mIngredientThumbnailBitmap) {
        this.mIngredientThumbnailBitmap = mIngredientThumbnailBitmap;
    }
}
