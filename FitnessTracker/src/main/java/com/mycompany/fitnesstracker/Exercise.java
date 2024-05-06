/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fitnesstracker;

/**
 *
 * @author BlackBox
 */
import java.util.List;
import java.util.ArrayList;

public class Exercise {
    private int id;
    private String name;
    private int duration;
    private int burnedKcal;
    private String description;
   
    public Exercise (int id, String name, int duration, int burnedKcal, String description){
        this.id = id;
        this.name = name;
        this.duration = duration;
        this.burnedKcal = burnedKcal;
        this.description = description;
    }
    // Declaring Accessors(Getters) for the Exercise Class
    public int getId(){
        return id;
    }
    public String getName (){
        return name;
    }
    public int getDuration (){
        return duration;
    }
    public int getBurnedKcal () {
        return burnedKcal;
    }
    public String getDescription(){
        return description;
    }
    public static void displayAllExercises(List<Exercise> exercises) {
        System.out.println("Existing Exercises:");
        for (Exercise exercise : exercises) {
            System.out.println("Option "+exercise.getId()+ "------ Name: " +exercise.getName() + "| Duration: " + exercise.getDuration() + " seconds" + "| Burned Kcal: " + exercise.getBurnedKcal() + " Kcal " + " | Description: " + exercise.getDescription());
        }
 
    }
}