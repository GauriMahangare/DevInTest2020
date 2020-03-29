package com.abstractClass;

public abstract class Vehicle {
    // abstract methods -> Cannot use Private as it will restrict access to this class only. Other inherited classes will not be able to override.
    public abstract int getNumWheels();
    public abstract String getFuelType();
    public abstract Boolean isElectric();

    //Non-Abstract methods
    void moveForward(){
        System.out.println("Vehicle is moving forward");

    }

    void brake(){
        System.out.println("vehicle is stopping");
    }

    void Steer(){
        System.out.println("vehicle is Steering");
    }


}
