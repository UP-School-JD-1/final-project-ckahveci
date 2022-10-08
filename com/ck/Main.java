package com.ck;

import com.ck.Order.Order;
import com.ck.Order.PrepareOrder;
import com.ck.Order.TakeOrder;
import com.ck.Properties.FoodsAndDrinks;
import com.ck.Properties.GetUpTable;
import com.ck.Properties.SitTable;
import com.ck.Properties.Table;
import com.ck.Properties.drinks.Drinks;
import com.ck.Properties.drinks.OrangeJuice;
import com.ck.Properties.foods.BananaCake;
import com.ck.Properties.foods.Foods;
import com.ck.domain.Customer;

public class Main {
    public static void main(String[] args) {

//        Tables table1 = new Tables(12,2,false);
        Foods bananaCake = new BananaCake("bANANA CAKE","CAKE",2.35);
        Drinks water = new OrangeJuice();
        Drinks orange = new OrangeJuice();
        FoodsAndDrinks foodsAndDrinks = new FoodsAndDrinks();
        foodsAndDrinks.addDrink(water);
        foodsAndDrinks.addDrink(orange);

        foodsAndDrinks.addFoods(bananaCake);

//        foodsAndDrinks.AddorderList();
        foodsAndDrinks.AddorderList().forEach(System.out::println);


//        foodsAndDrinks.addFoods(bananaCake);
//        Customer customer = new Customer();
//        Order order1 = new Order(12,customer);
        Table table = new Table();
        System.out.println();
        Customer customer = new Customer(table);

//        SitTable[] st = new SitTable[4];
//        GetUpTable[] gt = new GetUpTable[4];
//
//
//        System.out.println(tables.getAvaibleNumberOftables());
//
//        for (int i = 0; i < 4; i++){
//            st[i] = new SitTable(tables,customer);
//            st[i].setName("SitTable: " + i);
//            gt[i] = new GetUpTable(tables,customer);
//            gt[i].setName("GetUpTable: " + i);
//        }
//        for (int i = 0; i < 4; i++){
//            st[i].start();
//            gt[i].start();
//        }
        Order order = new Order(customer);
        TakeOrder to = new TakeOrder(order);
        PrepareOrder po = new PrepareOrder(order);
        to.start();
        po.start();

    }
}
