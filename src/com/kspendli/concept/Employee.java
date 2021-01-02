package com.kspendli.concept;

public class Employee {
    private int eid;
    private String firstName;
    private String lastName;
    private int exp;
    private int age;
    private int salary;

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Employee(int eid, String firstName, String lastName, int age, int exp, int salary){
        this.eid = eid;
        this.firstName = firstName;
        this.lastName = lastName;
        this.exp = exp;
        this.age = age;
        this.salary = salary;
    }
}
