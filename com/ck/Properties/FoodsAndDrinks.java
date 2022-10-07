package com.ck.Properties;

import com.ck.Order.Order;
import com.ck.Properties.drinks.Drinks;
import com.ck.Properties.foods.Foods;

import java.util.ArrayList;
import java.util.List;
import java.util.Collection;
import java.util.Objects;

public class FoodsAndDrinks {
    private Order order;

//    List<FoodsAndDrinks> orderList = new ArrayList<>();
//    ArrayList<Drinks> drinksList = new ArrayList<>(1);
//    ArrayList<Foods> foodsList = new ArrayList<>(2);

    List orderList = new ArrayList<>();
    ArrayList<Drinks> drinksList = new ArrayList<>(1);
    ArrayList foodsList = new ArrayList<>(2);

    public List AddorderList(){
        orderList.addAll(foodsList);
        orderList.addAll(drinksList);
        return orderList;
            };
    public void addFoods(Foods foods) {
        foodsList.add(foods);
    }
    public void deleteFoods(Foods foods, int index) {
        foodsList.remove(foods);
    }

    public void addDrink(Drinks drinks) {
        drinksList.add(drinks);
    }




}
