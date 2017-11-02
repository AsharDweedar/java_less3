package com.company;

public class Car extends Vehicle {
    private Integer price;
    private Integer id;
    private static int count  = 0;
    public Car (String color){
        super(color);
        id = count;
        count++;
    }
    public void setprice (Integer price) {
        this.price = price;
    }
    public Integer getPrice () {
        return price;
    }

    public String sound(){
        return "Beeb Beeb";
    }
}
