package com.tw.bootcamp.problem4;

public class ParkingLot {
    private int space;

    public ParkingLot(int size) {
        this.space = size;
    }

    public ParkingLot park() {
        if (isFull()) return null;
        this.space--;

        return this;
    }

    public int remainingSlots(){
        return space;
    }

    public boolean isFull() {
        return space == 0;
    }
}
