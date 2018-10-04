package com.mitrais.cdc.model;

public class OrderCake extends Cake {
    private double weight;

    public OrderCake(String name, double rate, double weight) {
        super(name, rate);
        this.weight = weight;
    }

    @Override
    public double calcPrice() {
        return rate * weight;
    }
}
