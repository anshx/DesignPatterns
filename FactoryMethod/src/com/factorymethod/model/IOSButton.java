package com.factorymethod.model;

public class IOSButton extends Button {

    public IOSButton(ButtonType type) {
        super(type);
    }

    @Override
    public void render() {
        System.out.println("IOS Button.....");
    }
}
