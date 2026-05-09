package com.tw.bootcamp.problem4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ParkingLotTest {
    @Test
    void shouldBeAbleToParkACar() {
        Plot plot = new Plot(5);
        ParkingLot parkingLot = new ParkingLot(plot);
        Car car = new Car();
        ParkingLot updatedParking = parkingLot.park(car);
        assertEquals(4, updatedParking.remainingSlots());
    }

    @Test
    void shouldKnowIfTheParkingIsFullWhenItIsFull() {
        Plot plot = new Plot(1);
        ParkingLot parkingLot = new ParkingLot(plot);
        Car car = new Car();
        ParkingLot updatedParking = parkingLot.park(car);
        assertTrue(updatedParking.isFull());
    }

    @Test
    void shouldKnowParkingIsNotFullWhenItIsNotFull() {
        Plot plot = new Plot(1);
        ParkingLot parkingLot = new ParkingLot(plot);
        assertFalse(parkingLot.isFull());
    }


}
