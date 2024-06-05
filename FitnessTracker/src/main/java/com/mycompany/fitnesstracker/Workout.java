/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fitnesstracker;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author BlackBox
 */
public class Workout {
    private List<Exercise> exercises;
    private List<WorkoutEntry> workoutEntries;

    
    // Constructor for Workout class
    public Workout(){
        this.exercises = new ArrayList<>();
        this.workoutEntries = new ArrayList<>();
        createExerciseArray();
    }
    
    
    
     //Second array of the existing exercises to be used from a different class rather than main one
    public void createExerciseArray(){
        exercises.add(new Exercise(1,"Lunge", 30, 10, "Like squats, lunges work all the major muscles of the lower body: gluteals, quadriceps, and hamstrings"));
        exercises.add(new Exercise(2,"Plank", 45, 15, "Forearm plank. A full-body exercise that requires strength and balance, planks put the core into overdrive."));
        exercises.add(new Exercise(3,"Squat", 30, 20, "Squats increase lower body and core strength, as well as flexibility in your lower back and hips."));
        exercises.add(new Exercise(4,"Dumbbell row", 5, 2, "Not only will these make your back look killer in that dress, but dumbbell rows are also another compound exercise that strengthens multiple muscle groups"));
        exercises.add(new Exercise(5,"Pushup", 5, 2, "Simple, but a deadly pushup. "));
        exercises.add(new Exercise(6,"Crunche", 10, 4, "Crunches work the ab muscles; [they're] not to be mistaken as exercise that burns the fat over the abdominals."));
        exercises.add(new Exercise(7,"Deadlift", 10, 3, "The bread and butter of countless gym routines, this move, if done properly, will predominantly engage your back and legs."));
        exercises.add(new Exercise(8,"Lateral raise", 10, 2, "This move is similar to regular lateral raises, except here you raise the weights while slightly bent over, leading to more rear deltoid and trap development."));
        exercises.add(new Exercise(9,"Bridge", 10, 2, " Activate your core and posterior chain (a fancy term for the backside of your body) with a bridge."));
        }
    
    public List<Exercise> getExercises(){
        return exercises;
    }
    
    public List<WorkoutEntry> getWorkoutEntries() {
        return workoutEntries;
    }
    
    
    public void addWorkoutEntry(WorkoutEntry entry) {
        workoutEntries.add(entry);
    }
    
    public void displayWorkout(){
        System.out.println("Workout History: ");
        for (WorkoutEntry entry : workoutEntries){
            System.out.println(entry);
        }
    }
    
}
    

    
