package com.bok.f1tracker.model;
import com.google.gson.annotations.SerializedName;

/**
 *
 * @author bok
 */
public class Driver {
    
    private int id;
    @SerializedName("full_name")
    private String name;
    @SerializedName("driver_number")
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
