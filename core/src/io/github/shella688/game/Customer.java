package io.github.shella688.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.TimeUtils;

public class Customer {
    private Texture texture;
    private Recipe recipe;
    private boolean served;
    private float arriveTime;
    private Vector2 position;

    public Customer(String name, Texture texture, int x, int y) {
        this.texture = texture;
        position = new Vector2(x, y);
        //create a random recipe
        int recipeNum = MathUtils.random(1,2);
        if(recipeNum == 1) {
            recipe = new Recipe("Salad");
        }else {
            recipe = new Recipe("Burger");
        }
        served = false;
        arriveTime = TimeUtils.nanoTime();
    }

    public void update() {
        //check if recipe is ready
    }

    public void draw(SpriteBatch batch) {
        batch.draw(texture, position.x, position.y);
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public boolean isServed() {
        return served;
    }

    public void setServed(boolean served) {
        this.served = served;
    }

    public float getArriveTime() {
        return arriveTime;
    }
}

