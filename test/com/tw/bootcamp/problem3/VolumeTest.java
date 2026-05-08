package com.tw.bootcamp.problem3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VolumeTest {
    @Test
    void shouldCompareGallonAndLiter() throws NegativeVolumeException {
        Volume oneGallon = Volume.gallon(1);
        Volume liter = Volume.liter(3.78);

        assertTrue(oneGallon.isEqual(liter));
    }

    @Test
    void shouldCompareGallonAndLiterForDifferentVolume() throws NegativeVolumeException {
        Volume oneGallon = Volume.gallon(1);
        Volume liter = Volume.liter(3);

        assertNotEquals(oneGallon, liter);
    }

    @Test
    void shouldThrowExceptionWhenVolumeIsNegative() {
        assertThrows(NegativeVolumeException.class, () -> Volume.gallon(-1));
    }

}
