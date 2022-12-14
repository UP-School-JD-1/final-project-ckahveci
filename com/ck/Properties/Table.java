package com.ck.Properties;

import com.ck.domain.Customer;
import com.ck.util.CollectionUtil;

public class Table {
    private int tableNumber;
    public static int NumberOftables = 14;
    private boolean isAvaible = false;
    private Customer customer;

    public Table(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    public int getTableNumber() {
        return tableNumber;
    }

    @Override
    public String toString() {
        return "table Number = " + tableNumber +
                "\nnumber Of Seats=" + NumberOftables;
    }
    @Override
    public boolean equals(Object o) {
        Table tables = (Table) o;
        boolean bool = false;
        if (tableNumber == tables.tableNumber && NumberOftables == tables.NumberOftables)
            bool = true;
        return bool;

    }

    public synchronized Customer sit() {
        while (isAvaible == false) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (tableNumber == Table.NumberOftables) {
                System.out.println("All tables are empty");
            } else if (tableNumber == 0) {
                System.out.println("Restaurant is full!!");
            } else {
            }
        }
        isAvaible = false;
        notifyAll();
        return customer;
    }

    public synchronized void getUp(Thread t, Customer customer) {
        while (isAvaible == true) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
         }
        tableNumber++;
        isAvaible = true;
        notifyAll();
    }
}
