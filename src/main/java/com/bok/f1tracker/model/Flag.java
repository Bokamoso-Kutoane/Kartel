/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bok.f1tracker.model;

/**
 *
 * @author bok
 */
public class Flag {
    
    private String type;
    private int lap;
    
    public Flag(String type, int lap) {
        this.type = type;
        this.lap = lap;
    }
    
    public String getType() {
        return type;
    }

    public int getLap() {
        return lap;
    }    
    
}
