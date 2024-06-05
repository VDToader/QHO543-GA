/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.fitnesstracker;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.InputMismatchException;

public class FitnessTracker {

    public static void main(String[] args) {
        System.out.println("***** Welcome to the new Fitness Tracker *****");
        // Default values to be used inside inner and outer loop inside the main menu
        int choice = 0;
        int selectedExercise = 0;
        var answer = "default";
        boolean validOption = false;

        List<Exercise> favoriteExercises = new ArrayList<>();
        Workout workout = new Workout(); // Initialize the workout instance

        Scanner scannerInt = new Scanner(System.in);
        Scanner scannerAnsw = new Scanner(System.in);

        OUTER: // Checkpoint for the primary menu
        while (!validOption) {
            System.out.println("1. View available exercises");
            System.out.println("2. Record a Workout session");
            System.out.println("3. View your favourite exercises");
            System.out.println("4. Exit");
            System.out.print("Your choice: ");

            // Input Error catcher, just in case the user enters another type of input rather than int
            try {
                choice = scannerInt.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number!");
                scannerInt.nextLine();  // Clear the input buffer in case of an error
                continue;
            }
            System.out.println("--------------------");

            switch (choice) {
                case 1:
                    System.out.println("You've chosen View available exercises");
                    List<Exercise> exercises = workout.getExercises(); // Use exercises from workout

                    // Display all existing exercises
                    Exercise.displayAllExercises(exercises);

                    // Check if the user wants to add an exercise to his favourite exercises list.
                    System.out.println("Would you like to add one of the previous exercises to your favourite list? (yes or no)");
                    // Input error catcher, in case the user inserts another word rather than yes or no
                    try {
                        answer = scannerAnsw.nextLine().toLowerCase();
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Answer only with yes/no ");
                    }

                    // Conditional loop if the user wants to add an exercise to the favourite list
                    INNER:
                    while (answer.equals("yes")) {
                        System.out.println("Which of the previous exercises would you like to add? (Select from 1 to 9)");
                        // Input Error catcher
                        try {
                            selectedExercise = scannerInt.nextInt();
                        } catch (InputMismatchException e) {
                            System.out.println("Invalid input. Please enter a number");
                            scannerInt.nextLine();
                        }

                        if (selectedExercise <= 9) {
                            Exercise selected = exercises.get(selectedExercise - 1); // Retract 1 to obtain the correct index
                            favoriteExercises.add(selected);
                            System.out.println("Successful operation! One " + selected.getName() + " has been added to the favourite list.");
                            // AFTER THE EXERCISE HAS BEEN ADDED, THE USER WILL BE REDIRECTED INSIDE THE MAIN MENU
                            System.out.println("Would you like to add another exercise? (yes or no)");
                            answer = scannerAnsw.nextLine().toLowerCase();
                            if (answer.equals("yes")) {
                                continue INNER;
                            } else if (answer.equals("no")) {
                                continue OUTER;
                            } else {
                                System.out.println("This is an invalid option. Please try again");
                            }
                        }
                    }
                    if (answer.equals("no")) {
                        continue OUTER;
                    } else {
                        System.out.println("You inserted an invalid option. Try Again");
                        continue OUTER;
                    }

                case 2:
                    System.out.println("You've chosen Record a workout session");
                    Scanner scanner = new Scanner(System.in);
                    boolean valid = true;

                    // Loop to help the user adding multiple sets for a certain workout
                    SMALLINNER:
                    while (valid) {
                        System.out.println("1. View available exercises");
                        System.out.println("2. Register workout session");
                        System.out.println("3. View workout History");
                        System.out.println("4.Go back to the previous menu");
                        System.out.print("Your choice: ");

                        int option = scanner.nextInt();
                        System.out.println("--------------------");

                        switch (option) {
                            case 1:
                                displayExercises(workout);
                                continue SMALLINNER;
                            case 2:
                                addExerciseToWorkout(workout, scanner);
                                System.out.println("Would you like to add another exercise ? (Yes or No)");
                                String case2_choice = scanner.nextLine();
                                
                                //Loop to add more exercises
                                while (case2_choice.toLowerCase().equals("yes")) {
                                addExerciseToWorkout(workout, scanner);    
                                
                                }

                            case 3:
                                workout.displayWorkout();
                                continue SMALLINNER;
                            case 4:
                                valid = false;
                                continue OUTER;
                            default:
                                System.out.println("You entered an invalid option.");
                        }
                    }
                    break;

                case 3:
                    System.out.println("You've chosen View your favourite exercises");
                    Exercise.displayFavExercises(favoriteExercises);
                    validOption = true;
                    continue OUTER;
                case 4:
                    System.out.println("This program will be terminated. Thank you!");
                    validOption = true;
                    break OUTER;
                default:
                    System.out.println("Invalid option. Please try again!");
            }
        }
    }

    private static void displayExercises(Workout workout) {
        System.out.println("Available Exercises: ");
        for (Exercise exercise : workout.getExercises()) {
            System.out.println("Exercise: " + exercise.getId() + " - " + exercise.getName());
        }
    }

    private static void addExerciseToWorkout(Workout workout, Scanner scanner) {
        displayExercises(workout);
        System.out.print("Select an exercise: ");
        int exerciseId = scanner.nextInt();

        Exercise selectedExercise = null;
        for (Exercise exercise : workout.getExercises()) {
            if (exercise.getId() == exerciseId) {
                selectedExercise = exercise;
                break;
            }
        }

        if (selectedExercise != null) {
            System.out.print("Enter the number of sets: ");
            int sets = scanner.nextInt();
            System.out.print("Enter the number of reps: ");
            int reps = scanner.nextInt();

            workout.addWorkoutEntry(new WorkoutEntry(selectedExercise, sets, reps));
            System.out.println("Exercise added successfully!");
        } else {
            System.out.println("Invalid Entry!");
        }
    }
}