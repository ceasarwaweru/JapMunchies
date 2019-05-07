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

    public String getmStepExplanation() {
        return mStepExplanation;
    }

    public void setmStepExplanation(String mStepExplanation) {
        this.mStepExplanation = mStepExplanation;
    }

    public String getmStepThumbnail() {
        return mStepThumbnail;
    }

    public void setmStepThumbnail(String mStepThumbnail) {
        this.mStepThumbnail = mStepThumbnail;
    }

    public Bitmap getmStepThumbnailBitmap() {
        return mStepThumbnailBitmap;
    }

    public void setmStepThumbnailBitmap(Bitmap mStepThumbnailBitmap) {
        this.mStepThumbnailBitmap = mStepThumbnailBitmap;
    }
}
