package com.tw.bootcamp.problem3;

public class Length {
    private final double value;

    private Length(double value) {
        this.value = value;
    }

    public static Length feet(double value) {
        return new Length(value * 30);
    }

    public static Length inch(double value) {
        return new Length(value * 2.5);
    }

    public static Length cm(double value) {
        return new Length(value);
    }

    public boolean isEqual(Length len) {
        return value == len.value;
    }
}
