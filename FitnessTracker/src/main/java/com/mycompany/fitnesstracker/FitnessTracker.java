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
public class FitnessTracker {

    public static void main(String[] args) {
        System.out.println("***** Welcome to the new Fitness Tracker *****");
        // TESTER FOR MAIN MENU
        Menu mainMenu = new Menu();
        int choice = 0;
        while (choice != 4){
            mainMenu.displayMenu();
            System.out.print("Your choice: ");
            Scanner scannerInt = new Scanner(System.in);
            choice = scannerInt.nextInt();
            scannerInt.close();
            
   
            if (choice == 1) {    
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
                exercises.add(new Exercise(0,"Burpee", 5, 2, "The burpee, a squat thrust with an additional stand between repetitions, is a full body exercise used in strength training."));
                // Display all existing exercises
                Exercise.displayAllExercises(exercises);
                
                // Check if the user wants to add an exercise to his favourite exercises list.
                System.out.println("Would you like to add one of the previous exercises to your favourite list? (Yes or No)");
                break;

            }
            else if (choice == 2) {
                System.out.println("You've chosen Record a workout session");
                break;
            }
            else if (choice == 3) {
                System.out.println("You've chosen View your favourite exercises");
                break;
            }
            else if (choice == 4) {
                System.out.println("This program will be terminated. Thank you!");
                break;
            }
                    // Wrong choice chosen condition
            else {
                System.out.println("You selected an invalid option. The program will be now terminated.");
                break;
            }
                } 
    }
}
