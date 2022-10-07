package com.ck.Order;

import com.ck.Properties.FoodsAndDrinks;
import com.ck.domain.Customer;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private int tableNumber;
    private int orderNumber;
    private Customer customer;

    private List<FoodsAndDrinks> foodsAndDrinksList = new ArrayList<>();
    private List<Order> orderList = new ArrayList<>();

    public Order (int tableNumber, Customer customer){
        this.tableNumber = tableNumber;
        this.orderNumber = tableNumber + 100;
    }


    public int getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<FoodsAndDrinks> orderList(int tableNumber){
        return foodsAndDrinksList;
    }

    public List<Order> addOrder(Order order) {
        orderList.add(order);
        return orderList;
    }

    public List<Order> removeOrder(Order order) {
        orderList.remove(order);
        return orderList;
    }
}
