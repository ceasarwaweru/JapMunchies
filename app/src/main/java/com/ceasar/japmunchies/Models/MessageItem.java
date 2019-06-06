package com.ceasar.japmunchies.Models;

import java.util.Calendar;

public class MessageItem {
    private String mMessageId;
    private String mMessageText;
    private String mSenderUId;
    private String mSenderName;
    private String mImage;
    private MyTime mSendingTime;
    private String mRecipeId;

    public MessageItem(){}

    public MessageItem(String messageId, String messageText, String Senderuid, String senderName, String image, String recipeId){
        this.mMessageId = messageId;
        this.mMessageText = messageText;
        this.mSenderUId = Senderuid;
        this.mSenderName = senderName;
        this.mImage = image;
        this.mSendingTime = new MyTime(Calendar.getInstance());
        this.mRecipeId = recipeId;
    }


    public String getmMessageId() {
        return mMessageId;
    }

    public void setmMessageId(String mMessageId) {
        this.mMessageId = mMessageId;
    }

    public String getmMessageText() {
        return mMessageText;
    }

    public void setmMessageText(String mMessageText) {
        this.mMessageText = mMessageText;
    }

    public String getmSenderUId() {
        return mSenderUId;
    }

    public void setmSenderUId(String mSenderUId) {
        this.mSenderUId = mSenderUId;
    }

    public String getmImage() {
        return mImage;
    }

    public void setmImage(String mImage) {
        this.mImage = mImage;
    }

    public MyTime getmSendingTime() {
        return mSendingTime;
    }

    public void setmSendingTime(MyTime mSendingTime) {
        this.mSendingTime = mSendingTime;
    }

    public String getmRecipeId() {
        return mRecipeId;
    }

    public void setmRecipeId(String mRecipeId) {
        this.mRecipeId = mRecipeId;
    }

    public String getmSenderName() {
        return mSenderName;
    }

    public void setmSenderName(String mSenderName) {
        this.mSenderName = mSenderName;
    }
}
