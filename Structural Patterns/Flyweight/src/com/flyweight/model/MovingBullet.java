package com.flyweight.model;

public class MovingBullet {

    double x;
    double y;
    Bullet b;

    public MovingBullet(double x, double y, Bullet b) {
        this.x = x;
        this.y = y;
        this.b = b;
    }

    @Override
    public String toString() {
        return "MovingBullet{" +
                "x=" + x +
                ", y=" + y +
                ", b=" + b +
                '}';
    }
}
