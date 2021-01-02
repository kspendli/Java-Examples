package com.kspendli.examples;

import java.util.Scanner;

public class PalindromeExample {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */

        char reverseArray[] = new char[A.length()];
        char[] tempArray = A.toCharArray();
        int index = 0;
        for(int i=A.length()-1;i>=0;i--){
            reverseArray[index] = tempArray[i];
            index++;
        }

        System.out.println(A.equals(new String(reverseArray)) ? "Yes":"No");
    }
}



