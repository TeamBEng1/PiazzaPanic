package io.github.shella688.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

import java.util.ArrayList;

public class CookingStation {
    private String name;
    public Texture texture;
    private Vector2 position;
    public ArrayList<Ingredient> storedIngredients; //a list of ingredients stored within the CookingStation
    public String stationType; //the given type of the CookingStation (i.e. frying)


    public CookingStation(String name, int x, int y, ArrayList<Ingredient> storedIngredients) {
        this.name = name;
        this.storedIngredients = storedIngredients;
        position = new Vector2(x,y);
    }

    public void RecipeAction() {
        //performs an action on the 'storedIngredients' ArrayList depending on the ingredients and the type of CookingStation
    }

    public void update() {
        //check if recipe is ready
    }

    public void draw(SpriteBatch batch) {
        batch.draw(texture, position.x, position.y);
    }

    public String getName() {
        return name;
    }
}
