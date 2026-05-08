package com.tw.bootcamp.problem3;

public class Volume {


    public static final double LITER_CONVERSION_FACTOR = 3.78;
    private static final double TOLERANCE = 0.001;
    private final double value;

    public Volume(double value) {
        this.value = value;
    }

    private static Volume create(double value) throws NegativeVolumeException {
        if (value < 0) throw new NegativeVolumeException("Volume can't be negative");
        return new Volume(value);
    }
    public static Volume gallon(double value) throws NegativeVolumeException {
        return create(value);
    }

    public static Volume liter(double value) throws NegativeVolumeException {
        return create(value / LITER_CONVERSION_FACTOR);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Volume volume)) return false;
        return isWithinTolerance(volume.value);
    }

    public boolean isEqual(Volume v){
        return isWithinTolerance(v.value);
    }

    private boolean isWithinTolerance (double otherValue){
        return Math.abs(value - otherValue) < TOLERANCE;
    }

    public Volume add(Volume length) {
        return create(value + length.value);
    }

}
