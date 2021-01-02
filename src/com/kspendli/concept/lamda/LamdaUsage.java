package com.kspendli.concept.lamda;

import com.kspendli.concept.Employee;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class LamdaUsage {

    public static void main(String[] args) {

        //Adding List of Employees Here... conside these details we get from Database
        Employee e1 = new Employee(101, "Kumaraswamy", "Pendli", 30, 8, 80000);
        Employee e2 = new Employee(102, "MahesBabu", "Ghatamaneni", 45, 10, 90000);
        Employee e3 = new Employee(103, "Ramcharan", "Konidela", 35, 6, 60000);
        Employee e4 = new Employee(104, "Arjun", "Allu", 35, 7, 70000);
        Employee e5 = new Employee(105, "Vijay", "Devarakonda", 30, 4, 40000);
        Employee e6 = new Employee(106, "Ram", "Pothineni", 32, 5, 80000);
        Employee e7 = new Employee(106, "Ram", "Konidela", 32, 5, 80000);

        List<Employee> employeeList = Arrays.asList(new Employee[]{e1, e2, e3, e4, e5, e6, e7});

        //1. can you print the name of employees who are having more than 5 years
        morethanExperience(employeeList, 5);
        System.out.println("-----------------------------");

        //2. Can you print total salary of all employees(i know this kind of things we can do it in SQL very easily)
        totalSalaryCount(employeeList);
        System.out.println("-----------------------------");

        //3. can you print total count of employees who are having more than 50k salary
        countOnSalaryLimit(employeeList, 50000);
        System.out.println("-----------------------------");

        //4. Can you print/Separate ALl Employees based on Age
        employeesBasedAge(employeeList);
        System.out.println("-----------------------------");

        //5. can you print employees firstname's for related age Group
        employeesBasedAgeGroupAndPrintFirstNames(employeeList);
        System.out.println("-----------------------------");

        //6. Extension of 5th questions print group values but in sorting
        employeesByAgeGroupAndSortAndPrintFirstNames(employeeList);
        System.out.println("-----------------------------");

        //7. can you group by age and exp
        employeesBasedAgeAndExp(employeeList);
        System.out.println("-----------------------------");

        //8. can you sum salary of employees based on experience
        sumBasedOnExp(employeeList);
        System.out.println("-----------------------------");

        //9. can you print the highest salary of employees based on experience
        maxSalaryBasedOnExperience(employeeList);
        System.out.println("-----------------------------");

        //10.Print employee first names based on ascending order
        sortByFirstName(employeeList);
        System.out.println("-----------------------------");

        //11. sort employee first name and last name on natural order
        sortByFirstNameAndAge(employeeList);
        System.out.println("-----------------------------");

        //12. sort by employee first name not a natural order
        reverseSortByFirstName(employeeList);
        System.out.println("-----------------------------");
    }



    private static void morethanExperience(List<Employee> employeeList, int exp) {
        employeeList.stream()
                .filter(e -> e.getExp() > exp)
                .forEach(e -> System.out.println(e.getFirstName()+" "+e.getLastName()));
    }

    private static void totalSalaryCount(List<Employee> employeeList) {
        long totalAmount = employeeList.stream()
                .map(e->e.getSalary())
                .reduce(0,Integer::sum);
        System.out.println("TotalEmployees Salary Count: "+totalAmount);
    }

    private static void countOnSalaryLimit(List<Employee> employeeList, int sal) {
        long count = employeeList.stream()
                .filter(employee -> employee.getSalary() > sal)
                .map(e->e.getSalary())
                .collect(Collectors.counting());
        System.out.println("Total Count give limit salary employees: "+count);
    }

    private static void employeesBasedAge(List<Employee> employeeList) {
        Map<Integer, List<Employee>> empByAgeGroup = employeeList.stream()
                                                    .collect(groupingBy(Employee::getAge)); // Simple Grouping
        System.out.println("Employees Based On Age Group: "+empByAgeGroup);
    }

    private static void employeesBasedAgeGroupAndPrintFirstNames(List<Employee> employeeList) {
        Map<Integer, List<String>> groupByValues = employeeList.stream()
                .collect(groupingBy(Employee::getAge, mapping(Employee::getFirstName, Collectors.toList())));
        System.out.println("Employees Based On age group and Print only names: "+groupByValues);
    }


    private static void employeesByAgeGroupAndSortAndPrintFirstNames(List<Employee> employeeList) {
        Map<Integer, List<String>> groupByValues = employeeList.stream()
                .collect(groupingBy(Employee::getAge, TreeMap::new, mapping(Employee::getFirstName, Collectors.toList())));
        System.out.println("Employees by age and sort and Print only names: "+groupByValues);
    }

    private static void employeesBasedAgeAndExp(List<Employee> employeeList) {
        Map<Integer, Map<Integer, List<Employee>>> empByAgeGroup = employeeList.stream()
                .collect(groupingBy(Employee::getAge, groupingBy(Employee::getExp))); // Simple Grouping
        System.out.println("Employees Based on Age Group and Experience: "+empByAgeGroup);
    }

    private static void sumBasedOnExp(List<Employee> employeeList) {
        Map<Integer, Long> sumValues = employeeList.stream()
                .collect(groupingBy(Employee::getExp, summingLong(Employee::getSalary)));
        System.out.println("Employees Salaray's sum based on Experience: "+sumValues);
    }

    private static void maxSalaryBasedOnExperience(List<Employee> employeeList) {
        Map<Integer, Optional<Employee>> maxSalaryValues = employeeList.stream()
                .collect(groupingBy(Employee::getExp, maxBy(Comparator.comparingInt(Employee::getSalary))));
        System.out.println("Based on Experience finding the max salary values: "+maxSalaryValues);
    }

    private static void sortByFirstName(List<Employee> employeeList) {
        employeeList.stream()
                .sorted(Comparator.comparing(Employee::getFirstName))
                .map(Employee::getFirstName)
                .forEach(name-> System.out.println(name));
    }

    private static void sortByFirstNameAndAge(List<Employee> employeeList) {
        employeeList.stream()
                .sorted(Comparator
                        .comparing(Employee::getFirstName)
                        .thenComparing(Employee::getLastName))
                .map(employee -> employee.getFirstName()+" "+employee.getLastName())
                .forEach(name-> System.out.println(name));
    }

    private static void reverseSortByFirstName(List<Employee> employeeList) {
        employeeList.stream()
                .sorted(Comparator.comparing(Employee::getFirstName,Comparator.reverseOrder()))
                .map(Employee::getFirstName)
                .forEach(name-> System.out.println(name));
    }

}

