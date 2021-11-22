package com.decorator.model;

public class CheeseTopping implements Pizza{

    Pizza p;

    public CheeseTopping(Pizza p) {
        this.p = p;
    }

    @Override
    public int getCost() {
        return p.getCost()+100;
    }

    @Override
    public String getComposition() {
        return p.getComposition()+" cheese ";
    }
}
