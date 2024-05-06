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
    private String password;
    private int userId;
    private boolean isAdmin = false;

    // USER CLASS CONSTRUCTOR
    public User (String name, String password, int userId, boolean isAdmin){
        this.name = name;
        this.password = password;
        this.userId = userId;
        this.isAdmin = false;
    }
    
    // GETTERS
    public String getName(){
        return name;   
    }
    public String getPassword(){
        return password;
    }
    public int getUserId(){
        return userId;
    }
    public boolean getIsAdmin(){
        return isAdmin;
    }
    
    // SETTERS ( no need right now for the admin)
    public void setName(String name){
        this.name = name;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public void setUserId (int userId){
        this.userId = userId;
    }
    
    

}
    

