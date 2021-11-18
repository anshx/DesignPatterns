package com.abstractfactory.model;

public class IOSFactory implements Factory{
    @Override
    public Button createButton() {
        return new IOSButton();
    }
}
