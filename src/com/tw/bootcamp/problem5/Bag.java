package com.tw.bootcamp.problem5;

import java.util.*;

public class Bag {

    //    private final int capacity = 12;
    private final Map<Ball, Integer> store = new LinkedHashMap<>();
    private final List<Rules> rules;

    public Bag(List<Rules> rules) {
        this.rules = rules;
    }

    private boolean validateRules() {
        BagState state = createBagState();
        for (Rules r : rules) {
            boolean isValid = r.validate(state);
            if (!isValid) {
                return false;
            }
        }
        return true;
    }

    private BagState createBagState() {
        int blue = getBallCount(Ball.BLUE);
        int yellow = getBallCount(Ball.YELLOW);
        int green = getBallCount(Ball.GREEN);
        int red = getBallCount(Ball.RED);
        int total = totalBallCount();
        return new BagState(red, blue, yellow, green, total);
    }

    public void addBall(Ball b) throws MaxCapacityException {
        if (!validateRules()) throw new MaxCapacityException("action not valid");
//        if (isFull()) throw new MaxCapacityException("Bag is full");
        int ballCount = store.getOrDefault(b, 0);
//        if (!canBeAdded(b)) throw new MaxCapacityException("Given colored ball exceeded limit");

        store.put(b, ballCount + 1);
    }

    private int totalBallCount() {
        Collection<Integer> values = store.values();
        return values.stream().reduce(0, Integer::sum);
    }

    private int getBallCount(Ball b) {
        return store.getOrDefault(b, 0);
    }

//    private boolean isFull() {
//        return totalBallCount() == capacity;
//    }

    private boolean canBeAdded(Ball b) {
        switch (b) {
            case GREEN -> {
                int greenBallCount = getBallCount(b);
                return greenBallCount < 3;
            }

            case RED -> {
                int greenBallCount = getBallCount(Ball.GREEN);
                int redBallCount = getBallCount(b);
                return greenBallCount * 2 > redBallCount;
            }
            case YELLOW -> {
                double yellowBallPercent = (double) (getBallCount(b) + 1) / (totalBallCount() + 1);
                return yellowBallPercent <= 0.4;
            }

            case BLUE -> {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Bag bag)) return false;
        return Objects.equals(store, bag.store);
    }

    public String summary() {
        StringBuilder sb = new StringBuilder();
        for (Ball ball : store.keySet()) {
            sb.append(ball).append(": ").append(store.get(ball)).append("\n");
        }
        sb.append("\nTotal: ").append(totalBallCount());

        return sb.toString();
    }
}
