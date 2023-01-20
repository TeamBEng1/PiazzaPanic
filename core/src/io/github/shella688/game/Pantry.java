package io.github.shella688.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
public class Pantry {
    private String name;
    private Texture texture;
    private Vector2 position;

    public Pantry(String name, Texture texture, int x, int y) {
        this.name = name;
        this.texture = texture;
        position = new Vector2(x,y);
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

