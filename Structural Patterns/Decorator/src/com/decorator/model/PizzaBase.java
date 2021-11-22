package com.decorator.model;

public class PizzaBase implements Pizza {
    public PizzaBase() {
    }

    @Override
    public int getCost() {
        return 10;
    }

    @Override
    public String getComposition() {
        return "Thin crust";
    }
}
