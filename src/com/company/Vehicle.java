package com.company;

public class Vehicle {
    private String Color;
    private Integer Distance;
    public Vehicle (String color) {
        this.Color = color;
    }
    public Vehicle ( ) {
        Distance = 0;
    }
    public void Move () {
        Distance ++;
    }
    public void setColor (String color) {
        this.Color = color;
    }
    public void setDistance (Integer Distance) {
        this.Distance = Distance;
    }
    public Integer getDistance () {
        return Distance;
    }
    public String getColor () {
        return Color;
    }
    public void print(){
        System.out.println("this is the vehicle");

    }


}
