package com.ceasar.japmunchies.Services;

import android.content.Context;
import android.content.SharedPreferences;

import static android.content.Context.MODE_PRIVATE;

public class SharedPreferenceManager {
    private Context mContext;
    private final String Avatar = "AVATAR";
    private final String Name = "NAME";
    private final String Email = "EMAIL";
    private final String Phone = "PHONE_NO";
    private final String Gender = "GENDER";

    public SharedPreferenceManager(Context context){
        this.mContext = context;
    }

    public void setAvatar(String uri){
        SharedPreferences pref = mContext.getSharedPreferences(Avatar, MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        editor.clear().putString(Avatar, uri).apply();
    }

    public String loadAvatar(){
        SharedPreferences prefs = mContext.getSharedPreferences(Avatar, MODE_PRIVATE);
        return prefs.getString(Avatar, "");
    }

    public void setNameInSharedPref(String name){
        SharedPreferences pref = mContext.getSharedPreferences(Name, MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        editor.clear().putString(Name, name).apply();
    }

    public String loadNameInSharedPref(){
        SharedPreferences prefs = mContext.getSharedPreferences(Name, MODE_PRIVATE);
        return prefs.getString(Name, "");
    }

    public void setEmailInSharedPref(String email){
        SharedPreferences pref = mContext.getSharedPreferences(Email, MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        editor.clear().putString(Email, email).apply();
    }

    public String loadEmailInSharedPref(){
        SharedPreferences prefs = mContext.getSharedPreferences(Email, MODE_PRIVATE);
        return prefs.getString(Email, "");
    }

    public void setPhoneInSharedPref(String phoneNo){
        SharedPreferences pref = mContext.getSharedPreferences(Phone, MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        editor.clear().putString(Phone, phoneNo).apply();
    }

    public String loadPhoneInSharedPref(){
        SharedPreferences prefs = mContext.getSharedPreferences(Phone, MODE_PRIVATE);
        return prefs.getString(Phone, "");
    }

    public void setGenderInSharedPref(String gender){
        SharedPreferences pref = mContext.getSharedPreferences(Gender, MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        editor.clear().putString(Gender, gender).apply();
    }

    public String loadGenderInSharedPref(){
        SharedPreferences prefs = mContext.getSharedPreferences(Gender, MODE_PRIVATE);
        return prefs.getString(Gender, "");
    }
}
