package com.tw.bootcamp.problem3;

public class Volume {

    public static final double LITER_CONVERSION_FACTOR = 3.78;
    private static final double TOLERANCE = 0.001;
    private final double value;
    private final VolumeUnit unit;

    public Volume(double value, VolumeUnit unit) {
        this.value = value;
        this.unit = unit;
    }

    public static Volume create(double value, VolumeUnit unit) throws NegativeVolumeException {
        if (value < 0) throw new NegativeVolumeException("Volume can't be negative");
        return new Volume(unit.toStd(value), unit);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Volume volume)) return false;
        return isWithinTolerance(volume.value);
    }

    public boolean isSame(Volume v) {
        return isWithinTolerance(v.value) && unit == v.unit;
    }

    private boolean isWithinTolerance(double otherValue) {
        return Math.abs(value - otherValue) < TOLERANCE;
    }

    public Volume add(Volume length) {
        return create(value + length.value, VolumeUnit.GALLON);
    }

}
