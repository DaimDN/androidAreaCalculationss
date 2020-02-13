package com.example.areacalculation;
import java.util.LinkedList;


public class WidgetClass {
    private String bolt;
    private  String nut;
    private String washer;



    public WidgetClass(String bolt, String nut, String washer) {
        this.bolt = bolt;
        this.nut = nut;
        this.washer = washer;
    }
    public WidgetClass(){

    }

    public String getBolt() {
        return bolt;
    }

    public void setBolt(String bolt) {
        this.bolt = bolt;
    }

    public String getNut() {
        return nut;
    }

    public void setNut(String nut) {
        this.nut = nut;
    }

    public String getWasher() {
        return washer;
    }

    public void setWasher(String washer) {
        this.washer = washer;
    }

    @Override
    public String toString() {
        return "WidgetClass{" +
                "bolt='" + bolt + '\'' +
                ", nut='" + nut + '\'' +
                ", washer='" + washer + '\'' +
                '}';
    }


}
