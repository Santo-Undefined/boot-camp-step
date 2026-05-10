package com.tw.bootcamp.problem5;

public enum Rules {
    BAG_CAPACITY_OF_TWO((BagState state) -> state.totalBalls() < 2),
    BAG_CAPACITY_OF_TWELVE((BagState state) -> state.totalBalls() < 12);

    private final Rule rule;

    Rules(Rule rule) {
        this.rule = rule;
    }

    boolean validate (BagState state){
        return rule.rule(state);
    }
}
