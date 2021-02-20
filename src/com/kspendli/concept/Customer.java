package com.kspendli.concept;

import java.util.Comparator;

public class Customer implements Comparable<Customer> {
    private String name;
    private String type;
    private Integer totalOrders;

    public Customer(String name, String type, Integer totalOrders){
        this.name = name;
        this.type = type;
        this.totalOrders = totalOrders;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getTotalOrders() {
        return totalOrders;
    }

    public void setTotalOrders(int totalOrders) {
        this.totalOrders = totalOrders;
    }

    @Override
    public int compareTo(Customer o) {
        int result = this.name.compareTo(o.getName());
        if(result==0)
            result = this.type.compareTo(o.getType());
        if(result == 0)
            result = this.totalOrders.compareTo(o.getTotalOrders());
        return  result;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", totalOrders=" + totalOrders +
                '}';
    }
}
