package io.github.shella688.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;

import java.util.ArrayList;

public class CuttingStation extends CookingStation{
    public CuttingStation(String name, int x, int y, ArrayList<Ingredient> storedIngredients) {
        super(name, x, y, storedIngredients);
        this.stationType = "cutting";
        this.texture = new Texture(Gdx.files.internal("droplet.png"));
    }

    @Override
    public void RecipeAction() {
        for (Ingredient foodItem:storedIngredients) {

        }
    }
}
