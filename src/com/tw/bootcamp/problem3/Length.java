package com.tw.bootcamp.problem3;

public class Length {
    private final double value;

    private Length(double value) {
        this.value = value;
    }

    private static Length create(double value) throws NegativeLengthException {
        if (value < 0) throw new NegativeLengthException("Length can't be negative");
        return  new Length(value);
    }

    public static Length feet(double value) throws NegativeLengthException {
        return create(value * 30);
    }

    public static Length inch(double value) throws NegativeLengthException {
        return create(value * 2.5);
    }

    public static Length cm(double value) throws NegativeLengthException {
        return create(value);
    }

    public boolean isEqual(Length len) {
        return value == len.value;
    }
}
