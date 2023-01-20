package io.github.shella688.game;

import com.badlogic.gdx.graphics.Texture;
public class Ingredient {
    private String name;
    private Texture texture;

    public Ingredient(String name, Texture texture) {
        this.name = name;
        this.texture = texture;
    }

    public String getName() {
        return name;
    }

    public Texture getTexture() {
        return texture;
    }
}
