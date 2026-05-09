package com.tw.bootcamp.problem4;

public interface ParkingState {
    boolean isFull(int id);
    int remainingSlots(int id);
}
