package com.ceasar.japmunchies.Services;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import com.ceasar.japmunchies.Models.Ingredient;
import com.ceasar.japmunchies.Models.Recipe;
import com.ceasar.japmunchies.Models.RecipeStep;
import com.ceasar.japmunchies.R;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DatabaseManager {
    private Context mContext;

    public DatabaseManager(Context context){
        this.mContext = context;
    }

    public List<Recipe> createTestRecipes(){
        List<Recipe> myRecipes = new ArrayList<>();
        RecipeStep step = new RecipeStep("Cut cucumbers in half lengthwise and scoop out any large seeds. " +
                "Slice crosswise into very thin slices","",null,R.drawable.cut_cucumber);
        RecipeStep step2 = new RecipeStep("In a small bowl combine vinegar, sugar, salt and ginger. Mix well. Place cucumbers inside of the bowl, stir so that " +
                "cucumbers are coated with the mixture. Refrigerate the bowl of cucumbers for at least 1 hour before serving.","",
                null,R.drawable.combine_salt_vinegar_sugar);


        Ingredient ingredient = new Ingredient("2 large cucumbers, peeled","1","",null,R.drawable.peeled_cucumber);
        Ingredient ingredient2 = new Ingredient("1 teaspoon salt","2","",null,R.drawable.rice_vinegar);
        Ingredient ingredient3 = new Ingredient("1/3 cup rice vinegar","3","",null,R.drawable.teaspoon_salt);

        List<RecipeStep>steps = new ArrayList<>(Arrays.asList(step,step2));
        List<Ingredient> ingredients = new ArrayList<>(Arrays.asList(ingredient,ingredient2,ingredient3));

        String desc = "A Japanese recipe for cucumbers marinated in vinegar, sugar, salt and ginger. Delicious and simple!";

        Recipe myRecipe = new Recipe("",null,
                "Cucumber Sunomono","1",steps,desc,ingredients,R.drawable.cucumber_sunomono);
        myRecipes.add(myRecipe);


        return myRecipes;
    }

    private Bitmap loadBitmapFromResource(int resId){
        return getResizedBitmap(BitmapFactory.decodeResource(mContext.getResources(),resId),50);
    }

    private static Bitmap getResizedBitmap(Bitmap image, int maxSize) {
        int width = image.getWidth();
        int height = image.getHeight();

        float bitmapRatio = (float) width / (float) height;
        if (bitmapRatio > 1) {
            width = maxSize;
            height = (int) (width / bitmapRatio);
        } else {
            height = maxSize;
            width = (int) (height * bitmapRatio);
        }

        return Bitmap.createScaledBitmap(image, width, height, true);
    }

}
