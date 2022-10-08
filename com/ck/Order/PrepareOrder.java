package com.ck.Order;

public class PrepareOrder extends Thread{
    private Order order;

    public PrepareOrder(Order order){
        this.order = order;
    }

    @Override
    public void run() {
        Order value;
        for (int i = 0; i < 8; i++) {
            value = order.prepareOrder();
            System.out.println("Order taken from waiter to cook : " + value);

        }
    }
}
