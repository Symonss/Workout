package com.example.symons.workout;

public class Workout {
    //Each workout has a name and description
    private String name;
    private String description;

    //workout is an array of 4 Workouts
    public static final Workout[] workouts = {
            new Workout("The Limb Loosener", "5 Handstand push-ups\n 10 one leg squats \n 15 Pill-ups"),
            new Workout("Core Agony", "5 Handstand push-ups\n 10 one leg squats \n 15 Pill-ups"),
            new Workout("Wimp Special", "5 Handstand push-ups\n 10 one leg squats \n 15 Pill-ups"),
            new Workout("Strength and Length", "500 meter run\n 10 one leg squats \n 15 Pill-ups")

    };

    //constructor //each Workout has a name and a description
    public Workout(String name, String description) {
        this.name = name;
        this.description = description;
    }

    //getters for the private variables

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String toString(){
        return this.name;
    }
}
