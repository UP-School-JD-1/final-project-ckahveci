package com.ck.domain;

public class Chef implements Worker{
    @Override
    public void work() {
        System.out.println("Cher is a worker");
    }
}
