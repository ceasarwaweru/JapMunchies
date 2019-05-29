package com.ceasar.japmunchies.Adapters;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.ceasar.japmunchies.Fragments.SpecificRecipeStepFragment;
import com.ceasar.japmunchies.Models.Recipe;
import com.ceasar.japmunchies.Models.RecipeStep;

import java.util.List;

public class SpecificRecipeStepFragmentAdapter extends FragmentPagerAdapter {
    private List<RecipeStep> mRecipes;
    private Context mContext;

    public SpecificRecipeStepFragmentAdapter(FragmentManager fm, List<RecipeStep> items, Context context) {
        super(fm);
        mRecipes = items;
        mContext = context;
    }

    @Override
    public int getCount() {
        return mRecipes.size();
    }

    @Override
    public Fragment getItem(int position) {
        return SpecificRecipeStepFragment.newInstance(position,mRecipes,mContext);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return mRecipes.get(position).getStepExplanation();
    }
}
