package com.tw.bootcamp.problem4;

import java.util.HashMap;
import java.util.Map;

public class ParkingDeck implements ParkingState {
    private final Map<Integer, ParkingLot> deck = new HashMap<>();
    private int id = 1;

    public int addParkingLot(ParkingLot parkingLot) {
        deck.put(id, parkingLot);
        return id++;
    }

    public ParkingLot park(int parkingLotId) {
        ParkingLot parkingLot = deck.get(parkingLotId);
        return parkingLot.park();
    }

    @Override
    public boolean isFull(int id) {
        return deck.get(id).isFull();
    }

    @Override
    public int remainingSlots(int id) {
        return deck.get(id).remainingSlots();
    }
}
