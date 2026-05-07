package com.tw.bootcamp.problem1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void shouldCalculateArea() {
        Rectangle rectangle = Rectangle.createRectangle(4,3);
        assertEquals(12, rectangle.area(), 0.0);
    }

    @Test
    void shouldCalculatePerimeter() {
        Rectangle rectangle = Rectangle.createRectangle(4,3);
        assertEquals(14, rectangle.perimeter(), 0.0);
    }

    @Test
    void shouldCalculateAreaForSquare() {
        Rectangle rectangle = Rectangle.createSquare(4);
        assertEquals(16.0, rectangle.area(), 0.0);
    }

    @Test
    void shouldCalculatePerimeterOfSquare() {
        Rectangle rectangle = Rectangle.createSquare(3);
        assertEquals(12, rectangle.perimeter(), 0.0);
    }
}