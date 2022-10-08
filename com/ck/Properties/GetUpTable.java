package com.ck.Properties;

import com.ck.domain.Customer;

public class GetUpTable extends Thread {
    Table table;
    Customer customer;
    private int count;

    public GetUpTable(Table table, Customer customer) {
        this.table = table;
        this.customer = customer;
        count++;
    }

    @Override
    public void run() {
            System.out.println(this.getName() + "  before get up table number :" + table.getAvaibleNumberOftables() );
            System.out.println(this.getName() + "  after get up table number :" + table.getAvaibleNumberOftables() );
            count--;
            if(count == 0){
                System.out.println("There is not any customer");
            }
    }
}
