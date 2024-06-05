/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fitnesstracker;

/**
 *
 * @author BlackBox
 */
public class WorkoutEntry {
    private Exercise exercise;
    private int sets;
    private int reps;

    public WorkoutEntry(Exercise exercise, int sets, int reps) {
        this.exercise = exercise;
        this.sets = sets;
        this.reps = reps;
    }

    @Override
    public String toString() {
        return "Exercise: " + exercise.getName() + " - Sets: " + sets + " - Reps: " + reps;
    }
}
