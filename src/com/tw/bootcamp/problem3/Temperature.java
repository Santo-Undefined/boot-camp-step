package com.tw.bootcamp.problem3;

public class Temperature {

    private static final double TOLERANCE = 0.005;
    private final double temperature;

    private Temperature(double t) {
        this.temperature = t;
    }

    public static Temperature celsius(double t) {
        return new Temperature(t);
    }

    public static Temperature fahrenheit(double t) {
        return celsius(((t * 5 ) - 160)/9);
    }

    public boolean isEqual(Temperature t) {
        return isWithinTolerance(t.temperature);
    }

    private boolean isWithinTolerance (double otherValue){
        return Math.abs(temperature - otherValue) < TOLERANCE;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Temperature that)) return false;
        return Double.compare(temperature, that.temperature) == 0;
    }

}
