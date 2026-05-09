package com.tw.bootcamp.problem5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BagTest {
    @Test
    void shouldBeAbleToAddBallsToABag() throws MaxCapacityException {
        Bag bag = new Bag();
        bag.addBall(Ball.GREEN);
        Bag emptyBag = new Bag();
        assertNotEquals(emptyBag, bag);
    }

    @Test
    void shouldThrowExceptionWhenTryingToAddABallToAFullBag() {
        Bag bag = new Bag();
        for (int i = 0; i < 12; i++) {
            bag.addBall(Ball.BLUE);
        }
        assertThrows(MaxCapacityException.class, () -> bag.addBall(Ball.GREEN));
    }

    @Test
    void shouldOnlyMax3GreenBalls() {
        Bag bag = new Bag();
        for (int i = 0; i < 3; i++) {
            bag.addBall(Ball.GREEN);
        }
        assertThrows(MaxCapacityException.class, () -> bag.addBall(Ball.GREEN));
    }
}
