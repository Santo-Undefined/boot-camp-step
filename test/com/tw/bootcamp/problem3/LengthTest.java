package com.tw.bootcamp.problem3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthTest {
    @Test
    void shouldCompare1FeetWith12Inches() throws NegativeLengthException {
        Length feet = Length.create(1, LengthUnit.FEET);
        Length inch = Length.create(12, LengthUnit.INCH);
        assertEquals(feet,inch);
    }

    @Test
    void shouldCompareCmWithInches() throws NegativeLengthException {
        Length inch = Length.create(2, LengthUnit.INCH);
        Length cm = Length.create(5, LengthUnit.CM);
        assertEquals(inch, cm);
    }

    @Test
    void shouldReturnFalseOnDifferentLength() throws NegativeLengthException {
        Length oneInch = Length.create(1, LengthUnit.INCH);
        Length oneCm = Length.create(1, LengthUnit.CM);
        assertNotEquals(oneInch, oneCm);
    }

    @Test
    void shouldThrowExceptionOnNegativeLength() {
        assertThrows(NegativeLengthException.class, () -> Length.create(-12, LengthUnit.CM));
    }

    @Test
    void shouldCompareCmToMm() throws NegativeLengthException {
        Length cm = Length.create(1, LengthUnit.CM);
        Length mm = Length.create(10, LengthUnit.MM);
        assertEquals(cm, mm);
    }

    @Test
    void shouldAddTwoLengths() {
        Length twoInch = Length.create(2, LengthUnit.INCH);
        Length threeInch = Length.create(3, LengthUnit.INCH);
        assertEquals(Length.create(5, LengthUnit.INCH), twoInch.add(threeInch));
    }

    @Test
    void shouldBeAbleTwoUnitsOfLength() {
        Length twoAndHalfCentimeter = Length.create(2.5, LengthUnit.CM);
        Length twoInch = Length.create(2, LengthUnit.INCH);
        Length threeInch = Length.create(3, LengthUnit.INCH);
        assertTrue(threeInch.isSame(twoInch.add(twoAndHalfCentimeter)));
    }

    @Test
    void shouldBeTrueWhenTwoUnitAreSame() {
        Length cm1 = Length.create(1, LengthUnit.CM);
        Length cm2 = Length.create(1, LengthUnit.CM);
        assertTrue(cm1.isSame(cm2));
    }
}