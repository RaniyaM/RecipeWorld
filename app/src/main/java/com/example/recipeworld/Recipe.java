package com.example.recipeworld;

public class Recipe {
    private String RecipeName;
    private String RecipeIngredients;
    private String RecipeMethodTitle;
    private String RecipeInstructions;
    private String Recipe;
    private int Thumbnail;

    public Recipe(String name, String recipeIngredients, String recipeMethodTitle, String recipe, int thumbnail, String recipeInstructions){
        RecipeName = name;
        RecipeIngredients = recipeIngredients;
        RecipeMethodTitle = recipeMethodTitle;
        Recipe = recipe;
        Thumbnail = thumbnail;
        RecipeInstructions = recipeInstructions;


    }

    public String getRecipeName() {
        return RecipeName;
    }

    public String getRecipeIngredients() {
        return RecipeIngredients;
    }

    public String getRecipeMethodTitle() {
        return RecipeMethodTitle;
    }

    public String getRecipe() {
        return Recipe;
    }

    public int getThumbnail() {
        return Thumbnail;
    }

    public String getRecipeInstructions() {
        return RecipeInstructions;
    }
}
