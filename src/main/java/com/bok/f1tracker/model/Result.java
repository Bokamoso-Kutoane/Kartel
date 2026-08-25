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
public class Result {
    
    private Driver driver;
    private Team team;
    private int onTrackPosition;
    private int finalPosition;
    private double points;
    private String penaltyReason;
    private boolean dnf;
    private boolean driverOfDay;
    private String startingCompound;
    private List<Pitstop> pitstops;    

    public Result(Driver driver, Team team, int onTrackPosition, int finalPosition, 
            double points, String penaltyReason, boolean dnf, boolean driverOfDay, 
            String startingCompound, List<Pitstop> pitstops) {
        this.driver = driver;
        this.team = team;
        this.onTrackPosition = onTrackPosition;
        this.finalPosition = finalPosition;
        this.points = points;
        this.penaltyReason = penaltyReason;
        this.dnf = dnf;
        this.driverOfDay = driverOfDay;
        this.startingCompound = startingCompound;
        this.pitstops = pitstops;
    }

    public Driver getDriver() {
        return driver;
    }

    public Team getTeam() {
        return team;
    }

    public int getOnTrackPosition() {
        return onTrackPosition;
    }

    public int getFinalPosition() {
        return finalPosition;
    }

    public double getPoints() {
        return points;
    }

    public String getPenaltyReason() {
        return penaltyReason;
    }

    public boolean isDnf() {
        return dnf;
    }

    public boolean isDriverOfDay() {
        return driverOfDay;
    }

    public String getStartingCompound() {
        return startingCompound;
    }
    
    public List<Pitstop> getPitstops() {
        return pitstops;
    }

    
}
