package com.ck;

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

        Customer c1 = new Customer();
        Table tables = new Table(c1);
        System.out.println();

        SitTable[] st = new SitTable[4];
        GetUpTable[] gt = new GetUpTable[4];
        Customer[] customers = new Customer[30];

        for (int i = 0; i < 4; i++){
            st[i] = new SitTable(tables,customers);
            st[i].setName("SitTable: " + i);
            gt[i] = new GetUpTable(tables,customers);
            gt[i].setName("GetUpTable: " + i);
        }
        for (int i = 0; i < 4; i++){
            st[i].start();
            gt[i].start();
        }
    }
}
