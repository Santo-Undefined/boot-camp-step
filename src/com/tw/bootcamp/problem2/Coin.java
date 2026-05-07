package com.tw.bootcamp.problem2;

public class Coin {

    public double probabilityForTails() {
        return 0.5;
    }

    public double probabilityForHeads() {
        return 1 - probabilityForTails();
    }
}
