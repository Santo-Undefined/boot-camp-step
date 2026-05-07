package com.tw.bootcamp.problem2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ChanceTest {
    @Test
    void shouldRepresentProbabilityOfGettingTails() throws InvalidProbabilityRangeException {
        Chance chanceOfTails = Chance.create(0.5);
        assertEquals(Chance.create(0.5), chanceOfTails);
    }

    @Test
    void shouldRepresentProbabilityOfComplementaryGettingTails() throws InvalidProbabilityRangeException {
        Chance chanceOfNotTails = Chance.create(0.3).complementary();
        assertEquals(Chance.create(0.7), chanceOfNotTails);
    }

    @Test
    void shouldRepresentTheProbabilityOfGettingTailsOnTwoCoins() throws InvalidProbabilityRangeException {
        Chance chanceOfCoin1ForTails = Chance.create(0.5);
        Chance chanceOfCoin2ForTails = Chance.create(0.5);
        assertEquals(Chance.create(0.25), chanceOfCoin1ForTails.joint(chanceOfCoin2ForTails));
    }

    @Test
    void shouldRepresentTheProbabilityOfGetting3OnADice() throws InvalidProbabilityRangeException {
        Chance chanceOfGetting3OnDice = Chance.create(0.16);
        assertEquals(Chance.create(0.16), chanceOfGetting3OnDice);
    }

    @Test
    void shouldRepresentTheProbabilityOfGettingAtLeastOneTail() throws InvalidProbabilityRangeException {
        Chance chanceOfCoin1ForTails = Chance.create(0.5);
        Chance chanceOfCoin2ForTails = Chance.create(0.5);
        assertEquals(Chance.create(0.75), chanceOfCoin1ForTails.disjunctive(chanceOfCoin2ForTails));
    }

    @Test
    void shouldThrowErrorOnOutOfBoundProbabilityValues() {
        assertThrows(InvalidProbabilityRangeException.class, () -> Chance.create(-1.0));
        assertThrows(InvalidProbabilityRangeException.class, () -> Chance.create(2.0));
    }
}
