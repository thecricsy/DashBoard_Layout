package com.example.model;

public class Ingredient {
    private int IngredientId;
    private String IngredientName;
    private String Amount;
    private int PostId;

    public Ingredient(int ingredientId, String ingredientName, String amount, int postId) {
        IngredientId = ingredientId;
        IngredientName = ingredientName;
        Amount = amount;
        PostId = postId;
    }

    public Ingredient() {
    }

    public int getIngredientId() {
        return IngredientId;
    }

    public void setIngredientId(int ingredientId) {
        IngredientId = ingredientId;
    }

    public String getIngredientName() {
        return IngredientName;
    }

    public void setIngredientName(String ingredientName) {
        IngredientName = ingredientName;
    }

    public String getAmount() {
        return Amount;
    }

    public void setAmount(String amount) {
        Amount = amount;
    }

    public int getPostId() {
        return PostId;
    }

    public void setPostId(int postId) {
        PostId = postId;
    }
}
