package com.ck.Properties;

import com.ck.Order.Order;
import com.ck.domain.Customer;

public class SitTable extends Thread {
    private Table table;
    private Boolean isAvaible = true;

    Customer customer;
    private int numberOfTables = Table.NumberOftables;

    public SitTable(Table table, Customer customer) {
        this.table = table;
        this.customer = customer;
//        count++;
    }

    @Override
    public void run() {
        System.out.println(this.getName() + "  before sit table number :" + this.getName());
        table.sit();
        System.out.println(this.getName() + "  after sit table number :" + this.getName());
    }
}
