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
    
    //Building the constructor
    public Sets(int setsQuantity) {
        this.setsQuantity = setsQuantity;
    }
    
    // Getter method
    public int getSetsQuantity (){
        return setsQuantity;
    }
    
    //Setter method
    public void setSetsQuantity(int setsQuantity){
        this.setsQuantity = setsQuantity;
    }
}
