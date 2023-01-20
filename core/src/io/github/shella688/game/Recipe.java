package io.github.shella688.game;

import java.util.ArrayList;
public class Recipe {
    private String name;
    private ArrayList<String> steps;

    public Recipe(String name) {
        this.name = name;
        if(name.equals("Salad")) {
            steps = new ArrayList<String>();
            steps.add("cut lettuce");
            steps.add("cut tomatoes");
            steps.add("cut onions");
            steps.add("serve together");
        } else {
            steps = new ArrayList<String>();
            steps.add("form patty");
            steps.add("fry patty");
            steps.add("toast buns");
            steps.add("serve together");
        }
    }

    public String getName() {
        return name;
    }

    public ArrayList<String> getSteps() {
        return steps;
    }
}
