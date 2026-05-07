package com.tw.bootcamp.problem1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void shouldCalculateArea() {
        Rectangle rectangle = new Rectangle(4,3);
        assertEquals(12, rectangle.area(), 0.0);
    }

    @Test
    void shouldCalculatePerimeter() {
        Rectangle rectangle = new Rectangle(4,3);
        assertEquals(14, rectangle.perimeter(), 0.0);
    }
}