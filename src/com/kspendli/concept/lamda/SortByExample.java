package com.kspendli.concept.lamda;

import com.kspendli.concept.Customer;
import com.kspendli.concept.Employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortByExample {

    private static final List<Employee> employeeList = new ArrayList<>();
    private static final List<Customer> customers = new ArrayList<>();

    static {
        Employee e1 = new Employee(101, "Kumaraswamy", "Pendli", 30, 8, 80000);
        Employee e2 = new Employee(102, "MahesBabu", "Ghatamaneni", 45, 10, 90000);
        Employee e4 = new Employee(104, "Arjun", "Allu", 35, 7, 70000);
        Employee e5 = new Employee(105, "Vijay", "Devarakonda", 30, 4, 40000);
        Employee e6 = new Employee(106, "Ram", "Pothineni", 32, 5, 80000);
        Employee e7 = new Employee(106, "Ram", "Konidela", 32, 5, 80000);
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e4);
        employeeList.add(e5);
        employeeList.add(e6);
        employeeList.add(e7);

        Customer customer1 = new Customer("Kumar", "A", 10);
        Customer customer2 = new Customer("Kumar", "B", 10);
        Customer customer3 = new Customer("Kumar", "A", 14);
        Customer customer4 = new Customer("Chandu", "A", 10);
        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);
        customers.add(customer4);

    }

    public static void main(String[] args) {

        //Sort by firstname, lastname, age, exp based on Comparator comparing
        var newList = employeeList.stream().sorted(Comparator.comparing(Employee::getFirstName)
        .thenComparing(Employee::getLastName)
        .thenComparing(Employee::getAge)
        .thenComparing(Employee::getExp)).collect(Collectors.toList());
        System.out.println(newList);

        //External Comparator
        var sortedEmployees = employeeList.stream().sorted(new EmployeeComparator()).collect(Collectors.toList());
        System.out.println(sortedEmployees);

        //Customer Sorting implemented based On Comparable
        System.out.println(customers);//It wont sort by default
        System.out.println(customers.stream().sorted().collect(Collectors.toList()));
    }

}
