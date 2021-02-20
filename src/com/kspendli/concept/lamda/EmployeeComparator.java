package com.kspendli.concept.lamda;

import com.kspendli.concept.Employee;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee e1, Employee e2) {
        int result = e1.getFirstName().compareTo(e2.getFirstName());
        if(result == 0)
            result = e1.getLastName().compareTo(e2.getLastName());
        if(result == 0)
            result = e1.getAge().compareTo(e2.getAge());
        if (result == 0)
            result = e1.getExp().compareTo(e2.getExp());
        return result;
    }
}
