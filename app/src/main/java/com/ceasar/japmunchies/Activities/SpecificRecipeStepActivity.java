package com.ceasar.japmunchies.Activities;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ceasar.japmunchies.Adapters.SpecificRecipeStepFragmentAdapter;
import com.ceasar.japmunchies.Fragments.SpecificRecipeStepFragment;
import com.ceasar.japmunchies.R;
import com.ceasar.japmunchies.Variables;

import butterknife.Bind;
import butterknife.ButterKnife;

public class SpecificRecipeStepActivity extends AppCompatActivity {
    @Bind(R.id.specificRecipeStepViewPager) ViewPager mViewPager;
    private SpecificRecipeStepFragmentAdapter specificRecipeStepFragmentAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_specific_recipe_step);
        ButterKnife.bind(this);

        specificRecipeStepFragmentAdapter = new SpecificRecipeStepFragmentAdapter(getSupportFragmentManager(), Variables.chosenRecipe.getRecipeSteps(),getApplicationContext());
        mViewPager.setAdapter(specificRecipeStepFragmentAdapter);
    }
}
