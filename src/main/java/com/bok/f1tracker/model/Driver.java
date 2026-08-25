/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bok.f1tracker.model;

/**
 *
 * @author bok
 */
public class Driver {
    
    private int id;
    private String name;
    private int number;
    
    public Driver(int id, String name, int number) {
        this.id = id;
        this.name = name;
        this.number = number;
    }    

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }
    

    
    
    
}
