package com.kspendli.concept.lamda;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VarKeyWordExample {

    private static final Map<String, List<String>> roleBasedEmployees = new HashMap<>();

    static {
        var empNames = Arrays.asList("Kumar","chandu","siva");
        roleBasedEmployees.put("cat1",empNames);
    }

    public static void main(String[] args) {
        var emp = roleBasedEmployees.get("cat1");

        //How we are handling the value here same way var also handle the dynamic type
        roleBasedEmployees.forEach((k,v)->{
            var names = v.toArray();//It converts into Object[] dynamic type
            System.out.println("Employee Names: "+names);
        });
        System.out.println("Employee Names: "+emp.toString());
    }
}
