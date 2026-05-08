package com.tw.bootcamp.problem4;

import java.util.ArrayList;
import java.util.List;

public class Plot {
    private final List<Car> plot;
    private final int size;

    public Plot(int size) {
        this.plot = new ArrayList<>(size);
        this.size = size;
    }

    public void park(Car car) {
        plot.add(car);
    }

    public int remainingSpace(){
        return size - plot.size();
    }

    public boolean isFull(){
        return plot.size() >= size;
    }

}
