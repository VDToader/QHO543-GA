/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fitnesstracker;
import java.util.Scanner;
/**
 *
 * @author BlackBox
 */

// Menu class declaration for printing the main menu, getting the user choice via input + SubMenu choice 
public class Menu {
    public Scanner scanner;
    
    // Menu scanner Constructor
    public Menu() {
        this.scanner = new Scanner(System.in);
    }
    
    // Method to show the available options: 
    public void displayMenu(){
        System.out.println("1. View available exercises ");
        System.out.println("2. Record a Workout session ");
        System.out.println("3. View your favourite exercises ");
        System.out.println("4. Exit");
    }
    
    // Get user input for the main menu choice
    public int getUserChoice() {
        int choice = scanner.nextInt();
        scanner.nextLine();
        return choice;
    }
    
    
    
}
