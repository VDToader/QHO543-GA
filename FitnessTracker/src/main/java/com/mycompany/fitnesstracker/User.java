/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fitnesstracker;
/**
 *
 * @author BlackBox
 */
public class User {
    private String name;
    private String email;
    private boolean isAdmin;

    // USER CLASS CONSTRUCTOR
    public User (String name, String email, boolean isAdmin){
        this.name = name;
        this.email = email;
        this.isAdmin = false;
    }
    
    // GETTERS
    public String getName(){
        return name;   
    }
    public String getEmail(){
        return email;
    }
    public boolean getIsAdmin(){
        return isAdmin;
    }
    
    // SETTERS
    public void setName(String name){
        this.name = name;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setIsAdmin(boolean isAdmin){
        this.isAdmin = isAdmin;
    }
    

}
    

