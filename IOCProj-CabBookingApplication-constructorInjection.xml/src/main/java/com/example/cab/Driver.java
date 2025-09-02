// File: com/example/cab/Driver.java
package com.example.cab;

public class Driver {
    private String name;
    private String licenseNo;

    // Constructor
    public Driver(String name, String licenseNo) {
        this.name = name;
        this.licenseNo = licenseNo;
    }

    @Override
    public String toString() {
        return "Driver [name=" + name + ", licenseNo=" + licenseNo + "]";
    }
}
