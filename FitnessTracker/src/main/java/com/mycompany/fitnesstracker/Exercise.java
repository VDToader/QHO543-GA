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


public class Exercise {
    private final int id;
    private final String name;
    private final int duration;
    private final int burnedKcal;
    private final String description;
   
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
    public static void displayFavExercises(List<Exercise> favoriteExercise){
        for (Exercise exercise : favoriteExercise) {
            System.out.println("Name: "+ exercise.getName() + " " + exercise.getDescription());
        }
    }
}