package io.github.shella688.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.ScreenUtils;

import java.util.ArrayList;

public class PiazzaPanic extends ApplicationAdapter {
	private SpriteBatch batch;
	private ArrayList<Cook> cooks;
	private ArrayList<Customer> customers;
	private ArrayList<CookingStation> cookingStations;
	private ArrayList<Pantry> pantry;
	private Counter counter;
	private InputHandler inputHandler;
	private ArrayList<Texture> textures;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		cooks = new ArrayList<Cook>();
		customers = new ArrayList<Customer>();
		inputHandler = new InputHandler(cooks);
		cookingStations = new ArrayList<CookingStation>();
		pantry = new ArrayList<Pantry>();


		//create texture for cooks
		Texture cookTexture = new Texture("bucket.png");
		cooks.add(new Cook("Cook1",cookTexture,0,0));
		cooks.add(new Cook("Cook2",cookTexture,70,0));

		//create texture for customers
		Texture customerTexture = new Texture("droplet.png");
		for(int i = 0; i < 5; i++) {
			customers.add(new Customer("Customer", customerTexture, i * 100, 100));
		}

		//create texture for cooking stations
		Texture cuttingTexture = new Texture(Gdx.files.internal("droplet.png"));
		cookingStations.add(new CookingStation("CuttingStation", cuttingTexture, 200, 200));
		Texture fryingTexture = new Texture(Gdx.files.internal("droplet.png"));
		cookingStations.add(new CookingStation("FryingStation", fryingTexture, 300, 200 ));
		Texture servingTexture = new Texture(Gdx.files.internal("droplet.png"));
		cookingStations.add(new CookingStation("ServingStation", servingTexture, 400, 200));

		//create pantry
		Texture lettuceTexture = new Texture(Gdx.files.internal("bucket.png"));
		Texture onionsTexture = new Texture(Gdx.files.internal("bucket.png"));
		Texture tomatoesTexture = new Texture(Gdx.files.internal("bucket.png"));
		Texture pattyTexture = new Texture(Gdx.files.internal("bucket.png"));
		Texture bunsTexture = new Texture(Gdx.files.internal("bucket.png"));
		pantry.add(new Pantry("lettuce", lettuceTexture, 700, 20));
		pantry.add(new Pantry("tomatoes", tomatoesTexture, 700, 30));
		pantry.add(new Pantry("onions", onionsTexture, 700, 40));
		pantry.add(new Pantry("patty", pattyTexture, 700, 50));
		pantry.add(new Pantry("buns", bunsTexture, 700, 60));

	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		//update the game objects
		for (Cook cook : cooks) {
			cook.update();
		}

		for (Customer customer : customers) {
			customer.update();
		}

		//draw the game objects
		batch.begin();
		for (Cook cook : cooks) {
			cook.draw(batch);
		}

		for (Customer customer : customers) {
			customer.draw(batch);
		}
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
	}
}
