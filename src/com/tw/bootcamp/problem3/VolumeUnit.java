package com.tw.bootcamp.problem3;

public enum VolumeUnit implements Unit {
    LTR(1),
    GALLON(3.78);

    private final double unit;

    VolumeUnit(double unit) {
        this.unit = unit;
    }

    public double toStd(double value) {
        return unit * value;
    }

    public double toActual(double value) {
        return value / unit;
    }
}
