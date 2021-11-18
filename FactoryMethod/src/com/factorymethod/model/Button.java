package com.factorymethod.model;

public abstract class Button {
    private ButtonType type;
    Button(ButtonType type) {
        this.type = type;
    }
    public abstract void render();
}
