package io.github.shella688.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;

import java.util.ArrayList;

public class FryingStation extends CookingStation{
    public FryingStation(String name,int x, int y, ArrayList<Ingredient> storedIngredients) {
        super(name, x, y, storedIngredients);
        this.stationType = "frying";
        this.texture = new Texture(Gdx.files.internal("droplet.png"));
    }

    @Override
    public void RecipeAction() {
        for (Ingredient foodItem:storedIngredients) {
            if (foodItem.getName() == "rawPatty") {
                Texture pattyTexture = new Texture(Gdx.files.internal("droplet.png"));
                Ingredient cookedPatty = new Ingredient("cookedPatty", pattyTexture);
                storedIngredients.remove(foodItem);
                storedIngredients.add(cookedPatty);
            }
        }
    }
}
