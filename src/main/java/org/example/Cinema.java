package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Cinema {

    private List <Row> allRows;

    public Cinema(){
        this.allRows = new ArrayList<>();
    }

    public void addRows(Row row) {
        this.allRows.add(row);
    }

    public List<Row> getAllRows() {
        return allRows;
    }
}
