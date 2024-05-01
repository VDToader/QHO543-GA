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
    private int burnedKcal;
    private int time;
    
    //Constructor
    public Exercise (String name, int burnedKcal, int time){
        this.name = name;
        this.burnedKcal = burnedKcal;
        this.time = time;
    }
    
    //Getter methods for all three attributes
    public String getName(){
        return name;
    }
    public int getburnedKcal(){
        return burnedKcal;
    }
    public int getTime(){
        return time;
    }
    
    //Setter methods for the same attributes
    public void setName(String name){
        this.name = name;
    }
    public void setburnedKcal(int burnedKcal){
        this.burnedKcal = burnedKcal;
    }
    public void setTime (int time){
        this.time = time;
    }
}
