package com.prototype.model;

public class Rectangle extends Shape {

    int x;
    int y;

    public Rectangle(ShapeType type, int x, int y) {
        super(type);
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public Shape clone() {
        return new Rectangle(ShapeType.RECTANGLE, this.x, this.y);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
