package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SeatTest {

    @Test
    public void testSeatClass() {
        Seat seat = new Seat(true);
        assertEquals(true, seat.isBooked());
    }
}
