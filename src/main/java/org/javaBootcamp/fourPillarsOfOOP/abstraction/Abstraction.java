package org.javaBootcamp.fourPillarsOfOOP.abstraction;

abstract class Shape {
    abstract double area();
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double area() {
        return width * height;
    }
}

// Usage
public class Abstraction {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println(rectangle.area()); // Output: 50.0
    }
}
