package com.ck.Order;

import com.ck.domain.Customer;

public class Order {
    private int tableNumber;
    private Customer customer;

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

    @Override
    public String toString() {
        return "Order" +
                "customer=" + customer;
    //            +"\norder=" + order.foodsAndDrinksList ;
    }

    public synchronized void takeOrder(Order order) {
        while (flag == true) {
            try {
                Thread.sleep(100);
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
                Thread.sleep(100);
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
