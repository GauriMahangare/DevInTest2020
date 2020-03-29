package com.abstractClass;

public class VehicleTest {
    public static void main(String[] args) {
        Car myCar = new Car();
        // Overridden method
        myCar.getFuelType();
        //inherited method
        myCar.isElectric();
    }
}
