package com.ck.Properties.foods;

public abstract class Foods {
    private String name;
    private String foodType;
    private double price;

    public Foods(String name, String foodType, double price) {
        this.name = name;
        this.foodType = foodType;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        Foods foods = (Foods) o;
        boolean bool = false;
        if (name == foods.name && price == foods.price && foodType == foods.foodType)
            bool = true;
        return bool;

    }

}
