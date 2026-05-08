package com.tw.bootcamp.problem3;

public class Volume {

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
        return create(value / 3.78);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Volume volume)) return false;
        return Double.compare(value, volume.value) == 0;
    }


}
