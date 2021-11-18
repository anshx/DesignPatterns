package com.abstractfactory.client;

import com.abstractfactory.model.Button;
import com.abstractfactory.model.Factory;
import com.abstractfactory.model.IOSFactory;
import com.abstractfactory.model.WindowsFactory;

public class MainApplication {

    public static void main(String[] args) {
        Factory f = initialize("Windows");
        Button b = f.createButton();
        b.render();
    }

    public static Factory initialize(String str) {
        if(str.equals("Windows")) {
            return new WindowsFactory();
        }
        return new IOSFactory();
    }

}
