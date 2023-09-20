package org.example;

public class Seat {
    private boolean isBooked = false;


    public Seat(boolean isBooked) {
        this.isBooked = isBooked;
    }

    public boolean isBooked() {
        return isBooked;
    }
}
