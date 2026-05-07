package com.tw.bootcamp.problem1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void shouldAcceptIntParams() {
        assertEquals(12, Rectangle.area(4,3), 0.0);
    }

    @Test
    void shouldAcceptDifferentTypesOfArguments() {
        assertEquals(12, Rectangle.area(4, 3.0), 0);
    }
}