package com.company;

public class Sauna extends Facility implements Temperature{
    @Override
    public void degrees(int degrees) {
        System.out.println("The Sauna temp is " + degrees);
    }
    public void changeTemp(boolean temp){
        if (temp == true){
            System.out.println("Possible to change the sauna temperature");
        } else {
            System.out.println("Not possible to change the sauna temperature");
        }
    }


}
