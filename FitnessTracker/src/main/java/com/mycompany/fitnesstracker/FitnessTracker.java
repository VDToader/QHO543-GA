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
public class FitnessTracker {

    public static void main(String[] args) {
//        System.out.println("Hello World!" );
//        // TESTER FOR SETS
//        Sets five = new Sets(5);
//        int value = five.getSetsQuantity();
//        System.out.println("If Tester class is working value 5 will be printed here: " + value);
//        
//        //TESTER FOR REPS
//        Reps two = new Reps(2);
//        int tester = two.getRepsQuantity();
//        System.out.println("If Reps class is working value 2 will be printed here: " + tester);
//        
//        //TESTER FOR EXERCISE
//        Exercise exe = new Exercise("Climb", 340, 30);
//        String exeName = exe.getName();
//        int exeKcal = exe.getburnedKcal();
//        int exeTime = exe.getTime();
//        System.out.println("If the Exercise class is working a type of exercise will be printed with the total burned Kcal and taken time");
//        System.out.println("You selected the following exercise: " + exeName + " " + exeKcal + " are being burned in " + exeTime + " seconds");
          
        System.out.println("***** Welcome to the new Fitness Tracker *****");
        
        
        // TESTER FOR MAIN MENU
        Menu mainMenu = new Menu();
        int choice = 0;
        while (choice != 4){
            mainMenu.displayMenu();
            System.out.print("Your choice: ");
            choice = mainMenu.getUserChoice();
   
            switch (choice) {
                    case 1:
                        System.out.println("You've chosen View available exercises");
                        List<Exercise> exercises = new ArrayList<>();
                        // Create 10 new objects of the Class Exercise and display the array list containing them
                        exercises.add(new Exercise(1,"Lunges", 30, 10, "Like squats, lunges work all the major muscles of the lower body: gluteals, quadriceps, and hamstrings"));
                        exercises.add(new Exercise(2,"Plank", 45, 15, "Forearm plank. A full-body exercise that requires strength and balance, planks put the core into overdrive."));
                        exercises.add(new Exercise(3,"Squats", 30, 20, "Squats increase lower body and core strength, as well as flexibility in your lower back and hips."));
                        exercises.add(new Exercise(4,"Dumbbell rows", 5, 2, "Dumbbell rows. Not only will these make your back look killer in that dress, but dumbbell rows are also another compound exercise that strengthens multiple muscle groups"));
                        exercises.add(new Exercise(5,"Pushup", 5, 2, "Adding a pushup to your pike will target those shoulders even more. "));
                        exercises.add(new Exercise(6,"Crunches", 10, 4, "Crunches work the ab muscles; [they're] not to be mistaken as exercise that burns the fat over the abdominals."));
                        exercises.add(new Exercise(7,"Deadlift", 10, 3, " Deadlift. The bread and butter of countless gym routines, this move, if done properly, will predominantly engage your back and legs."));
                        exercises.add(new Exercise(8,"Lateral raise", 10, 2, "This move is similar to regular lateral raises, except here you raise the weights while slightly bent over, leading to more rear deltoid and trap development."));
                        exercises.add(new Exercise(9,"Bridge", 10, 2, " Activate your core and posterior chain (a fancy term for the backside of your body) with a bridge."));
                        exercises.add(new Exercise(10,"Burpee", 5, 2, "The burpee, a squat thrust with an additional stand between repetitions, is a full body exercise used in strength training."));
                        // Display all existing exercises
                        Exercise.displayAllExercises(exercises);
                        
                        //  Ask the user if he wants to add an exercise or more to the favourite list.
                        System.out.println("Would you like to add an exercise to your favourite list? (1 for YES or 0 for NO) ");
                        mainMenu.getUserChoice();
                        if (choice == 1){
                            System.out.println("Which exercise would you like to add? (Enter the option number)");
                            // Add the chosen element with the specific ID to the favourite list
                            System.out.println("This exercise will be added to the favourite list: ");
                            mainMenu.getUserChoice();
                        }
                        else
                        break;

                    case 2:
                        System.out.println("You've chosen Record a workout session");

                        break;

                    case 3:
                        System.out.println("You've chosen View your favourite exercises");

                        break;

                    case 4:
                        System.out.println("This program will be terminated. Thank you!");
                        break;

                    // Wrong choice chosen condition
                    default:
                        System.out.println("You selected an invalid option. Try again!");
                        break;
                            }
                        } 
    }
}
