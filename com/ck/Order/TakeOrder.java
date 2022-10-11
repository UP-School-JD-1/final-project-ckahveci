package com.ck.Order;

public class TakeOrder extends Thread {
    private Order order;

    public TakeOrder(Order order) {
        this.order = order;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            order.takeOrder(order);
            System.out.println("Taken order from customer : " + order);
            System.out.println("Waiter informed to Cooker: " + order);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }

    }
}
