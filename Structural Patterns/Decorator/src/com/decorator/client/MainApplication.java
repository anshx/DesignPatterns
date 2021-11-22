package com.decorator.client;

import com.decorator.model.CheeseTopping;
import com.decorator.model.PaneerTopping;
import com.decorator.model.Pizza;
import com.decorator.model.PizzaBase;

public class MainApplication {

    public static void main(String[] args) {

        Pizza p = new CheeseTopping(
                new PaneerTopping(
                        new CheeseTopping(
                                new PizzaBase()
                        )
                )
        );

        System.out.println(p.getComposition());
        System.out.println(p.getCost());
    }

}
