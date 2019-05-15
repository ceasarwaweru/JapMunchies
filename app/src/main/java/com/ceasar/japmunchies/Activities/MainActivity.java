package com.ceasar.japmunchies.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.ceasar.japmunchies.Adapters.FeaturedRecipeAdapter;
import com.ceasar.japmunchies.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addFeaturedItems();
    }

    private void addFeaturedItems() {
        RecyclerView rvContacts = findViewById(R.id.featuredItemsRecyclerView);

        List<String> recipeNames= new ArrayList<>(Arrays.asList("Food 1","Food 2","Food 3","Food 4","Food 5","Food 6","Food 7"));
        FeaturedRecipeAdapter adapter = new FeaturedRecipeAdapter(recipeNames);
        rvContacts.setAdapter(adapter);
        rvContacts.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    public void onClick(View v) {

    }
}
