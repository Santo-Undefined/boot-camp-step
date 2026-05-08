package com.tw.bootcamp.problem3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthTest {
    @Test
    void shouldCompare1FeetWith12Inches() {
        Length feet = Length.feet(1);
        Length inch = Length.inch(12);
        assertTrue(feet.isEqual(inch));
        assertTrue(inch.isEqual(feet));
    }

    @Test
    void shouldCompareCmWithInches() {
        Length inch = Length.inch(2);
        Length cm = Length.cm(5);
        assertTrue(inch.isEqual(cm));
        assertTrue(cm.isEqual(inch));
    }

    @Test
    void shouldReturnFalseOnDifferentLength() {
        Length oneInch = Length.inch(1);
        Length oneCm = Length.cm(1);
        assertFalse(oneInch.isEqual(oneCm));
    }
}