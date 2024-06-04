package com.mycompany.fitnesstracker;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author BlackBox
 */
public class Sets {
    private int setsQuantity;
    private int repsQuantity;
    
    
    //Building the constructor
    public Sets(int setsQuantity, int repsQuantity) {
        this.setsQuantity = setsQuantity;
        this.repsQuantity = repsQuantity;
    }
    
    // Getter methods
    public int getSetsQuantity (){
        return setsQuantity;
    }
    public int getRepsQuantity (){
        return repsQuantity;
    }
    
    @Override
    public String toString(){
        return "Set{" + "setNumber = " + setsQuantity + ", reps = " + repsQuantity + "}";
    }
}
