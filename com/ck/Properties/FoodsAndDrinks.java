package com.ck.Properties;

import com.ck.Order.Order;
import com.ck.Properties.drinks.Drinks;
import com.ck.Properties.foods.Foods;

import java.util.ArrayList;
import java.util.List;

public class FoodsAndDrinks {
    private Order order;
    private Foods[] foods;
    private Drinks[] drinks;

    List orderList = new ArrayList<>();
//    ArrayList<Drinks> drinksList = new ArrayList<>(1);
//    ArrayList foodsList = new ArrayList<>(2);
//
    public List AddorderList(List<Drinks> drinksList, List<Foods> foodsList, List<Foods> list){
        orderList.addAll(foodsList);
        orderList.addAll(drinksList);
        return orderList;
            };
//    public void addFoods(Foods[] foods) {
//        foodsList.add(foods);
//    }
//    public void deleteFoods(Foods foods, int index) {
//        foodsList.remove(foods);
//    }
//
//    public void addDrink(Drinks drinks) {
//        drinksList.add(drinks);
//    }




}
