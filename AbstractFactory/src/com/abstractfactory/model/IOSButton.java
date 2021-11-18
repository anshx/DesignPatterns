package com.abstractfactory.model;

public class IOSButton implements Button {
    @Override
    public void render() {
        System.out.println("IOS Button");
    }

}
