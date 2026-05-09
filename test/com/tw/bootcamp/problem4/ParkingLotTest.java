package com.tw.bootcamp.problem4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ParkingLotTest {
    @Test
    void shouldBeAbleToParkACar() {
        ParkingLot parkingLot = new ParkingLot(5);
        ParkingLot updatedParking = parkingLot.park();
        assertEquals(4, updatedParking.remainingSlots());
    }

    @Test
    void shouldKnowIfTheParkingIsFullWhenItIsFull() {
        ParkingLot parkingLot = new ParkingLot(1);
        ParkingLot updatedParking = parkingLot.park();
        assertTrue(updatedParking.isFull());
    }

    @Test
    void shouldKnowParkingIsNotFullWhenItIsNotFull() {
        ParkingLot parkingLot = new ParkingLot(5);
        assertFalse(parkingLot.isFull());
    }
}
