package com.tw.bootcamp.problem1;

import java.awt.*;

public class Rectangle {

    private final double height;
    private final double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double area() {
        return height * width;
    }

    public double perimeter() {
        return 2 * (width + height);
    }

}
