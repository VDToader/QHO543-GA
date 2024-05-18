/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.fitnesstracker;
/**
 *
 * @author BlackBox
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.InputMismatchException;
public class FitnessTracker {

    public static void main(String[] args) {
        System.out.println("***** Welcome to the new Fitness Tracker *****");
        // TESTER FOR MAIN MENU
        int choice = 0;
        int selectedExercise = 0;
        var answer = "default";
        boolean validOption = false;
        // Initialize an empty array list to hold the favourite exercises
        List<Exercise> favoriteExercises = new ArrayList<>();
        Scanner scannerInt = new Scanner(System.in);
        Scanner scannerAnsw = new Scanner(System.in);
        OUTER: //Checkpoint for the primary menu
        while (!validOption) {
            System.out.println("1. View available exercises ");
            System.out.println("2. Record a Workout session ");
            System.out.println("3. View your favourite exercises ");
            System.out.println("4. Exit");
            System.out.print("Your choice: ");
            
            // Input Error catcher, just in case the user enters another type of input rather than int
            try{
                choice = scannerInt.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number!");
                scannerInt.nextLine();  //Clear the input buffer in case of an error
            }
            
            switch (choice) {
                case 1:
                    System.out.println("You've chosen View available exercises");
                    List<Exercise> exercises = new ArrayList<>();
                    // Create 10 new objects of the Class Exercise and display the array list containing them
                    exercises.add(new Exercise(1,"Lunge", 30, 10, "Like squats, lunges work all the major muscles of the lower body: gluteals, quadriceps, and hamstrings"));
                    exercises.add(new Exercise(2,"Plank", 45, 15, "Forearm plank. A full-body exercise that requires strength and balance, planks put the core into overdrive."));
                    exercises.add(new Exercise(3,"Squat", 30, 20, "Squats increase lower body and core strength, as well as flexibility in your lower back and hips."));
                    exercises.add(new Exercise(4,"Dumbbell row", 5, 2, "Not only will these make your back look killer in that dress, but dumbbell rows are also another compound exercise that strengthens multiple muscle groups"));
                    exercises.add(new Exercise(5,"Pushup", 5, 2, "Simple, but a deadly pushup. "));
                    exercises.add(new Exercise(6,"Crunche", 10, 4, "Crunches work the ab muscles; [they're] not to be mistaken as exercise that burns the fat over the abdominals."));
                    exercises.add(new Exercise(7,"Deadlift", 10, 3, "The bread and butter of countless gym routines, this move, if done properly, will predominantly engage your back and legs."));
                    exercises.add(new Exercise(8,"Lateral raise", 10, 2, "This move is similar to regular lateral raises, except here you raise the weights while slightly bent over, leading to more rear deltoid and trap development."));
                    exercises.add(new Exercise(9,"Bridge", 10, 2, " Activate your core and posterior chain (a fancy term for the backside of your body) with a bridge."));
                    // Display all existing exercises
                    Exercise.displayAllExercises(exercises);
                    // Check if the user wants to add an exercise to his favourite exercises list.
                    System.out.println("Would you like to add one of the previous exercises to your favourite list? (yes or no)");
                    // Input error catcher, in case the user inserts another word rather than yes or no
                    try{
                    answer = scannerAnsw.nextLine().toLowerCase();
                    } catch(InputMismatchException e) {
                        System.out.println("Answer only with yes/no ");
                    }
                       

                    
                    // Conditional loop if the user wants to add an exercise to the favourite list
                    INNER:
                    while (answer.equals("yes")) {

                        System.out.println("Whitch of the previous exercise would you like to add? (Select from 1 to 9)");
                        // Input Error catcher
                        try{
                            selectedExercise = scannerInt.nextInt();
                        }
                        catch (InputMismatchException e) {
                        System.out.println("Invalid input. Please enter a number");
                        scannerInt.nextLine();
                        } 
                        
                        if (selectedExercise <= 9 ) {
                            Exercise selected = exercises.get(selectedExercise - 1); // Retract 1 to obtain the correct index
                            favoriteExercises.add(selected);
                            System.out.println("Succesfull operation! One " + selected.getName() + " has been added to the favourite list.");
                            // AFTER THE EXERCISE HAS BEEN ADDED, THE USER WILL BE REDIRECTED INSIDE THE MAIN MENU
                            System.out.println("Would you like to add another exercise? (yes or no)");
                            answer = scannerAnsw.nextLine().toLowerCase();
                            if (answer.equals("yes")){
                                continue INNER;
                            }
                            else if (answer.equals("no")){
                                continue OUTER;
                            }
                            else {
                                System.out.println("This is an invalid option. Please try again");
                            }

                        }

                    }
                    if (answer.equals("no")){
                    continue OUTER;
                    }
                    else{
                        System.out.println("You inserted an invalid option. Try Again");
                        continue OUTER;
                    }

                    
                       
                    
                    /*                    validOption = true;*/
                case 2:
                    System.out.println("You've chosen Record a workout session");
                    validOption = true;
                    break OUTER;
                case 3:
                    System.out.println("You've chosen View your favourite exercises");
                    Exercise.displayFavExercises(favoriteExercises);
                    validOption = true;
                    break OUTER;
                case 4:
                    System.out.println("This program will be terminated. Thank you!");
                    validOption = true;
                    break OUTER;
                default:
                    System.out.println("Invalid option. Please try again!");
            }
        } 
    }


}
