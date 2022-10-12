package com.ck.util;

import com.ck.Properties.Table;
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
    private static List<Foods> foodsList;
    private static List<Drinks> drinksList;
    private static List orderList;
    private static List<Table> tableList;
    private static Random random = new Random();

    static {
        customerList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            customerList.add(new Customer());
        }
    }

    static {
        orderList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            orderList.add(new ArrayList<>());
        }
    }

    static {
        tableList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            tableList.add(new Table(i));
        }
    }

    static {
        customerList = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            customerList.add(new Customer());
        }
    }

    static {
        int a;
        orderList = new ArrayList<>();
        foodsList = new ArrayList<>();
        drinksList = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            a = random.nextInt(5 - 1 + 1) + 1;
            if (a == 1) {
                foodsList.add(new BananaCake());
                drinksList.add(new OrangeJuice());
            } else if (a == 2) {
                foodsList.add(new GrilledFishAndPotatoes());
                foodsList.add(new FrenchOnionSoup());
            } else if (a == 3) {
                foodsList.add(new TomatoSoup());
                foodsList.add(new GrilledFishAndPotatoes());
                drinksList.add(new MineralWater());
            } else if (a == 4) {
                foodsList.add(new BananaCake());
                drinksList.add(new MineralWater());
            } else if (a == 5) {
                foodsList.add(new TomatoSoup());
                foodsList.add(new LemonCake());
                drinksList.add(new MineralWater());
            }
            orderList.add(drinksList);
            orderList.add(foodsList);
        }
    }

    public static List<Customer> getCustomerList() {
        return customerList;
    }
    public static List getorderList() {
        return orderList;
    }

    public static List<Table> getTableList() {
        return tableList;
    }
    public static void listElementsOfCustomer() {
        ListIterator i = customerList.listIterator();
        while (i.hasNext())
            System.out.println(i.nextIndex() + ": " + i.next());
    }
    public static void listElementsOfTable() {
        ListIterator i = tableList.listIterator();
        while (i.hasNext())
            System.out.println(i.nextIndex() + ": " + i.next());
    }

    public static void listElementsOfOrderList() {
        ListIterator i = orderList.listIterator();
        while (i.hasNext())
            System.out.println(i.nextIndex() + ": " + i.next());
    }
}

