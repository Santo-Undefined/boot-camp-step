package com.tw.bootcamp.problem2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChanceTest {
    @Test
    void shouldRepresentProbabilityOfGettingTails() {
        Chance chanceOfTails = new Chance(0.5);
        assertEquals(new Chance(0.5),chanceOfTails);
    }

    @Test
    void shouldRepresentProbabilityOfNotGettingTails() {
        Chance chance = new Chance(0.3);
        assertEquals(new Chance(0.7),chance.not());
    }

    @Test
    void shouldRepresentTheProbabilityOfGettingTailsOnTwoCoins() {
        Chance c1 = new Chance(0.5);
        Chance c2 = new Chance(0.5);
        assertEquals(new Chance(0.25), c1.and(c2));
    }

    @Test
    void shouldRepresentTheProbabilityOfGetting3OnADice() {
        Chance chance = new Chance(0.16);
        assertEquals(new Chance(0.16), chance);
    }

    @Test
    void shouldRepresentTheProbabilityOfGettingAtLeastOneTail() {
        Chance c1  = new Chance(0.5);
        Chance c2 = new Chance(0.5);

        assertEquals(new Chance(0.75), c1.or(c2));
    }
}
