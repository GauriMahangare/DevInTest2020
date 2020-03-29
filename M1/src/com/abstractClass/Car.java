package com.abstractClass;

public class Car extends Vehicle {
    // abstract methods are implemented
    @Override
    public int getNumWheels() {
        return 0;
    }

    @Override
    public String getFuelType() {
        return null;
    }

    @Override
    public Boolean isElectric() {
        return null;
    }
    //added comments to test git repo
}
