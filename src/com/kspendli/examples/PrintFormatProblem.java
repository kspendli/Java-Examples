package com.kspendli.examples;

import java.util.Scanner;
//Print string charecter lenth is max 15 and it should be left justfied and digit should max lenth is 3 and if 99 it should print as 099
public class PrintFormatProblem {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            System.out.printf("%-15s%03d%n",s1,x);
        }
        System.out.println("================================");
    }
}
