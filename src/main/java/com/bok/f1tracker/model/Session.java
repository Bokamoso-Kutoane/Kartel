/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bok.f1tracker.model;

import java.util.List;

/**
 *
 * @author bok
 */
public class Session {
    
    private String type;
    private boolean rainfall;
    private double avgTrackTemp;
    private List<Flag> flags;
    private List<Result> results;

    public Session(String type, boolean rainfall, double avgTrackTemp, List<Flag> flags, List<Result> results) {
        this.type = type;
        this.rainfall = rainfall;
        this.avgTrackTemp = avgTrackTemp;
        this.flags = flags;
        this.results = results;
    }

    public String getType() {
        return type;
    }

    public boolean isRainfall() {
        return rainfall;
    }

    public double getAvgTrackTemp() {
        return avgTrackTemp;
    }

    public List<Flag> getFlags() {
        return flags;
    }

    public List<Result> getResults() {
        return results;
    }
   
    
}
