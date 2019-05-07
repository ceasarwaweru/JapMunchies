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

    public String getmIngredientName() {
        return mIngredientName;
    }

    public void setmIngredientName(String mIngredientName) {
        this.mIngredientName = mIngredientName;
    }

    public String getmIngredientId() {
        return mIngredientId;
    }

    public void setmIngredientId(String mIngredientId) {
        this.mIngredientId = mIngredientId;
    }

    public String getmIngredientThumbnail() {
        return mIngredientThumbnail;
    }

    public void setmIngredientThumbnail(String mIngredientThumbnail) {
        this.mIngredientThumbnail = mIngredientThumbnail;
    }

    public Bitmap getmIngredientThumbnailBitmap() {
        return mIngredientThumbnailBitmap;
    }

    public void setmIngredientThumbnailBitmap(Bitmap mIngredientThumbnailBitmap) {
        this.mIngredientThumbnailBitmap = mIngredientThumbnailBitmap;
    }
}
