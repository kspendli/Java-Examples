package com.kspendli.examples;

import java.util.Scanner;


//One of the Hacker rank problem
public class ScannerProblem{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        String s=" ";
        s= scan.nextLine();
        s+=scan.nextLine();
        scan.close();

        // Write your code here.
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
