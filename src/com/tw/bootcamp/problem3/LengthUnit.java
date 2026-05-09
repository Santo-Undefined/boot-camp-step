package com.tw.bootcamp.problem3;

public enum LengthUnit implements Unit {
    MM(0.1),
    CM(1),
    INCH(2.5),
    FEET(30);

    private final double unit;

    LengthUnit(double unit) {
        this.unit = unit;
    }

    public double toStd(double value) {
        return unit * value;
    }

    public double toActual(double value){
        return value / unit;
    }
}
