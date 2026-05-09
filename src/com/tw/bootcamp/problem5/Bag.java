package com.tw.bootcamp.problem5;

import java.util.Objects;

public class Bag {

    private final int capacity = 12;
    private int noOfBalls = 0;

    public void addBall() throws BagOutOfCapacityException {
        if (isFull()) throw new BagOutOfCapacityException("Bag is full");
        noOfBalls++;
    }

    private boolean isFull() {
        return  noOfBalls == capacity;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Bag bag)) return false;
        return capacity == bag.capacity && noOfBalls == bag.noOfBalls;
    }

}
