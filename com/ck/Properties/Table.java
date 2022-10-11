package com.ck.Properties;

import com.ck.Order.Order;
import com.ck.domain.Customer;

public class Table {
    private int tableNumber;
    private int AvaibleNumberOftables = 14;
    private boolean flag = true;
    private Order order;
    private Customer customer;

    //    public Table(Customer customer) {
//        this.customer = customer;
//    }
    public Table() {

    }
//    public Tables(int tableNumber, int numberOfSeats, boolean isAvaible) {
//        this.tableNumber = tableNumber;
//        this.numberOfSeats = numberOfSeats;
//        this.isAvaible = isAvaible;
//    }


//    public int getTableNumber() {
//        return tableNumber;
//    }

    public int getAvaibleNumberOftables() {
        return AvaibleNumberOftables;
    }

    public void setAvaibleNumberOftables(int AvaibleNumberOftables) {
        this.AvaibleNumberOftables = AvaibleNumberOftables;
    }

    public void setTableNumber(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    public boolean isAvaible() {
        return isAvaible();
    }

    public void setBooked(boolean flag) {
        this.flag = flag;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }


    @Override
    public String toString() {
        return "table Number = " + tableNumber +
                "\nnumber Of Seats=" + AvaibleNumberOftables;

    }

    @Override
    public boolean equals(Object o) {
        Table tables = (Table) o;
        boolean bool = false;
        if (tableNumber == tables.tableNumber && AvaibleNumberOftables == tables.AvaibleNumberOftables && flag == tables.flag)
            bool = true;
        return bool;

    }

    public synchronized void getUp(Thread t, Customer customer) {
        if (AvaibleNumberOftables >= 0 || AvaibleNumberOftables < 14) {
            try {
                Thread.sleep(10);

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            AvaibleNumberOftables += 1;
        }
        if (AvaibleNumberOftables >= 14) {
            try {
                flag = false;
                System.out.println("Waiting get up method");
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("All tables are full");
            System.out.println("Custumer are waiting for a table");
        }
    }
    public synchronized void sit(Customer customer) {
        AvaibleNumberOftables -= 1;
        notifyAll();
    }
}
