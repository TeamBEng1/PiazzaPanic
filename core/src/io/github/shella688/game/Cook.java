package io.github.shella688.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

import java.util.Stack;

public class Cook {
    private Texture texture;
    private Vector2 position;
    private Stack<Ingredient> ingredients;
    private Recipe currentRecipe;

    public Cook(String name, Texture texture, int x, int y) {
        this.texture = texture;
        position = new Vector2(x, y);
        ingredients = new Stack<Ingredient>();
    }

    public void update() {
    }

    //this following code underneath does not work
    public void draw(SpriteBatch batch) {
        batch.draw(texture, position.x, position.y);
    }

    public void moveUp() {
        position.y += 10;
    }

    public void moveDown() {
        position.y -= 10;
    }

    public void moveLeft() {
        position.x -= 10;
    }

    public void moveRight() {
        position.x += 10;
    }


}
