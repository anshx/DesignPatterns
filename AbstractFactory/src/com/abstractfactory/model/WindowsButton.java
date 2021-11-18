package com.abstractfactory.model;

public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("Windows Button");
    }
}
