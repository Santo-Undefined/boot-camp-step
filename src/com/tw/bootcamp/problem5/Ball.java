package com.tw.bootcamp.problem5;

public enum Ball {
    RED(12),
    GREEN(3),
    BLUE(12),
    YELLOW(12);

    private final int maxAllowedCount;

    Ball(int maxAllowedCount) {
        this.maxAllowedCount = maxAllowedCount;
    }

    public boolean aboveMaxLimit(int ballCount) {
        return ballCount >= maxAllowedCount;
    }
}
