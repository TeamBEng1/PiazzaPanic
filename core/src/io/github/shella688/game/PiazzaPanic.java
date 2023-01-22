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
		cookingStations.add(new CuttingStation("CuttingStation1", 200, 200, null));
		cookingStations.add(new FryingStation("FryingStation1", 300, 200, null));
		cookingStations.add(new ServingStation("ServingStation1", 400, 200, null));

		//create pantry
		Texture lettuceTexture = new Texture(Gdx.files.internal("bucket.png"));
		pantry.add(new Pantry("lettuce", lettuceTexture, 200, 20));
		Texture tomatoesTexture = new Texture(Gdx.files.internal("bucket.png"));
		pantry.add(new Pantry("tomatoes", tomatoesTexture, 220, 20));
		Texture onionsTexture = new Texture(Gdx.files.internal("bucket.png"));
		pantry.add(new Pantry("onions", onionsTexture, 240, 20));
		Texture pattyTexture = new Texture(Gdx.files.internal("bucket.png"));
		pantry.add(new Pantry("patty", pattyTexture, 260, 20));
		Texture bunsTexture = new Texture(Gdx.files.internal("bucket.png"));
		pantry.add(new Pantry("buns", bunsTexture, 280, 20));


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

		for (CookingStation cookingStation : cookingStations) {
			cookingStation.draw(batch);
		}

		for (Pantry pantry : pantry) {
			pantry.draw(batch);
		}
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
	}
}
