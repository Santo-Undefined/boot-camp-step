package com.tw.bootcamp.problem1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareTest {
    @Test
    void shouldCalculateArea() {
        assertEquals(16.0, Square.area(4), 0.0);
    }

    @Test
    void shouldCalculatePerimeterOfSquare() {
        assertEquals(12, Square.perimeter(3), 0.0);
    }
}
