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
        //new
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


        //a new recipe

        RecipeStep stepC = new RecipeStep("Cut the chicken up into bite-sized pieces. In a bowl, whisk the soy sauce, sake, honey, and ginger together, then add the chicken. " +
                "Marinate for at least 30 minutes.","",null,R.drawable.chicken_thighs);
        RecipeStep stepC2 = new RecipeStep(" Heat a frying pan over medium heat until hot. Add the oil then swirl to coat. Fry the chicken in batches. You want to get a nice brown crust, so it’s important that the chicken is in a single layer and has some space between each piece." +
                "Because there is sugar in the marinade if your pan is too hot it will burn. If the pan is too cool, water will leach out of the chicken and it won’t brown. Adjust the heat accordingly. ","",
                null,R.drawable.frying_pan);
        RecipeStep stepC3 = new RecipeStep(" When the chicken is browned on one side, flip it over and brown the other side. Transfer the chicken to a plate. Once all your chicken is browned, use a paper towel to wipe out any extra oil, then add the remaining marinade to the pan along with 2 tablespoons of water. " +
                "Bring the mixture to a boil over medium high heat, and then return all the chicken to the pan. Stir, until the liquid has mostly evaporated and the chicken has a nice shiny coating of sauce. ","",
                null,R.drawable.cooked_chicken);
        RecipeStep stepC4 = new RecipeStep(" Garnish with scallions and sesame seeds and serve over rice." +
                "","",
                null,R.drawable.ginger_chicken);


        Ingredient ingredientC = new Ingredient("1.5 pounds boneless chicken thighs","1","",null,R.drawable.chicken_thighs);
        Ingredient ingredientC2 = new Ingredient("2 tablespoons soy sauce","2","",null,R.drawable.soy_sauce);
        Ingredient ingredientC3 = new Ingredient("2 tablespoons sake","3","",null,R.drawable.sake);
        Ingredient ingredientC4 = new Ingredient("2 tablespoons honey","1","",null,R.drawable.honey);
        Ingredient ingredientC5 = new Ingredient("1 tablespoon finely grated fresh ginger","2","",null,R.drawable.ginger);
        Ingredient ingredientC6 = new Ingredient("1 teaspoon vegetable oil","3","",null,R.drawable.vegetable_oil);
        Ingredient ingredientC7 = new Ingredient("chopped scallions and sesame seeds for garnish","3","",null,R.drawable.sesame_scallion);

        List<RecipeStep>stepsC = new ArrayList<>(Arrays.asList(stepC,stepC2,stepC3,stepC4));
        List<Ingredient> ingredientsC = new ArrayList<>(Arrays.asList(ingredientC,ingredientC2,ingredientC3,ingredientC4,ingredientC5,ingredientC6,ingredientC7));

        String descC = "Sweet honey and powerful, belly-warming ginger combine to make this Japanese favorite that is bursting with flavor. Unlike chicken teriyaki, this dish adds a kick that is anything but ordinary, but absolutely delicious.";

        Recipe myRecipeChicken = new Recipe("",null,
                "Japanese Ginger Chicken","1",stepsC,descC,ingredientsC,R.drawable.ginger_chicken);
        myRecipes.add(myRecipeChicken);
        //another one

        //a new recipe

        RecipeStep stepD = new RecipeStep("Place the rice into a mixing bowl and cover with cool water." +
                "Swirl the rice in the water, pour off and repeat 2 to 3 times or until the water is clear. ","",null,R.drawable.sushi_bowl);
        RecipeStep stepD2 = new RecipeStep(" Place the rice and 2 cups of water into a medium saucepan and place over high heat. Bring to a boil, uncovered. Once it begins to boil, reduce the heat to the lowest setting and cover. " +
                "Cook for 15 minutes. Remove from the heat and let stand, covered, for 10 minutes. ","",
                null,R.drawable.sushi_pan);
        RecipeStep stepD3 = new RecipeStep("Combine the rice vinegar, sugar and salt in a small bowl and heat in the microwave on high for 30 to 45 seconds. Transfer the rice into a large wooden or glass mixing bowl and add the vinegar mixture." +
                "Fold thoroughly to combine and coat each grain of rice with the mixture. Allow to cool to room temperature before using to make sushi or sashimi. ","",null,R.drawable.sushi_rice);



        Ingredient ingredientD = new Ingredient("2 cups sushi or short grain rice","1","",null,R.drawable.sushi_cups);
        Ingredient ingredientD2 = new Ingredient("2 cups water, plus extra for rinsing rice","2","",null,R.drawable.water_cups);
        Ingredient ingredientD3 = new Ingredient("2 tablespoons rice vinegar","3","",null,R.drawable.rice_vinegar);
        Ingredient ingredientD4 = new Ingredient("2 tablespoons sugar","1","",null,R.drawable.sugar_tablespoon);
        Ingredient ingredientD5 = new Ingredient("1 tablespoon kosher salt","2","",null,R.drawable.kosher_salt);

        List<RecipeStep>stepsD= new ArrayList<>(Arrays.asList(stepD,stepD2,stepD3));
        List<Ingredient> ingredientsD = new ArrayList<>(Arrays.asList(ingredientD,ingredientD2,ingredientD3,ingredientD4,ingredientD5));

        String descD = "Sushi is a Japanese dish of prepared vinegared rice, usually with some sugar and salt, accompanying a variety of ingredients, such as seafood, vegetables, and occasionally tropical fruits. Styles of sushi and its presentation vary widely, but the one key ingredient is \"sushi rice\", also referred to as shari, or sumeshi. The term sushi is no longer used in its original context; it literally means sour-tasting.";

        Recipe myRecipeD = new Recipe("",null,
                "Sushi Rice","1",stepsD,descD,ingredientsD,R.drawable.sushi_rice);
        myRecipes.add(myRecipeD);
        //another one

        //a new recipe

        RecipeStep stepE = new RecipeStep("Wrap the block of tofu in 2 layers of paper towels and lay on a plate. Invert a second plate on top of the tofu and weigh down with a 28-ounce can. Leave for 20 minutes then cut the tofu into 1/4 to 1/2-inch cubes." +
                "","",null,R.drawable.towel_tofu);
        RecipeStep stepE2 = new RecipeStep(" Heat the dashi in a 4-quart saucepan over medium-high heat. When the dashi reaches 100 degrees F on an instant-read thermometer, ladle 1 cup into a small bowl. Add the miso, and whisk until smooth." +
                "","",
                null,R.drawable.dashi_heat);
        RecipeStep stepE3 = new RecipeStep("Bring the remaining dashi to a bare simmer, approximately 10 minutes. Add the miso mixture and whisk to combine. Return to a slight simmer, being careful not to boil the mixture. Add the tofu and scallions and cook for another minute or until heated through. Remove from the heat, ladle into soup bowls and serve immediately. " +
                "","",null,R.drawable.miso_soup);



        Ingredient ingredientE = new Ingredient("12-ounce block firm silken tofu","1","",null,R.drawable.tofu);
        Ingredient ingredientE2 = new Ingredient("2 quarts dashi","2","",null,R.drawable.quarts_dashi);
        Ingredient ingredientE3 = new Ingredient("6 tablespoons dark or red miso","3","",null,R.drawable.miso_red);
        Ingredient ingredientE4 = new Ingredient("2 tablespoons light or white miso","1","",null,R.drawable.white_miso);
        Ingredient ingredientE5 = new Ingredient("4 scallions, thinly sliced","2","",null,R.drawable.scallions_sliced);

        List<RecipeStep>stepsE= new ArrayList<>(Arrays.asList(stepE,stepE2,stepE3));
        List<Ingredient> ingredientsE = new ArrayList<>(Arrays.asList(ingredientE,ingredientE2,ingredientE3,ingredientE4,ingredientE5));

        String descE = "Miso soup is a traditional Japanese soup consisting of a stock called \"dashi\" into which softened miso paste is mixed. Many ingredients are added depending on regional and seasonal recipes, and personal preference.";

        Recipe myRecipeE = new Recipe("",null,
                "Miso Soup","1",stepsE,descE,ingredientsE,R.drawable.miso_soup);
        myRecipes.add(myRecipeE);
        //another one

        //a new recipe

        RecipeStep stepF = new RecipeStep("Combine ingredients in a saucepan on medium heat until the sugar is dissolved. " +
                "","",null,R.drawable.cut_cucumber);
        RecipeStep stepF2 = new RecipeStep(" To make glaze: Mix 1/2 tablespoon cornstarch with 1 tablespoon water. Heat sauce on medium high heat and add cornstarch water mixture. Simmer until thickened. " +
                "","",
                null,R.drawable.combine_salt_vinegar_sugar);


        Ingredient ingredientF = new Ingredient("1/2 cup soy sauce","1","",null,R.drawable.soy_sauce);
        Ingredient ingredientF2 = new Ingredient("1/4 cup water","2","",null,R.drawable.water_cups);
        Ingredient ingredientF3 = new Ingredient("2 tablespoons sweet rice wine","3","",null,R.drawable.red_wine);
        Ingredient ingredientF4 = new Ingredient("1 tablespoon, plus 2 teaspoons brown sugar","1","",null,R.drawable.sugar_tablespoon);
        Ingredient ingredientF5 = new Ingredient("1 1/2 teaspoons minced garlic","2","",null,R.drawable.garlic);
        Ingredient ingredientF6 = new Ingredient("1 1/2 teaspoons minced ginger","3","",null,R.drawable.ginger);

        List<RecipeStep>stepsF= new ArrayList<>(Arrays.asList(stepF,stepF2));
        List<Ingredient> ingredientsF = new ArrayList<>(Arrays.asList(ingredientF,ingredientF2,ingredientF3,ingredientF4,ingredientF5,ingredientF6));

        String descF = "Teriyaki is a cooking technique used in Japanese cuisine in which foods are broiled or grilled with a glaze of soy sauce, mirin, and sugar. Fish – yellowtail, marlin, skipjack tuna, salmon, trout, and mackerel – is mainly used in Japan, while white and red meat – chicken, pork, lamb, and beef – is more often used in the West. Other ingredients sometimes used in Japan include squid, hamburger steak, and meatballs";

        Recipe myRecipeF = new Recipe("",null,
                "Teriyaki Sauce","1",stepsF,descF,ingredientsF,R.drawable.teriyaki_sauce);
        myRecipes.add(myRecipeF);
        //another one

        //a new recipe

        RecipeStep stepG = new RecipeStep("Fry the bacon in a large skillet over medium heat until slightly crispy. Remove to paper towels to drain and set aside." +
                "","",null,R.drawable.bacon_skillet);
        RecipeStep stepG2 = new RecipeStep(" In a large bowl, stir together the water and eggs. Gradually stir in the flour and salt until smooth. Add the cabbage and ginger; stir until evenly distributed. " +
                "","",
                null,R.drawable.watereggs_bowl);
        RecipeStep stepG3 = new RecipeStep("Heat a skillet over medium heat and coat with cooking spray. Pour about 1/4 of the batter into the center of the skillet. Place 4 slices of cooked bacon in the center. Use a spatula to shape the pancake into a circle. Fry for about 5 minutes or until the edges are dry. Flip and cook on the other side until the center is stable and it is browned on both sides. Remove from the pan and drizzle with tonkatsu sauce to serve. Continue with remaining batter and bacon" +
                "","",null,R.drawable.japanese_okonomiyaki);



        Ingredient ingredientG = new Ingredient("12 ounces sliced bacon","1","",null,R.drawable.sliced_bacon);
        Ingredient ingredientG2 = new Ingredient("1 1/3 cups water","2","",null,R.drawable.water_cups);
        Ingredient ingredientG3 = new Ingredient("4 eggs","3","",null,R.drawable.eggs);
        Ingredient ingredientG4 = new Ingredient("3 cups of all purpose flour","1","",null,R.drawable.allpurpose_flour);
        Ingredient ingredientG5 = new Ingredient("1 teaspoon salt","2","",null,R.drawable.teaspoon_salt);
        Ingredient ingredientG6 = new Ingredient("1 medium head cabbage","3","",null,R.drawable.cabbage);
        Ingredient ingredientG7 = new Ingredient("ginger","2","",null,R.drawable.ginger);
        Ingredient ingredientG8 = new Ingredient("1/4 cup tonkatsu sauce","3","",null,R.drawable.tonkatsu_sauce);

        List<RecipeStep>stepsG= new ArrayList<>(Arrays.asList(stepG,stepG2,stepG3));
        List<Ingredient> ingredientsG = new ArrayList<>(Arrays.asList(ingredientG,ingredientG2,ingredientG3,ingredientG4,ingredientG5,ingredientG6,ingredientG7,ingredientG8));

        String descG = "Okonomiyaki is a Japanese savory pancake containing a variety of ingredients. The name is derived from the word okonomi, meaning \"how you like\" or \"what you like\", and yaki meaning \"cooked\". Okonomiyaki is mainly associated with the Kansai or Hiroshima areas of Japan, but is widely available throughout the country. Toppings and batters tend to vary according to region. In Tokyo, there is a semi-liquid okonomiyaki called 'monjayaki.'";

        Recipe myRecipeG = new Recipe("",null,
                "Japanese Okonomiyaki","1",stepsG,descG,ingredientsG,R.drawable.japanese_okonomiyaki);
        myRecipes.add(myRecipeG);
        //another one
        //a new recipe

        RecipeStep stepH = new RecipeStep("Spring onion" ,"",null,R.drawable.tunas1);
        RecipeStep stepH2 = new RecipeStep(" Shred spring onion" +
                "","",
                null,R.drawable.tunas2);
        RecipeStep stepH3 = new RecipeStep("Soak in water" +
                "","",null,R.drawable.tunas3);
        RecipeStep stepH4 = new RecipeStep(" And drain" +
                "","",
                null,R.drawable.tunas4);
        RecipeStep stepH5 = new RecipeStep(" Slice raw tuna and dish onion and tuna" +
                "","",
                null,R.drawable.tunas5);
        RecipeStep stepH6 = new RecipeStep("Garnish crushed peanut" +
                "","",null,R.drawable.tunas6);
        RecipeStep stepH7 = new RecipeStep(" Put sesame oil and soy sauce and mix well. Let's eat. You can garnish cornflakes instead of crushed peanuts." +
                "","",
                null,R.drawable.tuna_main);



        Ingredient ingredientH = new Ingredient("50 g Tuna Sashimi ","1","",null,R.drawable.tuna_sashimi);
        Ingredient ingredientH2 = new Ingredient("1 piece white spring onion ","2","",null,R.drawable.onion_spring);
        Ingredient ingredientH3 = new Ingredient("1 tablespoon smashed peanut ","3","",null,R.drawable.smashed_peanut);
        Ingredient ingredientH4 = new Ingredient("1 teaspoon sesame oil","1","",null,R.drawable.sesame_oil);
        Ingredient ingredientH5 = new Ingredient("1 teaspoon soy sauce","2","",null,R.drawable.soy_sauce);


        List<RecipeStep>stepsH= new ArrayList<>(Arrays.asList(stepH,stepH2,stepH3,stepH4,stepH5,stepH6,stepH7));
        List<Ingredient> ingredientsH = new ArrayList<>(Arrays.asList(ingredientH,ingredientH2,ingredientH3,ingredientH4,ingredientH5));

        String descH = "Sashimi is a Japanese delicacy consisting of fresh raw fish or meat sliced into thin pieces and often eaten with soy sauce.";

        Recipe myRecipeH = new Recipe("",null,
                "Sashimi Tuna Salad","1",stepsH,descH,ingredientsH,R.drawable.tuna_main);
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

        String descI = "Japanese potato salad is creamy yet full of textural crunch. If you’re a potato salad lover, you will be happy to add this delicious version into your repertoire. ";

        Recipe myRecipeI = new Recipe("",null,
                "Potato Salad","1",stepsI,descI,ingredientsI,R.drawable.potato_salad);
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

        String descJ = "Shakshouka is a dish of eggs poached in a sauce of tomatoes, chili peppers, and garlic, commonly spiced with cumin, paprika, cayenne pepper, and nutmeg. Although the dish has existed in Mediterranean and Middle Eastern regions, its more recent egg and vegetable-based form originated in the Maghreb region of North Africa.";

        Recipe myRecipeJ = new Recipe("",null,
                "Japanese Shakshuka","1",stepsJ,descJ,ingredientsJ,R.drawable.shakshuka);
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

        String descK = "Pork shogayaki (生姜焼き, ginger pork) is a thinly sliced sautéed pork full of ginger flavour, which makes the sauce so tasty. It is one of the most popular recipes on the lunch menu as well as the bento box (Japanese lunch box).  It is a quick and easy dish – it literally takes less than 10 minutes to cook!";

        Recipe myRecipeK = new Recipe("",null,
                "Japanese Ginger Pork","1",stepsK,descK,ingredientsK,R.drawable.ginger_pork);
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

        String descL = "Japanese souffle pancakes are known to be incredibly fluffy and giggly, they are much softer and lighter than American pancakes. If you would like to make the recipe with buttermilk, follow the link below. It is another fluffy Japanese pancake recipe.";

        Recipe myRecipeL = new Recipe("",null,
                "Japanese Souffle Pancake","1",stepsL,descL,ingredientsL,R.drawable.souffle_pancake);
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

        String descM = "Ramen is a Japanese dish with a translation of \"pulled noodles\". It consists of Chinese-style wheat noodles served in a meat or fish-based broth, often flavored with soy sauce or miso, and uses toppings such as sliced pork, nori, menma, and scallions. Nearly every region in Japan has its own variation of ramen, such as the tonkotsu ramen of Kyushu and the miso ramen of Hokkaido.";

        Recipe myRecipeM = new Recipe("",null,
                "Ramen","1",stepsM,descM,ingredientsM,R.drawable.ramen);
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

        String descN = "Tempura is a Japanese dish usually consisting of seafood or vegetables that have been battered and deep fried. The dish was influenced by fritter-cooking techniques introduced by Portuguese residing in Nagasaki in the 16th century, and the name \"tempura\" relates to that origin.";

        Recipe myRecipeN = new Recipe("",null,
                "Tempura","1",stepsN,descN,ingredientsN,R.drawable.tempura);
        myRecipes.add(myRecipeN);
        //another one
        //a new recipe

        RecipeStep stepO = new RecipeStep("Cut the chicken up into bite-sized pieces. In a bowl, whisk the soy sauce, sake, honey, and ginger together, then add the chicken. " +
                "Marinate for at least 30 minutes.","",null,R.drawable.chicken_thighs);
        RecipeStep stepO2 = new RecipeStep(" Heat a frying pan over medium heat until hot. Add the oil then swirl to coat. Fry the chicken in batches. You want to get a nice brown crust, so it’s important that the chicken is in a single layer and has some space between each piece." +
                "Because there is sugar in the marinade if your pan is too hot it will burn. If the pan is too cool, water will leach out of the chicken and it won’t brown. Adjust the heat accordingly. ","",
                null,R.drawable.frying_pan);
        RecipeStep stepO3 = new RecipeStep(" When the chicken is browned on one side, flip it over and brown the other side. Transfer the chicken to a plate. Once all your chicken is browned, use a paper towel to wipe out any extra oil, then add the remaining marinade to the pan along with 2 tablespoons of water. " +
                "Bring the mixture to a boil over medium high heat, and then return all the chicken to the pan. Stir, until the liquid has mostly evaporated and the chicken has a nice shiny coating of sauce. ","",
                null,R.drawable.cooked_chicken);
        RecipeStep stepO4 = new RecipeStep(" Garnish with scallions and sesame seeds and serve over rice." +
                "","",
                null,R.drawable.ginger_chicken);


        Ingredient ingredientO = new Ingredient("1.5 pounds boneless chicken thighs","1","",null,R.drawable.chicken_thighs);
        Ingredient ingredientO2 = new Ingredient("2 tablespoons soy sauce","2","",null,R.drawable.soy_sauce);
        Ingredient ingredientO3 = new Ingredient("2 tablespoons sake","3","",null,R.drawable.sake);
        Ingredient ingredientO4 = new Ingredient("2 tablespoons honey","1","",null,R.drawable.honey);
        Ingredient ingredientO5 = new Ingredient("1 tablespoon finely grated fresh ginger","2","",null,R.drawable.ginger);
        Ingredient ingredientO6 = new Ingredient("1 teaspoon vegetable oil","3","",null,R.drawable.vegetable_oil);
        Ingredient ingredientO7 = new Ingredient("chopped scallions and sesame seeds for garnish","3","",null,R.drawable.sesame_scallion);

        List<RecipeStep>stepsO = new ArrayList<>(Arrays.asList(stepC,stepC2,stepC3,stepC4));
        List<Ingredient> ingredientsO = new ArrayList<>(Arrays.asList(ingredientC,ingredientC2,ingredientC3,ingredientC4,ingredientC5,ingredientC6,ingredientC7));

        String descO = " While curry has its origins in India, the curry we eat in Japan is a unique, localized dish based on the curry brought over to Japan from the UK. Made with meat and vegetables (carrots, potatoes, onions, etc.) flavored with curry powder, stewed, and served with rice. Sometimes fried foods, such as pork cutlets, are placed on top of the dish. While there are some specialist curry restaurants, you typically won't have any problems with the curry at a regular restaurant or chain restaurant.";

        Recipe myRecipeCurryrice = new Recipe("",null,
                "Curry Rice","1",stepsC,descC,ingredientsC,R.drawable.curry_rice);
        myRecipes.add(myRecipeCurryrice);
        //another one

        //a new recipe

        RecipeStep stepP = new RecipeStep("Place the rice into a mixing bowl and cover with cool water." +
                "Swirl the rice in the water, pour off and repeat 2 to 3 times or until the water is clear. ","",null,R.drawable.sushi_bowl);
        RecipeStep stepP2 = new RecipeStep(" Place the rice and 2 cups of water into a medium saucepan and place over high heat. Bring to a boil, uncovered. Once it begins to boil, reduce the heat to the lowest setting and cover. " +
                "Cook for 15 minutes. Remove from the heat and let stand, covered, for 10 minutes. ","",
                null,R.drawable.sushi_pan);
        RecipeStep stepP3 = new RecipeStep("Combine the rice vinegar, sugar and salt in a small bowl and heat in the microwave on high for 30 to 45 seconds. Transfer the rice into a large wooden or glass mixing bowl and add the vinegar mixture." +
                "Fold thoroughly to combine and coat each grain of rice with the mixture. Allow to cool to room temperature before using to make sushi or sashimi. ","",null,R.drawable.sushi_rice);



        Ingredient ingredientP = new Ingredient("2 cups sushi or short grain rice","1","",null,R.drawable.sushi_cups);
        Ingredient ingredientP2 = new Ingredient("2 cups water, plus extra for rinsing rice","2","",null,R.drawable.water_cups);
        Ingredient ingredientP3 = new Ingredient("2 tablespoons rice vinegar","3","",null,R.drawable.rice_vinegar);
        Ingredient ingredientP4 = new Ingredient("2 tablespoons sugar","1","",null,R.drawable.sugar_tablespoon);
        Ingredient ingredientP5 = new Ingredient("1 tablespoon kosher salt","2","",null,R.drawable.kosher_salt);

        List<RecipeStep>stepsP= new ArrayList<>(Arrays.asList(stepD,stepD2,stepD3));
        List<Ingredient> ingredientsP = new ArrayList<>(Arrays.asList(ingredientD,ingredientD2,ingredientD3,ingredientD4,ingredientD5));

        String descP = "A dish of noodles made from soba (buckwheat) flour eaten with a soy sauce and sugar sauce, and toppings such as egg, tempura or other ingredients. The noodles you get from a soba noodle shop will be particularly good, but very expensive, so it might be good to try the soba at a standing restaurant. The different dishes and toppings are usually on display in a showcase outside the restaurant, making it easy to decided what to order.";

        Recipe myRecipeP = new Recipe("",null,
                "Soba","1",stepsD,descD,ingredientsD,R.drawable.soba);
        myRecipes.add(myRecipeP);
        //another one

        //a new recipe

        RecipeStep stepQ = new RecipeStep("Wrap the block of tofu in 2 layers of paper towels and lay on a plate. Invert a second plate on top of the tofu and weigh down with a 28-ounce can. Leave for 20 minutes then cut the tofu into 1/4 to 1/2-inch cubes." +
                "","",null,R.drawable.towel_tofu);
        RecipeStep stepQ2 = new RecipeStep(" Heat the dashi in a 4-quart saucepan over medium-high heat. When the dashi reaches 100 degrees F on an instant-read thermometer, ladle 1 cup into a small bowl. Add the miso, and whisk until smooth." +
                "","",
                null,R.drawable.dashi_heat);
        RecipeStep stepQ3 = new RecipeStep("Bring the remaining dashi to a bare simmer, approximately 10 minutes. Add the miso mixture and whisk to combine. Return to a slight simmer, being careful not to boil the mixture. Add the tofu and scallions and cook for another minute or until heated through. Remove from the heat, ladle into soup bowls and serve immediately. " +
                "","",null,R.drawable.miso_soup);



        Ingredient ingredientQ = new Ingredient("12-ounce block firm silken tofu","1","",null,R.drawable.tofu);
        Ingredient ingredientQ2 = new Ingredient("2 quarts dashi","2","",null,R.drawable.quarts_dashi);
        Ingredient ingredientQ3 = new Ingredient("6 tablespoons dark or red miso","3","",null,R.drawable.miso_red);
        Ingredient ingredientQ4 = new Ingredient("2 tablespoons light or white miso","1","",null,R.drawable.white_miso);
        Ingredient ingredientQ5 = new Ingredient("4 scallions, thinly sliced","2","",null,R.drawable.scallions_sliced);

        List<RecipeStep>stepsQ= new ArrayList<>(Arrays.asList(stepE,stepE2,stepE3));
        List<Ingredient> ingredientsQ = new ArrayList<>(Arrays.asList(ingredientE,ingredientE2,ingredientE3,ingredientE4,ingredientE5));

        String descQ = "Karaage is chicken seasoned with soy sauce, salt and a number of different spices, sprinkled with starch and fried in oil. It is like the Japanese version of fried chicken, but the flavor is very different. There are a lot of local variations, with for example chicken nanban in Miyazaki, where the karaage are covered with tartare sauce, and tebasaki in Nagoya, where the karaage are covered in a sweet and spicy sauce. We definitely recommend trying these out!";

        Recipe myRecipeQ = new Recipe("",null,
                "Karaage","1",stepsE,descE,ingredientsE,R.drawable.karaage);
        myRecipes.add(myRecipeQ);
        myRecipes.add(myRecipeE);
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
