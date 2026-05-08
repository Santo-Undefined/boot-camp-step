package com.tw.bootcamp.problem3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthTest {
    @Test
    void shouldCompare1FeetWith12Inches() throws NegativeLengthException {
        Length feet = Length.feet(1);
        Length inch = Length.inch(12);
        assertTrue(feet.isEqual(inch));
        assertTrue(inch.isEqual(feet));
    }

    @Test
    void shouldCompareCmWithInches() throws NegativeLengthException {
        Length inch = Length.inch(2);
        Length cm = Length.cm(5);
        assertTrue(inch.isEqual(cm));
        assertTrue(cm.isEqual(inch));
    }

    @Test
    void shouldReturnFalseOnDifferentLength() throws NegativeLengthException {
        Length oneInch = Length.inch(1);
        Length oneCm = Length.cm(1);
        assertFalse(oneInch.isEqual(oneCm));
    }

    @Test
    void shouldThrowExceptionOnNegativeLength() {
        assertThrows(NegativeLengthException.class, () -> Length.inch(-12));
    }
}