package com.tw.bootcamp.problem4;

public class ParkingAttendant implements Attendant, ParkingState {
    private final ParkingDeck parkingDeck;

    public ParkingAttendant(ParkingDeck parkingDeck) {
        this.parkingDeck = parkingDeck;
    }

    @Override
    public boolean isFull(int id) {
        return parkingDeck.isFull(id);
    }

    @Override
    public int remainingSlots(int id) {
        return parkingDeck.remainingSlots(id);
    }

    @Override
    public ParkingLot park(int id) {
        return parkingDeck.park(id);
    }
}
