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


        //a new recipe

        RecipeStep stepC = new RecipeStep("Cut the chicken up into bite-sized pieces. In a bowl, whisk the soy sauce, sake, honey and ginger together. Then add the chicken. Marinate for atleast 30 minutes." +
                "Slice crosswise into very thin slices","",null,R.drawable.cut_cucumber);
        RecipeStep stepC2 = new RecipeStep(" Heat a frying pan over medium heat until hot" +
                "continue","",
                null,R.drawable.combine_salt_vinegar_sugar);



        Ingredient ingredientC = new Ingredient("2 large cucumbers, peeled","1","",null,R.drawable.peeled_cucumber);
        Ingredient ingredientC2 = new Ingredient("1 teaspoon salt","2","",null,R.drawable.rice_vinegar);
        Ingredient ingredientC3 = new Ingredient("1/3 cup rice vinegar","3","",null,R.drawable.teaspoon_salt);

        List<RecipeStep>stepsC = new ArrayList<>(Arrays.asList(stepC,stepC2));
        List<Ingredient> ingredientsC = new ArrayList<>(Arrays.asList(ingredientC,ingredientC2,ingredientC3));

        String descC = "Japanese Ginger Chicken, finger licking experience!";

        Recipe myRecipeChicken = new Recipe("",null,
                "Japanese Ginger Chicken","1",stepsC,descC,ingredientsC,R.drawable.ginger_chicken);
        myRecipes.add(myRecipeChicken);
        //another one

        //a new recipe

        RecipeStep stepD = new RecipeStep("Do some 1 2 3 sake" +
                "Then some  3 4 5","",null,R.drawable.cut_cucumber);
        RecipeStep stepD2 = new RecipeStep(" Cooking is awesome" +
                "continue","",
                null,R.drawable.combine_salt_vinegar_sugar);
        RecipeStep stepD3 = new RecipeStep("Do some 1 2 3 sake" +
                "Then some  3 4 5","",null,R.drawable.cut_cucumber);
        RecipeStep stepD4 = new RecipeStep(" Cooking is awesome" +
                "continue","",
                null,R.drawable.combine_salt_vinegar_sugar);


        Ingredient ingredientD = new Ingredient("2 large cucumbers, peeled","1","",null,R.drawable.peeled_cucumber);
        Ingredient ingredientD2 = new Ingredient("1 teaspoon salt","2","",null,R.drawable.rice_vinegar);
        Ingredient ingredientD3 = new Ingredient("1/3 cup rice vinegar","3","",null,R.drawable.teaspoon_salt);
        Ingredient ingredientD4 = new Ingredient("2 large cucumbers, peeled","1","",null,R.drawable.peeled_cucumber);
        Ingredient ingredientD5 = new Ingredient("1 teaspoon salt","2","",null,R.drawable.rice_vinegar);
        Ingredient ingredientD6 = new Ingredient("1/3 cup rice vinegar","3","",null,R.drawable.teaspoon_salt);

        List<RecipeStep>stepsD= new ArrayList<>(Arrays.asList(stepD,stepD2,stepD3,stepD4));
        List<Ingredient> ingredientsD = new ArrayList<>(Arrays.asList(ingredientD,ingredientD2,ingredientD3,ingredientD4,ingredientD5,ingredientD6));

        String descD = "Julie's food blaah!";

        Recipe myRecipeD = new Recipe("",null,
                "Julie rec","1",stepsD,descD,ingredientsD,R.drawable.ginger_chicken);
        myRecipes.add(myRecipeD);
        //another one

        //a new recipe

        RecipeStep stepE = new RecipeStep("Do some 1 2 3 sake" +
                "Then some  3 4 5","",null,R.drawable.cut_cucumber);
        RecipeStep stepE2 = new RecipeStep(" Cooking is awesome" +
                "continue","",
                null,R.drawable.combine_salt_vinegar_sugar);
        RecipeStep stepE3 = new RecipeStep("Do some 1 2 3 sake" +
                "Then some  3 4 5","",null,R.drawable.cut_cucumber);
        RecipeStep stepE4 = new RecipeStep(" Cooking is awesome" +
                "continue","",
                null,R.drawable.combine_salt_vinegar_sugar);


        Ingredient ingredientE = new Ingredient("2 large cucumbers, peeled","1","",null,R.drawable.peeled_cucumber);
        Ingredient ingredientE2 = new Ingredient("1 teaspoon salt","2","",null,R.drawable.rice_vinegar);
        Ingredient ingredientE3 = new Ingredient("1/3 cup rice vinegar","3","",null,R.drawable.teaspoon_salt);
        Ingredient ingredientE4 = new Ingredient("2 large cucumbers, peeled","1","",null,R.drawable.peeled_cucumber);
        Ingredient ingredientE5 = new Ingredient("1 teaspoon salt","2","",null,R.drawable.rice_vinegar);
        Ingredient ingredientE6 = new Ingredient("1/3 cup rice vinegar","3","",null,R.drawable.teaspoon_salt);

        List<RecipeStep>stepsE= new ArrayList<>(Arrays.asList(stepE,stepE2,stepE3,stepE4));
        List<Ingredient> ingredientsE = new ArrayList<>(Arrays.asList(ingredientE,ingredientE2,ingredientE3,ingredientE4,ingredientE5,ingredientE6));

        String descE = "CZA's food blaah!";

        Recipe myRecipeE = new Recipe("",null,
                "CZA rec","1",stepsE,descE,ingredientsE,R.drawable.ginger_chicken);
        myRecipes.add(myRecipeE);
        //another one

        //a new recipe

        RecipeStep stepF = new RecipeStep("Do some 1 2 3 sake" +
                "Then some  3 4 5","",null,R.drawable.cut_cucumber);
        RecipeStep stepF2 = new RecipeStep(" Cooking is awesome" +
                "continue","",
                null,R.drawable.combine_salt_vinegar_sugar);
        RecipeStep stepF3 = new RecipeStep("Do some 1 2 3 sake" +
                "Then some  3 4 5","",null,R.drawable.cut_cucumber);
        RecipeStep stepF4 = new RecipeStep(" Cooking is awesome" +
                "continue","",
                null,R.drawable.combine_salt_vinegar_sugar);


        Ingredient ingredientF = new Ingredient("2 large cucumbers, peeled","1","",null,R.drawable.peeled_cucumber);
        Ingredient ingredientF2 = new Ingredient("1 teaspoon salt","2","",null,R.drawable.rice_vinegar);
        Ingredient ingredientF3 = new Ingredient("1/3 cup rice vinegar","3","",null,R.drawable.teaspoon_salt);
        Ingredient ingredientF4 = new Ingredient("2 large cucumbers, peeled","1","",null,R.drawable.peeled_cucumber);
        Ingredient ingredientF5 = new Ingredient("1 teaspoon salt","2","",null,R.drawable.rice_vinegar);
        Ingredient ingredientF6 = new Ingredient("1/3 cup rice vinegar","3","",null,R.drawable.teaspoon_salt);

        List<RecipeStep>stepsF= new ArrayList<>(Arrays.asList(stepF,stepF2,stepF3,stepF3,stepF4));
        List<Ingredient> ingredientsF = new ArrayList<>(Arrays.asList(ingredientF,ingredientF2,ingredientF3,ingredientF4,ingredientF5,ingredientF6));

        String descF = "KIMUTAI's food blaah!";

        Recipe myRecipeF = new Recipe("",null,
                "KIMUTAI rec","1",stepsF,descF,ingredientsF,R.drawable.ginger_chicken);
        myRecipes.add(myRecipeF);
        //another one

        //a new recipe

        RecipeStep stepG = new RecipeStep("Do some 1 2 3 sake" +
                "Then some  3 4 5","",null,R.drawable.cut_cucumber);
        RecipeStep stepG2 = new RecipeStep(" Cooking is awesome" +
                "continue","",
                null,R.drawable.combine_salt_vinegar_sugar);
        RecipeStep stepG3 = new RecipeStep("Do some 1 2 3 sake" +
                "Then some  3 4 5","",null,R.drawable.cut_cucumber);
        RecipeStep stepG4 = new RecipeStep(" Cooking is awesome" +
                "continue","",
                null,R.drawable.combine_salt_vinegar_sugar);


        Ingredient ingredientG = new Ingredient("2 large cucumbers, peeled","1","",null,R.drawable.peeled_cucumber);
        Ingredient ingredientG2 = new Ingredient("1 teaspoon salt","2","",null,R.drawable.rice_vinegar);
        Ingredient ingredientG3 = new Ingredient("1/3 cup rice vinegar","3","",null,R.drawable.teaspoon_salt);
        Ingredient ingredientG4 = new Ingredient("2 large cucumbers, peeled","1","",null,R.drawable.peeled_cucumber);
        Ingredient ingredientG5 = new Ingredient("1 teaspoon salt","2","",null,R.drawable.rice_vinegar);
        Ingredient ingredientG6 = new Ingredient("1/3 cup rice vinegar","3","",null,R.drawable.teaspoon_salt);

        List<RecipeStep>stepsG= new ArrayList<>(Arrays.asList(stepG,stepG2,stepG3,stepG4));
        List<Ingredient> ingredientsG = new ArrayList<>(Arrays.asList(ingredientG,ingredientG2,ingredientG3,ingredientG4,ingredientG5,ingredientG6));

        String descG = "BRY's food blaah!";

        Recipe myRecipeG = new Recipe("",null,
                "BRY rec","1",stepsG,descG,ingredientsG,R.drawable.ginger_chicken);
        myRecipes.add(myRecipeG);
        //another one
        //a new recipe

        RecipeStep stepH = new RecipeStep("Do some 1 2 3 sake" +
                "Then some  3 4 5","",null,R.drawable.cut_cucumber);
        RecipeStep stepH2 = new RecipeStep(" Cooking is awesome" +
                "continue","",
                null,R.drawable.combine_salt_vinegar_sugar);
        RecipeStep stepH3 = new RecipeStep("Do some 1 2 3 sake" +
                "Then some  3 4 5","",null,R.drawable.cut_cucumber);
        RecipeStep stepH4 = new RecipeStep(" Cooking is awesome" +
                "continue","",
                null,R.drawable.combine_salt_vinegar_sugar);


        Ingredient ingredientH = new Ingredient("2 large cucumbers, peeled","1","",null,R.drawable.peeled_cucumber);
        Ingredient ingredientH2 = new Ingredient("1 teaspoon salt","2","",null,R.drawable.rice_vinegar);
        Ingredient ingredientH3 = new Ingredient("1/3 cup rice vinegar","3","",null,R.drawable.teaspoon_salt);
        Ingredient ingredientH4 = new Ingredient("2 large cucumbers, peeled","1","",null,R.drawable.peeled_cucumber);
        Ingredient ingredientH5 = new Ingredient("1 teaspoon salt","2","",null,R.drawable.rice_vinegar);
        Ingredient ingredientH6 = new Ingredient("1/3 cup rice vinegar","3","",null,R.drawable.teaspoon_salt);

        List<RecipeStep>stepsH= new ArrayList<>(Arrays.asList(stepH,stepH2,stepH3,stepH4));
        List<Ingredient> ingredientsH = new ArrayList<>(Arrays.asList(ingredientH,ingredientH2,ingredientH3,ingredientH4,ingredientH5,ingredientH6));

        String descH = "SOLO's food blaah!";

        Recipe myRecipeH = new Recipe("",null,
                "SOLO rec","1",stepsH,descH,ingredientsH,R.drawable.ginger_chicken);
        myRecipes.add(myRecipeH);
        //another one
        //a new recipe

        RecipeStep stepI = new RecipeStep("Do some 1 2 3 sake" +
                "Then some  3 4 5","",null,R.drawable.cut_cucumber);
        RecipeStep stepI2 = new RecipeStep(" Cooking is awesome" +
                "continue","",
                null,R.drawable.combine_salt_vinegar_sugar);
        RecipeStep stepI3 = new RecipeStep("Do some 1 2 3 sake" +
                "Then some  3 4 5","",null,R.drawable.cut_cucumber);
        RecipeStep stepI4 = new RecipeStep(" Cooking is awesome" +
                "continue","",
                null,R.drawable.combine_salt_vinegar_sugar);


        Ingredient ingredientI = new Ingredient("2 large cucumbers, peeled","1","",null,R.drawable.peeled_cucumber);
        Ingredient ingredientI2 = new Ingredient("1 teaspoon salt","2","",null,R.drawable.rice_vinegar);
        Ingredient ingredientI3 = new Ingredient("1/3 cup rice vinegar","3","",null,R.drawable.teaspoon_salt);
        Ingredient ingredientI4 = new Ingredient("2 large cucumbers, peeled","1","",null,R.drawable.peeled_cucumber);
        Ingredient ingredientI5 = new Ingredient("1 teaspoon salt","2","",null,R.drawable.rice_vinegar);
        Ingredient ingredientI6 = new Ingredient("1/3 cup rice vinegar","3","",null,R.drawable.teaspoon_salt);

        List<RecipeStep>stepsI= new ArrayList<>(Arrays.asList(stepI,stepI2,stepI3,stepI4));
        List<Ingredient> ingredientsI = new ArrayList<>(Arrays.asList(ingredientI,ingredientI2,ingredientI3,ingredientI4,ingredientI5,ingredientI6));

        String descI = "NJERI's food blaah!";

        Recipe myRecipeI = new Recipe("",null,
                "NJERI rec","1",stepsI,descI,ingredientsI,R.drawable.ginger_chicken);
        myRecipes.add(myRecipeI);
        //another one
        //a new recipe

        RecipeStep stepJ = new RecipeStep("Do some 1 2 3 sake" +
                "Then some  3 4 5","",null,R.drawable.cut_cucumber);
        RecipeStep stepJ2 = new RecipeStep(" Cooking is awesome" +
                "continue","",
                null,R.drawable.combine_salt_vinegar_sugar);
        RecipeStep stepJ3 = new RecipeStep("Do some 1 2 3 sake" +
                "Then some  3 4 5","",null,R.drawable.cut_cucumber);
        RecipeStep stepJ4 = new RecipeStep(" Cooking is awesome" +
                "continue","",
                null,R.drawable.combine_salt_vinegar_sugar);


        Ingredient ingredientJ = new Ingredient("2 large cucumbers, peeled","1","",null,R.drawable.peeled_cucumber);
        Ingredient ingredientJ2 = new Ingredient("1 teaspoon salt","2","",null,R.drawable.rice_vinegar);
        Ingredient ingredientJ3 = new Ingredient("1/3 cup rice vinegar","3","",null,R.drawable.teaspoon_salt);
        Ingredient ingredientJ4 = new Ingredient("2 large cucumbers, peeled","1","",null,R.drawable.peeled_cucumber);
        Ingredient ingredientJ5 = new Ingredient("1 teaspoon salt","2","",null,R.drawable.rice_vinegar);
        Ingredient ingredientJ6 = new Ingredient("1/3 cup rice vinegar","3","",null,R.drawable.teaspoon_salt);

        List<RecipeStep>stepsJ= new ArrayList<>(Arrays.asList(stepJ,stepJ2,stepJ3,stepJ4));
        List<Ingredient> ingredientsJ = new ArrayList<>(Arrays.asList(ingredientJ,ingredientJ2,ingredientJ3,ingredientJ4,ingredientJ5,ingredientJ6));

        String descJ = "MUNYUI's food blaah!";

        Recipe myRecipeJ = new Recipe("",null,
                "MUNYUI rec","1",stepsJ,descJ,ingredientsJ,R.drawable.ginger_chicken);
        myRecipes.add(myRecipeJ);
        //another one
        //a new recipe

        RecipeStep stepK = new RecipeStep("Do some 1 2 3 sake" +
                "Then some  3 4 5","",null,R.drawable.cut_cucumber);
        RecipeStep stepK2 = new RecipeStep(" Cooking is awesome" +
                "continue","",
                null,R.drawable.combine_salt_vinegar_sugar);
        RecipeStep stepK3 = new RecipeStep("Do some 1 2 3 sake" +
                "Then some  3 4 5","",null,R.drawable.cut_cucumber);
        RecipeStep stepK4 = new RecipeStep(" Cooking is awesome" +
                "continue","",
                null,R.drawable.combine_salt_vinegar_sugar);


        Ingredient ingredientK = new Ingredient("2 large cucumbers, peeled","1","",null,R.drawable.peeled_cucumber);
        Ingredient ingredientK2 = new Ingredient("1 teaspoon salt","2","",null,R.drawable.rice_vinegar);
        Ingredient ingredientK3 = new Ingredient("1/3 cup rice vinegar","3","",null,R.drawable.teaspoon_salt);
        Ingredient ingredientK4 = new Ingredient("2 large cucumbers, peeled","1","",null,R.drawable.peeled_cucumber);
        Ingredient ingredientK5 = new Ingredient("1 teaspoon salt","2","",null,R.drawable.rice_vinegar);
        Ingredient ingredientK6 = new Ingredient("1/3 cup rice vinegar","3","",null,R.drawable.teaspoon_salt);

        List<RecipeStep>stepsK= new ArrayList<>(Arrays.asList(stepK,stepK2,stepK3,stepK4));
        List<Ingredient> ingredientsK = new ArrayList<>(Arrays.asList(ingredientK,ingredientK2,ingredientK3,ingredientK4,ingredientK5,ingredientK6));

        String descK = "SENORITA's food blaah!";

        Recipe myRecipeK = new Recipe("",null,
                "SENORITA rec","1",stepsK,descK,ingredientsK,R.drawable.ginger_chicken);
        myRecipes.add(myRecipeK);
        //another one
        //a new recipe

        RecipeStep stepL = new RecipeStep("Do some 1 2 3 sake" +
                "Then some  3 4 5","",null,R.drawable.cut_cucumber);
        RecipeStep stepL2 = new RecipeStep(" Cooking is awesome" +
                "continue","",
                null,R.drawable.combine_salt_vinegar_sugar);
        RecipeStep stepL3 = new RecipeStep("Do some 1 2 3 sake" +
                "Then some  3 4 5","",null,R.drawable.cut_cucumber);
        RecipeStep stepL4 = new RecipeStep(" Cooking is awesome" +
                "continue","",
                null,R.drawable.combine_salt_vinegar_sugar);


        Ingredient ingredientL = new Ingredient("2 large cucumbers, peeled","1","",null,R.drawable.peeled_cucumber);
        Ingredient ingredientL2 = new Ingredient("1 teaspoon salt","2","",null,R.drawable.rice_vinegar);
        Ingredient ingredientL3 = new Ingredient("1/3 cup rice vinegar","3","",null,R.drawable.teaspoon_salt);
        Ingredient ingredientL4 = new Ingredient("2 large cucumbers, peeled","1","",null,R.drawable.peeled_cucumber);
        Ingredient ingredientL5 = new Ingredient("1 teaspoon salt","2","",null,R.drawable.rice_vinegar);
        Ingredient ingredientL6 = new Ingredient("1/3 cup rice vinegar","3","",null,R.drawable.teaspoon_salt);

        List<RecipeStep>stepsL= new ArrayList<>(Arrays.asList(stepL,stepL2,stepL3,stepL4));
        List<Ingredient> ingredientsL = new ArrayList<>(Arrays.asList(ingredientL,ingredientL2,ingredientL3,ingredientL4,ingredientL5,ingredientL6));

        String descL = "JAPANESE  CARAMEL's food blaah!";

        Recipe myRecipeL = new Recipe("",null,
                "JAPANESE CARAMEL rec","1",stepsL,descL,ingredientsL,R.drawable.ginger_chicken);
        myRecipes.add(myRecipeL);
        //another one
        //a new recipe

        RecipeStep stepM = new RecipeStep("Do some 1 2 3 sake" +
                "Then some  3 4 5","",null,R.drawable.cut_cucumber);
        RecipeStep stepM2 = new RecipeStep(" Cooking is awesome" +
                "continue","",
                null,R.drawable.combine_salt_vinegar_sugar);
        RecipeStep stepM3 = new RecipeStep("Do some 1 2 3 sake" +
                "Then some  3 4 5","",null,R.drawable.cut_cucumber);
        RecipeStep stepM4 = new RecipeStep(" Cooking is awesome" +
                "continue","",
                null,R.drawable.combine_salt_vinegar_sugar);


        Ingredient ingredientM = new Ingredient("2 large cucumbers, peeled","1","",null,R.drawable.peeled_cucumber);
        Ingredient ingredientM2 = new Ingredient("1 teaspoon salt","2","",null,R.drawable.rice_vinegar);
        Ingredient ingredientM3 = new Ingredient("1/3 cup rice vinegar","3","",null,R.drawable.teaspoon_salt);
        Ingredient ingredientM4 = new Ingredient("2 large cucumbers, peeled","1","",null,R.drawable.peeled_cucumber);
        Ingredient ingredientM5 = new Ingredient("1 teaspoon salt","2","",null,R.drawable.rice_vinegar);
        Ingredient ingredientM6 = new Ingredient("1/3 cup rice vinegar","3","",null,R.drawable.teaspoon_salt);

        List<RecipeStep>stepsM= new ArrayList<>(Arrays.asList(stepM,stepM2,stepM3,stepM4));
        List<Ingredient> ingredientsM = new ArrayList<>(Arrays.asList(ingredientM,ingredientM2,ingredientM3,ingredientM4,ingredientM5,ingredientM6));

        String descM = "AYAMTAYAD's food blaah!";

        Recipe myRecipeM = new Recipe("",null,
                "AYAMTAYAD rec","1",stepsM,descM,ingredientsM,R.drawable.ginger_chicken);
        myRecipes.add(myRecipeM);
        //another one
        //a new recipe

        RecipeStep stepN = new RecipeStep("Do some 1 2 3 sake" +
                "Then some  3 4 5","",null,R.drawable.cut_cucumber);
        RecipeStep stepN2 = new RecipeStep(" Cooking is awesome" +
                "continue","",
                null,R.drawable.combine_salt_vinegar_sugar);
        RecipeStep stepN3 = new RecipeStep("Do some 1 2 3 sake" +
                "Then some  3 4 5","",null,R.drawable.cut_cucumber);
        RecipeStep stepN4 = new RecipeStep(" Cooking is awesome" +
                "continue","",
                null,R.drawable.combine_salt_vinegar_sugar);


        Ingredient ingredientN = new Ingredient("2 large cucumbers, peeled","1","",null,R.drawable.peeled_cucumber);
        Ingredient ingredientN2 = new Ingredient("1 teaspoon salt","2","",null,R.drawable.rice_vinegar);
        Ingredient ingredientN3 = new Ingredient("1/3 cup rice vinegar","3","",null,R.drawable.teaspoon_salt);
        Ingredient ingredientN4 = new Ingredient("2 large cucumbers, peeled","1","",null,R.drawable.peeled_cucumber);
        Ingredient ingredientN5 = new Ingredient("1 teaspoon salt","2","",null,R.drawable.rice_vinegar);
        Ingredient ingredientN6 = new Ingredient("1/3 cup rice vinegar","3","",null,R.drawable.teaspoon_salt);

        List<RecipeStep>stepsN= new ArrayList<>(Arrays.asList(stepN,stepN2,stepN3,stepN4));
        List<Ingredient> ingredientsN = new ArrayList<>(Arrays.asList(ingredientN,ingredientN2,ingredientN3,ingredientN4,ingredientN5,ingredientN6));

        String descN = "HINGA's food blaah!";

        Recipe myRecipeN = new Recipe("",null,
                "HINGA rec","1",stepsN,descN,ingredientsN,R.drawable.ginger_chicken);
        myRecipes.add(myRecipeN);
        //another one
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
