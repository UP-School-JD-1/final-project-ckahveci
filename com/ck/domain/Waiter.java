package com.ck.domain;

public class Waiter implements Worker{


    @Override
    public void work() {
        System.out.println("Waiter is working");
    }
}
