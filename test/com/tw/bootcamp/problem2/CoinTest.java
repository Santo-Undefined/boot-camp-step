package com.tw.bootcamp.problem2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CoinTest {
    @Test
    void shouldReturnProbabilityOfGettingTails() {
        Coin coin = new Coin();
        assertEquals(0.5, coin.probabilityForTails());
    }

    @Test
    void shouldReturnProbabilityOfNotGettingTails() {
        Coin coin = new Coin();
        assertEquals(0.5, coin.probabilityForHeads());
    }
}
