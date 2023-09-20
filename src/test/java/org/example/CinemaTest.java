package org.example;

import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class CinemaTest {

    @Test
    public void testCinemaClass() {
        Cinema cinema = new Cinema();

        Row rowA = new Row();
        Row rowB = new Row();
        Row rowC = new Row();

        for (int i = 1; i <= 5; i++) {

            String seatIdForRowA = 'A' + Integer.toString(i);
            String seatIdForRowB = 'B' + Integer.toString(i);
            String seatIdForRowC = 'C' + Integer.toString(i);

            Seat seat = new Seat(false);

            HashMap<String, Seat> seatMap = new HashMap<>();
            seatMap.put(seatIdForRowA, seat);
            seatMap.put(seatIdForRowB, seat);
            seatMap.put(seatIdForRowC, seat);

            rowA.addSeats(seatMap);
            rowB.addSeats(seatMap);
            rowC.addSeats(seatMap);
        }

        cinema.addRows(rowA);
        cinema.addRows(rowB);
        cinema.addRows(rowC);

        System.out.println(cinema.getAllRows());
        assertEquals(3, cinema.getAllRows().size());
    }
}
