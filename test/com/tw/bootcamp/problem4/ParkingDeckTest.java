package com.tw.bootcamp.problem4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class ParkingDeckTest {

    @Test
    void shouldHandleSingleParkingLot() {
        ParkingDeck parkingDeck = new ParkingDeck();

        ParkingLot parkingLot1 = new ParkingLot(5);
        int parkingLotId = parkingDeck.addParkingLot(parkingLot1);
        ParkingLot updatedParkingLot = parkingDeck.park(parkingLotId);

        assertEquals(4, updatedParkingLot.remainingSlots());
    }

    @Test
    void shouldHandleMultipleParkingLot() {
        ParkingDeck parkingDeck = new ParkingDeck();

        ParkingLot parkingLot1 = new ParkingLot(5);
        ParkingLot parkingLot2 = new ParkingLot(3);

        int parkingLotId1 = parkingDeck.addParkingLot(parkingLot1);
        int parkingLotId2 = parkingDeck.addParkingLot(parkingLot2);

        ParkingLot updatedParkingLot1 = parkingDeck.park(parkingLotId1);
        ParkingLot updatedParkingLot2 = parkingDeck.park(parkingLotId2);

        assertEquals(4, updatedParkingLot1.remainingSlots());
        assertEquals(2, updatedParkingLot2.remainingSlots());
    }
}
