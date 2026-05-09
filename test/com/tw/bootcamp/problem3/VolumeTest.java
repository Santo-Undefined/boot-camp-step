package com.tw.bootcamp.problem3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VolumeTest {
    @Test
    void shouldCompareGallonAndLiter() throws NegativeVolumeException {
        Volume oneGallon = Volume.create(1, VolumeUnit.GALLON);
        Volume liter = Volume.create(3.78, VolumeUnit.LTR);
        assertEquals(oneGallon,liter);
    }

    @Test
    void shouldCompareGallonAndLiterForDifferentVolume() throws NegativeVolumeException {
        Volume oneGallon = Volume.create(1,VolumeUnit.GALLON);
        Volume liter = Volume.create(3, VolumeUnit.LTR);

        assertNotEquals(oneGallon, liter);
    }

    @Test
    void shouldThrowExceptionWhenVolumeIsNegative() {
        assertThrows(NegativeVolumeException.class, () -> Volume.create(-1, VolumeUnit.LTR));
    }

    @Test
    void shouldAddTwoUnitsOfVolume() {
        Volume oneGallon = Volume.create(1, VolumeUnit.GALLON);
        Volume oneLiter = Volume.create(1, VolumeUnit.LTR);

        assertEquals(Volume.create(4.78,VolumeUnit.GALLON), oneLiter.add(oneGallon));
    }

    @Test
    void shouldReturnTrueSameForTwoSameQuantity() {
        Volume gallon1 = Volume.create(1,VolumeUnit.GALLON);
        Volume gallon2 = Volume.create(1,VolumeUnit.GALLON);
        assertTrue(gallon1.isSame(gallon2));
    }

    @Test
    void shouldReturnFalseForTwoDifferentQuantity() {
        Volume gallon = Volume.create(1,VolumeUnit.GALLON);
        Volume liter = Volume.create(3.78,VolumeUnit.LTR);
        assertFalse(gallon.isSame(liter));
    }
}
