package com.abstractfactory.model;

public class WindowsFactory implements Factory{

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
