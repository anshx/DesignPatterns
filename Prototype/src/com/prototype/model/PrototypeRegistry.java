package com.prototype.model;

import java.util.HashMap;
import java.util.Map;

public class PrototypeRegistry {
    Map<ShapeType, Shape> map;

    public PrototypeRegistry() {
        this.map = new HashMap<>();
    }

    public void addItem(ShapeType type, Shape shape) {
        this.map.put(type, shape);
    }

    public Shape getItem(ShapeType type) {
        return this.map.get(type);
    }

}
