// File: com/example/cab/Car.java
package com.example.cab;

public class Car {
    private String carModel;
    private String regNo;
    private Driver driver;

    // Constructor
    public Car(String carModel, String regNo, Driver driver) {
        this.carModel = carModel;
        this.regNo = regNo;
        this.driver = driver;
    }

    @Override
    public String toString() {
        return "Car [carModel=" + carModel + ", regNo=" + regNo + ", driver=" + driver + "]";
    }
}
