package com.factorymethod.client;

import com.factorymethod.model.Button;
import com.factorymethod.model.ButtonType;
import com.factorymethod.model.IOSButton;
import com.factorymethod.model.WindowsButton;

public class MainApplication {
    public static void main(String[] args) {

        Button b = initialize("Windows");
        b.render();

    }

    /*in simple factory the factory implementation can be just a simple method
    and it can be in a class which does many things*/
    public static Button initialize(String name) {
        if(name.equals("Windows")) {
            return new WindowsButton(ButtonType.Windows);
        }
        return new IOSButton(ButtonType.IOS);
    }

}
