package com.ck.Order;

public class TakeOrder extends Thread {
    private Order order;

    public TakeOrder(Order order) {
        this.order = order;
    }

    @Override
    public void run() {
        for (int i = 0 ; i < 8; i++){
            order.takeOrder(order);
            System.out.println("Taken order from customer : " + order);
        }
    }
}
