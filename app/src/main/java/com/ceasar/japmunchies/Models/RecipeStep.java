package com.ceasar.japmunchies.Models;

import android.graphics.Bitmap;

public class RecipeStep {
    private String mStepExplanation;
    private String mStepThumbnail;
    private Bitmap mStepThumbnailBitmap;


    public RecipeStep(){}

    public RecipeStep(String mStepExplanation, String mStepThumbnail, Bitmap mStepThumbnailBitmap){
        this.mStepExplanation = mStepExplanation;
        this.mStepThumbnail = mStepThumbnail;
        this.mStepThumbnailBitmap = mStepThumbnailBitmap;
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
}
