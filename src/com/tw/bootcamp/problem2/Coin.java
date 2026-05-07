package com.tw.bootcamp.problem2;

public class Coin {

    public static final double PROBABILITY_OF_GETTING_TAILS = 0.5;
    public static final int MAX_PROBABILITY = 1;

    public double probabilityForTails() {
        return PROBABILITY_OF_GETTING_TAILS;
    }

    public double probabilityForHeads() {
        return MAX_PROBABILITY - probabilityForTails();
    }
}
