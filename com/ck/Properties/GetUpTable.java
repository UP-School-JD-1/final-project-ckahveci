package com.ck.Properties;

import com.ck.domain.Customer;
import com.ck.util.CollectionUtil;

public class GetUpTable extends Thread {
    Table table;
    Customer customer;

    public GetUpTable(Table table, Customer customer) {
        this.table = table;
        this.customer = customer;
     }

    @Override
    public void run() {
        table.getUp(currentThread(),customer);
            System.out.println(this.getName() + "  before get up table number :" + customer.getTable());
            System.out.println(this.getName() + "  after get up table number :" + customer.getTable());

    }
}
