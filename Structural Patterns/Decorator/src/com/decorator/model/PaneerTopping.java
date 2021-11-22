package com.decorator.model;

public class PaneerTopping implements Pizza {
    Pizza p;

    public PaneerTopping(Pizza p) {
        this.p = p;
    }

    @Override
    public int getCost() {
        return p.getCost()+50;
    }

    @Override
    public String getComposition() {
        return p.getComposition() + " Paneer ";
    }
}
