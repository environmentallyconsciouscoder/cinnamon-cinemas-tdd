package org.example;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class RowTest {

    @Test
    public void testRowConstructor() {
        Row rowA = new Row();
        assertEquals(new ArrayList<>(), rowA.getRow());
    }

    @Test
    public void testAddSeats() {
        Row rowA = new Row();
        for (int i = 1; i <= 5; i++) {
            String seatId = 'A' + Integer.toString(i);
            Seat seat = new Seat(true);

            HashMap<String, Seat> seatMap = new HashMap<>();
            seatMap.put(seatId, seat);

            rowA.addSeats(seatMap);
        }
        assertEquals(5, rowA.getRow().size());
    }
}
