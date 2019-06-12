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


        //
        RecipeStep stepB = new RecipeStep("In a large skillet combine sesame oil, canola oil and chili paste; stir-fry 30 seconds. Add garlic and stir fry an additional 30 seconds. Add chicken and 1/4 cup of " +
                "the soy sauce and stir fry until chicken is no longer pink, about 5 minutes. Remove mixture from pan, set aside, and keep warm.",
                "https://proxy.duckduckgo.com/iu/?u=https%3A%2F%2Fgriffinsgrub.files.wordpress.com%2F2012%2F08%2Fp1040896a.jpg&f=1",null,0);
        RecipeStep stepB2 = new RecipeStep("In the emptied pan combine the onion, cabbage, and carrots. Stir-fry until cabbage begins to wilt, 2 to 3 minutes. Stir in the remaining soy sauce, cooked noodles, and the " +
                "chicken mixture to pan and mix to blend. Serve and enjoy!","https://proxy.duckduckgo.com/iu/?u=http%3A%2F%2F2.bp.blogspot.com%2F-kw7fp5n-kwY%2FUxbO7M9BCZI%2FAAAAAAAAA-s%2F0znfbdyfNr4%2Fs1600%2FIMG_6252.JPG&f=1",
                null,0);


        Ingredient ingredientB = new Ingredient("1/2 teaspoon sesame oil","1","https://proxy.duckduckgo.com/iu/?u=http%3A%2F%2Fwww.simplyscratch.com%2Fwp-content%2Fuploads%2F2014%2F05%2FKorean-BBQ-Chicken-l-www.SimplyScratch.com-sesame-oil.jpg&f=1",null,0);
        Ingredient ingredientB2 = new Ingredient("1 tablespoon canola oil","2","https://proxy.duckduckgo.com/iu/?u=https%3A%2F%2Fmedia.swansonvitamins.com%2Fimages%2Fitems%2Fmaster%2FSP046.png&f=1",null, 0);
        Ingredient ingredientB3 = new Ingredient("2 tablespoons chile paste","3","http://2.bp.blogspot.com/-dbv0FXyyze4/TmkJJeDdUMI/AAAAAAAAA1g/tRDWal-CCHI/s1600/chili%2Bpaste.JPG",null,0);
        Ingredient ingredientB4 = new Ingredient("2 cloves garlic, chopped","3","http://parlordiary.com/wp-content/uploads/2014/10/dahl-2-of-7.jpg",null,0);
        Ingredient ingredientB5 = new Ingredient("4 skinless, boneless chicken breast halves - cut into 1 inch cubes","3","https://www.101cookingfortwo.com/wp-content/uploads/2016/08/cube-chicken.jpg",null,0);
        Ingredient ingredientB6 = new Ingredient("1/2 cup soy sauce","3","http://dishinanddishes.com/wp-content/uploads/2010/01/soy.jpg",null,0);
        Ingredient ingredientB7 = new Ingredient("1 onion, sliced lengthwise into eighths","3","https://www.veggie-quest.com/wp-content/uploads/2011/02/Julienne-Onion-Final2_SHR.jpg?x38121",null,0);
        Ingredient ingredientB8 = new Ingredient("1/2 medium head cabbage, coarsely chopped","3","https://proxy.duckduckgo.com/iu/?u=https%3A%2F%2F4.bp.blogspot.com%2F_s--n1TR94Vs%2FTMTCh5BKvFI%2FAAAAAAAAQLA%2FPXEsC-D2Q1U%2Fs400%2Fspicy-lime-coleslaw-1-kalynskitchen.jpg&f=1",null,0);

        List<RecipeStep>stepsB = new ArrayList<>(Arrays.asList(stepB,stepB2));
        List<Ingredient> ingredientsB = new ArrayList<>(Arrays.asList(ingredientB,ingredientB2,ingredientB3,ingredientB4,ingredientB5,ingredientB6,ingredientB7,ingredientB8));

        String descB = "Japanese buckwheat flour noodles with chicken at their best! Noodles can be found in an Asian foods market.";

        Recipe myRecipeB = new Recipe("https://images.media-allrecipes.com/userphotos/600x600/2220105.jpg",null,
                "Yakisoba Chicken","1",stepsB,descB,ingredientsB,0);
        myRecipes.add(myRecipeB);
        myRecipes.add(myRecipe);
        myRecipes.add(myRecipeB);


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
