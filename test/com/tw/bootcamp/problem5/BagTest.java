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

    @Test
    void redBallsCannotBeMoreThanDoubleTheGreenBalls() {
        Bag bag = new Bag();
        bag.addBall(Ball.GREEN);
        bag.addBall(Ball.RED);
        bag.addBall(Ball.RED);
        assertThrows(MaxCapacityException.class, () -> bag.addBall(Ball.RED));
    }

    @Test
    void shouldThrowIfTheYellowBallCountExceeds40PercentOfTotalBallCount() {
        Bag bag = new Bag();
        bag.addBall(Ball.GREEN);
        bag.addBall(Ball.GREEN);
        bag.addBall(Ball.GREEN);
        bag.addBall(Ball.YELLOW);
        bag.addBall(Ball.YELLOW);
        assertThrows(MaxCapacityException.class, () -> bag.addBall(Ball.YELLOW));
    }

    @Test
    void shouldBeAbleToAddAnyNumberOfBlueBallsUptoLimit() {
        Bag bag = new Bag();
        for (int i = 0; i < 11; i++) {
            bag.addBall(Ball.BLUE);
        }

        assertDoesNotThrow(() -> bag.addBall(Ball.BLUE));
    }

    @Test
    void shouldAbleToGenerateTheSummaryForSingleColoredBall() {
        Bag bag = new Bag();
        for (int i = 0; i < 11; i++) {
            bag.addBall(Ball.BLUE);
        }

        String summary = bag.summary();
        String expectedSummary = "BLUE: 11\n\nTotal: 11";
        assertEquals( expectedSummary,summary);
    }

    @Test
    void shouldAbleToGenerateTheSummaryForMultiColoredBall() {
        Bag bag = new Bag();
        for (int i = 0; i < 11; i++) {
            bag.addBall(Ball.BLUE);
        }
        bag.addBall(Ball.GREEN);

        String summary = bag.summary();
        String expectedSummary = "BLUE: 11\nGREEN: 1\n\nTotal: 12";
        IO.println(expectedSummary);
        assertEquals( expectedSummary,summary);
    }
}
