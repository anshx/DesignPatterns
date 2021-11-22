package com.flyweight.model;

public class Bullet {
    String color;
    String width;
    String height;

    public Bullet(String color, String width, String height) {
        this.color = color;
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Bullet{" +
                "color='" + color + '\'' +
                ", width='" + width + '\'' +
                ", height='" + height + '\'' +
                '}';
    }
}
