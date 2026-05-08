package com.tw.bootcamp.problem3;

public class Inch {
    private final double value;

    public Inch(double value) {
        this.value = value;
    }


    public boolean isEqual(Feet feet) {
        return feet.isEqualTo(value);
    }

    public boolean isEqualTo(double v) {
        return (v * 12) == value;
    }
}
