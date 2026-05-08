package com.tw.bootcamp.problem4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParkingLotTest {
    @Test
    void shouldBeAbleToParkACar() {
        Plot plot = new Plot(5);
        ParkingLot parkingLot = new ParkingLot(plot);
        Car car = new Car();
        ParkingLot updatedParking = parkingLot.park(car);

        assertEquals(4, updatedParking.remainingSlots());

    }
}
