package com.tw.bootcamp.problem3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComparatorTest {
    @Test
    void shouldCompare1FeetWith12Inches() {
        Feet feet = new Feet(1);
        Inch inch = new Inch(12);

        assertTrue(feet.isEqual(inch));
        assertTrue(inch.isEqual(feet));
    }
}