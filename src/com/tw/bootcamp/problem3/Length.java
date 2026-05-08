package com.tw.bootcamp.problem3;

public class Length {
    private static final double TOLERANCE = 0.001;
    public static final int FEET_CONVERSION_FACTOR = 30;
    public static final double INCH_CONVERSION_FACTOR = 2.5;
    public static final int MM_CONVERSION_FACTOR = 10;
    private final double value;

    private Length(double value) {
        this.value = value;
    }

    private static Length create(double value) throws NegativeLengthException {
        if (value < 0) throw new NegativeLengthException("Length can't be negative");
        return new Length(value);
    }

    public static Length feet(double value) throws NegativeLengthException {
        return create(value * FEET_CONVERSION_FACTOR);
    }

    public static Length inch(double value) throws NegativeLengthException {
        return create(value * INCH_CONVERSION_FACTOR);
    }

    public static Length cm(double value) throws NegativeLengthException {
        return create(value);
    }

    public static Length mm(double value) throws NegativeLengthException {
        return create(value / MM_CONVERSION_FACTOR);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Length length)) return false;
        return isWithinTolerance(length.value);
    }

    public boolean isEqual(Length v){
        return isWithinTolerance(v.value);
    }

    private boolean isWithinTolerance (double otherValue){
        return Math.abs(value - otherValue) < TOLERANCE;
    }

    public Length add(Length length) {
        return create(value + length.value);
    }
}
