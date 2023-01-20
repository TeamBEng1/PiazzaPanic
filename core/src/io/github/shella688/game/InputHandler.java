package io.github.shella688.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;

import java.util.ArrayList;
public class InputHandler {
    private ArrayList<Cook> cooks;

    public InputHandler(ArrayList<Cook> cooks) {
        this.cooks = cooks;
    }

    public void handleInput() {
        if (Gdx.input.isKeyPressed(Input.Keys.UP)) {
            cooks.get(0).moveUp();
        }
        if (Gdx.input.isKeyPressed(Input.Keys.DOWN)) {
            cooks.get(0).moveDown();
        }
        if (Gdx.input.isKeyPressed(Input.Keys.LEFT)) {
            cooks.get(0).moveLeft();
        }
        if (Gdx.input.isKeyPressed(Input.Keys.RIGHT)) {
            cooks.get(0).moveRight();
        }
    }
}
