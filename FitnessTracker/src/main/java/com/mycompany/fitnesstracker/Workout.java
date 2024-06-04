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
    private List<Sets> sets;
    private Scanner scanner;
    
    
    // Constructor for Workout class
    public Workout(){
        this.sets = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }
    
    // Add a new set to the current workout
    public void addSet() {
        System.out.println("");
        int setNumber = sets.size() + 1; 
        System.out.print("Enter the number of reps for this set: ");
        int reps = scanner.nextInt();
        
        Sets newSet = new Sets(setNumber, reps);
        sets.add(newSet);
        
        System.out.println("This set has been added: " + newSet);
    }
    
    public void displayWorkout(){
        System.out.println("Workout Summary: ");
        for (Sets set:sets){
            System.out.println(set);
        }
    }
    
     //Second array of the existing exercises to be used from a different class rather than main one
    public static void createExerciseArray(){
        List<Exercise> exe = new ArrayList<>();
        exe.add(new Exercise(1,"Lunge", 30, 10, "Like squats, lunges work all the major muscles of the lower body: gluteals, quadriceps, and hamstrings"));
        exe.add(new Exercise(2,"Plank", 45, 15, "Forearm plank. A full-body exercise that requires strength and balance, planks put the core into overdrive."));
        exe.add(new Exercise(3,"Squat", 30, 20, "Squats increase lower body and core strength, as well as flexibility in your lower back and hips."));
        exe.add(new Exercise(4,"Dumbbell row", 5, 2, "Not only will these make your back look killer in that dress, but dumbbell rows are also another compound exercise that strengthens multiple muscle groups"));
        exe.add(new Exercise(5,"Pushup", 5, 2, "Simple, but a deadly pushup. "));
        exe.add(new Exercise(6,"Crunche", 10, 4, "Crunches work the ab muscles; [they're] not to be mistaken as exercise that burns the fat over the abdominals."));
        exe.add(new Exercise(7,"Deadlift", 10, 3, "The bread and butter of countless gym routines, this move, if done properly, will predominantly engage your back and legs."));
        exe.add(new Exercise(8,"Lateral raise", 10, 2, "This move is similar to regular lateral raises, except here you raise the weights while slightly bent over, leading to more rear deltoid and trap development."));
        exe.add(new Exercise(9,"Bridge", 10, 2, " Activate your core and posterior chain (a fancy term for the backside of your body) with a bridge."));
        
        //Display the result
        System.out.println("Existing Exercises: ");
        for(Exercise exercise: exe) {
            System.out.println("Option "+exercise.getId()+ "------ Name: " +exercise.getName() );
        }
    }
    

    
    }