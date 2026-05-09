package com.tw.bootcamp.problem5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BagTest {
    @Test
    void shouldBeAbleToAddBallsToABag() throws BagOutOfCapacityException {
        Bag bag = new Bag();
        bag.addBall();
        Bag emptyBag = new Bag();
        assertNotEquals(emptyBag, bag);
    }

    @Test
    void shouldThrowExceptionWhenTryingToAddABallToAFullBag() {
        Bag bag = new Bag();
        for (int i = 0; i < 12; i++) {
            bag.addBall();
        }

        assertThrows(BagOutOfCapacityException.class, bag::addBall);
    }
}
