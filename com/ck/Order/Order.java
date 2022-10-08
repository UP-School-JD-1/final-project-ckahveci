package com.ck.Order;

import com.ck.Properties.FoodsAndDrinks;
import com.ck.domain.Customer;

import java.util.List;

public class Order {
    private int tableNumber;
    private Customer customer;

    private List<FoodsAndDrinks> foodsAndDrinksList;

    private List<Order> orderList;
    private boolean flag = true;
    private Order order;

    public Order(Customer customer) {
        this.customer = customer;
    }
    public int getTableNumber() {
        return tableNumber;
    }
    public void setTableNumber(int tableNumber) {
        this.tableNumber = tableNumber;
    }
    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<FoodsAndDrinks> orderList(int tableNumber) {
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
    public synchronized void takeOrder(Order order) {
        while (flag == true) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        this.order = order;
        flag = true;
        notifyAll();
    }
    public synchronized Order prepareOrder() {
        while (flag == false) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        flag = false;
        notifyAll();
        return order;
    }

}
