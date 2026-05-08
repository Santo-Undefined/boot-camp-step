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
        assertEquals(inch, cm);
        assertEquals(cm, inch);
    }

    @Test
    void shouldReturnFalseOnDifferentLength() throws NegativeLengthException {
        Length oneInch = Length.inch(1);
        Length oneCm = Length.cm(1);
        assertNotEquals(oneInch, oneCm);
    }

    @Test
    void shouldThrowExceptionOnNegativeLength() {
        assertThrows(NegativeLengthException.class, () -> Length.inch(-12));
    }

    @Test
    void shouldCompareCmToMm() throws NegativeLengthException {
        Length cm = Length.cm(1);
        Length mm = Length.mm(10);
        assertEquals(cm, mm);
    }

    @Test
    void shouldAddTwoLengths() {
        Length twoInch = Length.inch(2);
        Length threeInch = Length.inch(3);
        assertEquals(Length.inch(5), twoInch.add(threeInch));
    }

    @Test
    void shouldBeAbleTwoUnitsOfLength() {
        Length twoAndHalfCentimeter = Length.cm(2.5);
        Length twoInch = Length.inch(2);
        Length threeInch = Length.inch(3);

        assertTrue(threeInch.isEqual(twoInch.add(twoAndHalfCentimeter)));
    }
}