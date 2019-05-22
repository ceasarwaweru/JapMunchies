package com.ceasar.japmunchies.Activities;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.ceasar.japmunchies.Adapters.FeaturedRecipeAdapter;
import com.ceasar.japmunchies.Models.Recipe;
import com.ceasar.japmunchies.R;
import com.ceasar.japmunchies.Services.DatabaseManager;
import com.ceasar.japmunchies.Variables;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContext = this.getApplicationContext();
        addFeaturedItems();
    }

    private void addFeaturedItems() {
        RecyclerView rvContacts = findViewById(R.id.featuredItemsRecyclerView);

        List<Recipe> recipeNames= new DatabaseManager(mContext).createTestRecipes();
        FeaturedRecipeAdapter adapter = new FeaturedRecipeAdapter(recipeNames,MainActivity.this);
        rvContacts.setAdapter(adapter);
        rvContacts.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    public void onClick(View v) {

    }
}
