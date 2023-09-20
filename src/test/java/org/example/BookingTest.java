package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    @Test
    public void testBookingClass() {
        Booking newBooking = new Booking("B1", 3);
        assertEquals("B1", newBooking.getBookingId());
        assertEquals(3, newBooking.getTotalBookings());
    }
}
