package com.bok.f1tracker;

import com.bok.f1tracker.model.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Driver max = new Driver(1, "Max Verstappen", 1);
        Team redBull = new Team(1, "Red Bull Racing");

        ArrayList<Pitstop> noPitstops = new ArrayList<>();

        Result maxWin = new Result(max, redBull, 1, 1, 25.0, "None", false, true, "Soft", noPitstops);

        ArrayList<Result> sprintResults = new ArrayList<>();
        sprintResults.add(maxWin);
        ArrayList<Flag> noFlags = new ArrayList<>();

        Session sprint = new Session("Sprint", false, 32.5, noFlags, sprintResults);

        System.out.println("Driver: " + maxWin.getDriver().getName());
        System.out.println("Team: " + maxWin.getTeam().getName());
        System.out.println("Points: " + maxWin.getPoints());
        
        com.bok.f1tracker.api.OpenF1Client.pingAPI();
    }
}
