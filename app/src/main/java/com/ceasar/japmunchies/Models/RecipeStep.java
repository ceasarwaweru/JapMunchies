package com.ceasar.japmunchies.Models;

import android.graphics.Bitmap;

public class RecipeStep {
    private String mStepExplanation;
    private String mStepThumbnail;
    private Bitmap mStepThumbnailBitmap;
    private int imageId;

    private String imageUrl;


    public RecipeStep(){}

    public RecipeStep(String mStepExplanation, String mStepThumbnail, Bitmap mStepThumbnailBitmap,int imageId){
        this.mStepExplanation = mStepExplanation;
        this.mStepThumbnail = mStepThumbnail;
        this.mStepThumbnailBitmap = mStepThumbnailBitmap;
        this.imageId = imageId;
    }

    public String getStepExplanation() {
        return mStepExplanation;
    }

    public void setStepExplanation(String mStepExplanation) {
        this.mStepExplanation = mStepExplanation;
    }

    public String getStepThumbnail() {
        return mStepThumbnail;
    }

    public void setStepThumbnail(String mStepThumbnail) {
        this.mStepThumbnail = mStepThumbnail;
    }

    public Bitmap getStepThumbnailBitmap() {
        return mStepThumbnailBitmap;
    }

    public void setStepThumbnailBitmap(Bitmap mStepThumbnailBitmap) {
        this.mStepThumbnailBitmap = mStepThumbnailBitmap;
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
