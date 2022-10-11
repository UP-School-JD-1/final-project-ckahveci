package com.ck.util;

import com.ck.Properties.FoodsAndDrinks;
import com.ck.Properties.drinks.Drinks;
import com.ck.Properties.drinks.MineralWater;
import com.ck.Properties.drinks.OrangeJuice;
import com.ck.Properties.foods.*;
import com.ck.domain.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

public class CollectionUtil {
    private static List<Customer> customerList;
    private static List<FoodsAndDrinks> foodsAndDrinksList;
    private static List<Foods> FoodsList;
    private static List<Drinks> DrinksList;
    private static Random random = new Random();

    static {
        customerList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            customerList.add(new Customer());
        }
    }

    static {
        foodsAndDrinksList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            foodsAndDrinksList.add(new FoodsAndDrinks());
        }
    }

    static {
        int a;
        for (int i = 1; i <= 20; i++) {
            a = random.nextInt(5 - 1 + 1) + 1;
            System.out.println(random);
            if (a == 1) {
                FoodsList.add(new BananaCake());
                DrinksList.add(new OrangeJuice());
            } else if (a == 2) {
                FoodsList.add(new GrilledFishAndPotatoes());
                FoodsList.add(new FrenchOnionSoup());
            } else if (a == 3) {
                FoodsList.add(new TomatoSoup());
                FoodsList.add(new GrilledFishAndPotatoes());
                DrinksList.add(new MineralWater());
            } else if (a == 4) {
                FoodsList.add(new BananaCake());
                DrinksList.add(new MineralWater());
            } else if (a == 5) {
                FoodsList.add(new TomatoSoup());
                FoodsList.add(new LemonCake());
                DrinksList.add(new MineralWater());
            }
            FoodsAndDrinks foodsAndDrinks = new FoodsAndDrinks();
            foodsAndDrinksList.add((FoodsAndDrinks) foodsAndDrinks.AddorderList(DrinksList, FoodsList, FoodsList));
        }
    }

    public static List<Customer> getCustomerList() {
        return customerList;
    }

    public static void listElementsOfCustomer() {
        ListIterator i = customerList.listIterator();
        while (i.hasNext())
            System.out.println(i.nextIndex() + ": " + i.next());
    }

    public static List<FoodsAndDrinks> getFoodsAndDrinksList() {
        return foodsAndDrinksList;
    }

    public static void listElementsOfFoodsAndDrinks() {
        ListIterator i = foodsAndDrinksList.listIterator();
        while (i.hasNext())
            System.out.println(i.nextIndex() + ": " + i.next());
    }
}

