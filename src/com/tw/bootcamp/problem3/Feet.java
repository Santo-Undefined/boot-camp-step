package com.tw.bootcamp.problem3;

public class Feet {
    private final double value;

    public Feet(double value) {
        this.value = value;
    }

    public boolean isEqual(Inch inch) {
        return inch.isEqualTo(value);
    }

    public boolean isEqualTo(double v) {
        return (value * 12) == v;
    }
}

