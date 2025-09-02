// File: com/example/cab/Booking.java
package com.example.cab;

public class Booking {
    private String bookingId;
    private String pickupLocation;
    private String dropLocation;
    private Car car;

    // Constructor
    public Booking(String bookingId, String pickupLocation, String dropLocation, Car car) {
        this.bookingId = bookingId;
        this.pickupLocation = pickupLocation;
        this.dropLocation = dropLocation;
        this.car = car;
    }

    @Override
    public String toString() {
        return "Booking [bookingId=" + bookingId + ", pickupLocation=" + pickupLocation +
               ", dropLocation=" + dropLocation + ", car=" + car + "]";
    }
}
