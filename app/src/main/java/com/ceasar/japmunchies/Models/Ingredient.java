package com.ceasar.japmunchies.Models;

import android.graphics.Bitmap;

public class Ingredient {
    private String mIngredientName;
    private String mIngredientId;
    private String mIngredientThumbnail;
    private Bitmap mIngredientThumbnailBitmap;
    private int imageId;

    private String imageUrl;

    public Ingredient(){}

    public Ingredient(String name, String id, String imageThumb,Bitmap imageThumbBitmap,int imageId){
        this.mIngredientName = name;
        this.mIngredientId = id;
        this.mIngredientThumbnail = imageThumb;
        this.mIngredientThumbnailBitmap = imageThumbBitmap;
        this.imageId = imageId;
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

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
