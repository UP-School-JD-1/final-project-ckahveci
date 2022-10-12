package com.ck;

import com.ck.Order.Order;
import com.ck.Order.PrepareOrder;
import com.ck.Order.TakeOrder;
import com.ck.Properties.GetUpTable;
import com.ck.Properties.SitTable;
import com.ck.Properties.Table;
import com.ck.util.CollectionUtil;

public class Main {
    public static void main(String[] args) {


            for (int i = 0; i < CollectionUtil.getTableList().size(); i++) {
                SitTable sitTableThread = new SitTable(CollectionUtil.getTableList().get(1),CollectionUtil.getCustomerList().get(i));
                GetUpTable getUpTable = new GetUpTable(CollectionUtil.getTableList().get(1),CollectionUtil.getCustomerList().get(i));
                sitTableThread.start();
                getUpTable.start();
            }

//        for (int i = 0; i < CollectionUtil.getCustomerList().size(); i++) {
//            Order order = new Order(CollectionUtil.getCustomerList().get(i));
//            TakeOrder takeOrder = new TakeOrder(order);
//            PrepareOrder prepareOrder = new PrepareOrder(order);
//            takeOrder.start();
//            prepareOrder.start();
//        }
    }
}
