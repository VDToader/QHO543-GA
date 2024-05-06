/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fitnesstracker;

/**
 *
 * @author BlackBox
 */
import java.util.ArrayList;
import java.util.List;

public class FavExercise {
    private List<Exercise> favoriteExercises;
    
    //Constructor, Initialize the new empty array list inside the constructor 
    public FavExercise () {
        this.favoriteExercises = new ArrayList<>();
    }
    
    // Method used to add a favorite exercise to the array
    public void addFavouriteExercise (Exercise exercise){
        favoriteExercises.add(exercise);
    }
    
    // Method to see the list of favourite exercises
    public List<Exercise> getFavoriteExercises(){
        return favoriteExercises;
    }
}
