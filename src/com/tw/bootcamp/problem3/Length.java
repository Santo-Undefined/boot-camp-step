package com.tw.bootcamp.problem3;

public class Length {
    private static final double TOLERANCE = 0.001;
    private final double value;
    private final LengthUnit unit;

    private Length(double value, LengthUnit unit) {
        this.value = value;
        this.unit = unit;
    }

    public static Length create(double value, LengthUnit unit) throws NegativeLengthException {
        if (value < 0) throw new NegativeLengthException("Length can't be negative");
        return new Length(unit.toStd(value), unit);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Length length)) return false;
        return isWithinTolerance(length.value);
    }

    public boolean isSame(Length l) {
        return isWithinTolerance(l.value) && unit == l.unit;
    }

    private boolean isWithinTolerance(double otherValue) {
        return Math.abs(value - otherValue) < TOLERANCE;
    }

    public Length add(Length length) {
        return create(unit.toActual(value + length.value), this.unit);
    }
}
