package com.prototype.model;

public class Circle extends Shape {
    private int radius;

    public Circle(ShapeType type, int radius) {
        super(type);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public Shape clone() {
        return new Circle(ShapeType.CIRCLE, this.radius);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
