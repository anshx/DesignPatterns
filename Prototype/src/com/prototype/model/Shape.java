package com.prototype.model;

public abstract class Shape {
    ShapeType type;

    public Shape(ShapeType type) {
        this.type = type;
    }

    public abstract Shape clone();
}
