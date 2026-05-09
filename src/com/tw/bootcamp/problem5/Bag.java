package com.tw.bootcamp.problem5;

import java.util.*;

public class Bag {

    private final int capacity = 12;
    private final Map<Ball,Integer> store = new HashMap<>();

    public void addBall(Ball b) throws MaxCapacityException {
        if (isFull()) throw new MaxCapacityException("Bag is full");
        int ballCount = store.getOrDefault(b,0);
        if (b.aboveMaxLimit(ballCount)) throw new MaxCapacityException("Given colored ball exceeded limit");

        store.put(b, ballCount +1);
    }

    private boolean isFull() {
        Collection<Integer> values = store.values();
        int totalBalls = values.stream().reduce(0, Integer::sum);
        return totalBalls == capacity;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Bag bag)) return false;
        return Objects.equals(store, bag.store);
    }

}
