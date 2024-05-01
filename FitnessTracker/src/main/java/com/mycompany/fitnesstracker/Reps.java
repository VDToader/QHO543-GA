package com.mycompany.fitnesstracker;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author BlackBox
 */
public class Reps {
    private int repsQuantity;
    
    //Building the constructor
    public Reps(int repsQuantity) {
        this.repsQuantity = repsQuantity;
    }
    
    // Getter method
    public int getRepsQuantity (){
        return repsQuantity;
    }
    
    //Setter method
    public void setRepsQuantity(int repsQuantity){
        this.repsQuantity = repsQuantity;
    }
}
