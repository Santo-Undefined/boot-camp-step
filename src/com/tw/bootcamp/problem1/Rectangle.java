package com.tw.bootcamp.problem1;

import java.awt.*;

public class Rectangle {

    private final double height;
    private final double width;

    private Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public static Rectangle createRectangle(double height, double width) {
        return new Rectangle(height, width);
    }

    public static Rectangle createSquare(double side) {
        return createRectangle(side,side);
    }

    public double area() {
        return height * width;
    }

    public double perimeter() {
        return 2 * (width + height);
    }
}
