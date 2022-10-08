package com.ck.domain;

import com.ck.Order.Order;
import com.ck.Properties.Table;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    protected Table table;
    private Order order;
    private Table tables;

    public Customer( Table table) {
        this.table = table;
    }

    public Table getTable() {
        return table;
    }

    public void setTable(Table table) {
        this.table = table;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    List<Customer> customerList= new ArrayList<>(4);

}
