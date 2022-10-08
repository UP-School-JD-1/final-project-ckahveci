package com.ck.Properties;

import com.ck.domain.Customer;

public class SitTable extends Thread{
    Table table;
    Customer customer;
    private int count;

    public  SitTable(Table table, Customer customer ){
        this.table = table;
        this.customer = customer;
        count++;
    }

    @Override
    public void run() {
            System.out.println(this.getName() + "  before sit table number :" + table.getAvaibleNumberOftables() );
            table.sit(customer);
            System.out.println(customer);
            System.out.println(this.getName() + "  after sit table number :" + table.getAvaibleNumberOftables() );
            count++;
            if (count == 14){
                System.out.println("Restaurant is full!");
            }

    }
}
