/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bok.f1tracker.model;

/**
 *
 * @author bok
 */
public class Pitstop {
    
    private int lap;
    private double duration;
    private String compound;
    
    public Pitstop(int lap, double duration, String compound) {
        this.lap = lap;
        this.duration = duration;
        this.compound = compound;
    }
    
    public int getLap() {
        return lap;
    }

    public double getDuration() {
        return duration;
    }

    public String getCompound() {
        return compound;
    }    
    
}
