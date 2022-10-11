package com.ck;

import com.ck.Order.Order;
import com.ck.Order.PrepareOrder;
import com.ck.Order.TakeOrder;
import com.ck.Properties.Table;
import com.ck.util.CollectionUtil;

public class Main {
    public static void main(String[] args) {

//        Tables table1 = new Tables(12,2,false);
     //        foodsAndDrinks.addFoods(bananaCake);
//        Customer customer = new Customer();
//        Order order1 = new Order(12,customer);
        Table table = new Table();
        System.out.println();

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

        for (int i = 0; i < CollectionUtil.getCustomerList().size(); i++) {
            Order order = new Order(CollectionUtil.getCustomerList().get(i));
            TakeOrder takeOrder = new TakeOrder(order);
            PrepareOrder prepareOrder = new PrepareOrder(order);
            takeOrder.start();
            prepareOrder.start();
        }
    }
}
