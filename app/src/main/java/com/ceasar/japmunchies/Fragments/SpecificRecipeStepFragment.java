package com.ceasar.japmunchies.Fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.ceasar.japmunchies.Models.Recipe;
import com.ceasar.japmunchies.Models.RecipeStep;
import com.ceasar.japmunchies.R;

import java.util.List;

public class SpecificRecipeStepFragment extends Fragment {
    public static final String ARG_PAGE = "ARG_PAGE";
    public static final String ARG_NAME = "ARG_NAME";
    private int mPage;
    private String mPageName;
    private RecipeStep mRecipeStep;
    private Context mContext;

    public static SpecificRecipeStepFragment newInstance(int page, List<RecipeStep> mRecipes, Context context) {
        Bundle args = new Bundle();
        args.putInt(ARG_PAGE, page);
        args.putString(ARG_NAME,mRecipes.get(page).getStepExplanation());
        SpecificRecipeStepFragment fragment = new SpecificRecipeStepFragment();
        fragment.SetStep(mRecipes.get(page));
        fragment.setContext(context);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPage = getArguments().getInt(ARG_PAGE);
        mPageName = getArguments().getString(ARG_NAME);
    }

    public void SetStep(RecipeStep step){
        this.mRecipeStep = step;
    }

    private void setContext(Context context){
        this.mContext = context;
    }

    // Inflate the fragment layout we defined above for this fragment
    // Set the associated text for the title
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.specific_recipe_step_fragment, container, false);

        TextView textPart= view.findViewById(R.id.title);
        textPart.setText(""+mPageName);

        ImageView image =  view.findViewById(R.id.recipeImage);
//        image.setImageBitmap(mRecipeStep.getStepThumbnailBitmap());
        if(mRecipeStep.getImageId()==0){
            Glide.with(mContext).load(mRecipeStep.getStepThumbnail()).into(image);
        }else {
            image.setBackground(mContext.getDrawable(mRecipeStep.getImageId()));
        }

        return view;
    }
}
