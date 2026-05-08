package com.tw.bootcamp.problem4;

public class ParkingLot {
    private final Plot plot;

    public ParkingLot(Plot plot) {
        this.plot = plot;
    }

    public ParkingLot park(Car car) {
        plot.park(car);
        return new ParkingLot(plot);
    }

    public int remainingSlots(){
        return plot.remainingSpace();
    }

    public boolean isFull() {
        return plot.isFull();
    }
}
