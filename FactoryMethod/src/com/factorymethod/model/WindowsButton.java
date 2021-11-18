package com.factorymethod.model;

public class WindowsButton extends Button{

    public WindowsButton(ButtonType type) {
        super(type);
    }

    @Override
    public void render() {
        System.out.println("Windows Button...");
    }
}
