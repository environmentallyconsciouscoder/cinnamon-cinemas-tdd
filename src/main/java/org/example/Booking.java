package org.example;

public class Booking {
    private String bookingId;
    private int totalBookings;

    public Booking(String bookingId, int totalBookings) {
        this.bookingId = bookingId;
        this.totalBookings = totalBookings;
    }

    public String getBookingId() {
        return bookingId;
    }

    public int getTotalBookings() {
        return totalBookings;
    }
}
