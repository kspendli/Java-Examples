package com.kspendli.concept;

public class Employee {
    private Integer eid;
    private String firstName;
    private String lastName;
    private Integer exp;
    private Integer age;
    private Integer salary;

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
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

    public Integer getExp() {
        return exp;
    }

    public void setExp(Integer exp) {
        this.exp = exp;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Employee(Integer eid, String firstName, String lastName, Integer age, Integer exp, Integer salary){
        this.eid = eid;
        this.firstName = firstName;
        this.lastName = lastName;
        this.exp = exp;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eid=" + eid +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", exp=" + exp +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
