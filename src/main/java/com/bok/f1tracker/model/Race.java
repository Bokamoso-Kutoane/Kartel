/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bok.f1tracker.model;

import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author bok
 */
public class Race {
    
    private String race_name;
    private String track_name;
    private String location;
    private int season;
    private LocalDate date;
    private List<Session> sessions;

    public Race(String race_name, String track_name, String location, int season, LocalDate date, List<Session> sessions) {
        this.race_name = race_name;
        this.track_name = track_name;
        this.location = location;
        this.season = season;
        this.date = date;
        this.sessions = sessions;
    }

    public String getRace_name() {
        return race_name;
    }

    public String getTrack_name() {
        return track_name;
    }

    public String getLocation() {
        return location;
    }

    public int getSeason() {
        return season;
    }

    public LocalDate getDate() {
        return date;
    }

    public List<Session> getSessions() {
        return sessions;
    }
    
}
