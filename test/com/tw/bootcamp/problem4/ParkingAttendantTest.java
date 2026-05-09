package com.tw.bootcamp.problem4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParkingAttendantTest {
    @Test
    void parkingAttendantShouldPark() {
        ParkingLot parkingLot = new ParkingLot(5);
        ParkingDeck parkingDeck = new ParkingDeck();
        parkingDeck.addParkingLot(parkingLot);
        ParkingAttendant attendant = new ParkingAttendant(parkingDeck);
    }
}