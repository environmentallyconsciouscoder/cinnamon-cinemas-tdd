package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Row {

    private List<HashMap<String, Seat>> row;

    public Row(){
        this.row = new ArrayList<>();
    }

    public void addSeats(HashMap<String, Seat> hashMap) {
        this.row.add(hashMap);
    }

    public List<HashMap<String, Seat>> getRow() {
        return row;
    }
}
