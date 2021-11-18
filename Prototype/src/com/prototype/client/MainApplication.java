package com.prototype.client;

import com.prototype.model.*;

/*
we use prototype design pattern when we want to create same objects with just small changes
*/

public class MainApplication {
    public static void main(String[] args) {

        Shape circle = new Circle(ShapeType.CIRCLE, 10);
        Shape rectangle = new Rectangle(ShapeType.RECTANGLE, 10, 20);

        PrototypeRegistry registry = new PrototypeRegistry();
        registry.addItem(ShapeType.RECTANGLE, rectangle);
        registry.addItem(ShapeType.CIRCLE, circle);

        for(int i=0;i<5;i++) {
            Shape newCircle = registry.getItem(ShapeType.CIRCLE).clone();
            System.out.println(newCircle);
        }

    }
}
