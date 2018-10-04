package com.mitrais.cdc.model;

public abstract class Cake {

    protected String name;
    protected double rate;

    public Cake (String name, double rate) {
        this.name = name;
        this.rate = rate;
    }

    public abstract double calcPrice();

    @Override
    public String toString() {
        return "Cake{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                '}';
    }
}
