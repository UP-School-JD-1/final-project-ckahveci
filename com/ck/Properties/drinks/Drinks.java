package com.ck.Properties.drinks;

import java.util.Objects;

public abstract class Drinks {

    private String name;
    private double price;

    public Drinks(String name, double price) {
        this.name = name;
        this.price = price;
           }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        Drinks drinks = (Drinks) o;
        boolean bool = false;
        if (name == drinks.name && price == drinks.price)
            bool = true;
        return bool;

    }

    @Override
    public String toString() {
        return "Drinks: " +
                "name = " + name +
                ", price = " + price ;
    }
}
