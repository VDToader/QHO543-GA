/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.fitnesstracker;
/**
 *
 * @author BlackBox
 */
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
