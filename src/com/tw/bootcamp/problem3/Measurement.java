package com.tw.bootcamp.problem3;

public abstract class Measurement<T extends Unit<T>> {
    public abstract double toStd(double value);
    public abstract double toActual(double value);
}
