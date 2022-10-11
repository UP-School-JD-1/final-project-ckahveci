package com.ck.Order;

public class PrepareOrder extends Thread{
    private Order order;

    public PrepareOrder(Order order){
        this.order = order;
    }

    @Override
    public void run() {
        Order value;
        for (int i = 0; i < 2; i++) {
            value = order.prepareOrder();
            System.out.println("Order is cooking : " + value);
            try {
                Thread.sleep(1000);
                System.out.println("Order is ready : " + value);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
