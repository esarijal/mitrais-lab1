package com.mitrais.cdc.model;

public class ReadyMadeCake extends Cake {
    private int quantity;

    public ReadyMadeCake(String name, double rate, int quantity) {
        super(name, rate);
        this.quantity = quantity;
    }

    @Override
    public double calcPrice() {
        return rate * quantity;
    }

    public int getQuantity() {
        return quantity;
    }
}