package com.tw.bootcamp.problem4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class ParkingDeckTest {

    @Test
    void shouldHandleSingleParkingLot() {
        ParkingDeck parkingDeck = new ParkingDeck();

        Plot plot1 = new Plot(5);
        ParkingLot parkingLot1 = new ParkingLot(plot1);
        int parkingLotId = parkingDeck.addParkingLot(parkingLot1);

        Car car = new Car();
        ParkingLot updatedParkingLot = parkingDeck.park(parkingLotId, car);

        assertNotEquals(parkingLot1, updatedParkingLot);
        assertEquals(4, updatedParkingLot.remainingSlots());
    }

    @Test
    void shouldHandleMultipleParkingLot() {
        ParkingDeck parkingDeck = new ParkingDeck();

        Plot plot1 = new Plot(5);
        Plot plot2 = new Plot(3);
        ParkingLot parkingLot1 = new ParkingLot(plot1);
        ParkingLot parkingLot2 = new ParkingLot(plot2);
        int parkingLotId1 = parkingDeck.addParkingLot(parkingLot1);
        int parkingLotId2 = parkingDeck.addParkingLot(parkingLot2);

        Car car = new Car();

        ParkingLot updatedParkingLot1 = parkingDeck.park(parkingLotId1, car);
        ParkingLot updatedParkingLot2 = parkingDeck.park(parkingLotId2, car);

        assertEquals(4, updatedParkingLot1.remainingSlots());
        assertEquals(2, updatedParkingLot2.remainingSlots());
    }
}
