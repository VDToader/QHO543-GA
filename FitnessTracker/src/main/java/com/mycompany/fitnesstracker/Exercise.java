/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fitnesstracker;

/**
 *
 * @author BlackBox
 */
public class Exercise {
    private String name;
    private int duration;
    private int burnedKcal;
    private String description;
   
    public Exercise (String name, int duration, int burnedKcal, String description){
        this.name = name;
        this.duration = duration;
        this.burnedKcal = burnedKcal;
        this.description = description;
    }
    // Declaring Accessors(Getters) for the Exercise Class
    public String getName (){
        return name;
    }
    public int getDuration (){
        return duration;
    }
    public int getBurnedKcal () {
        return burnedKcal;
    }
    public String description () {
        return description;
    }
    
}
