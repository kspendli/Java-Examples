package com.kspendli.examples;

import java.util.Scanner;

public class SubstringAndSorting {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        String myArray[] = new String[s.length()];

        int count = 0;
        for(int i=0;i+k<=s.length();i++){
            myArray[i]=s.substring(i,i+k);
            count++;
        }

        for(int i = 0; i<count; i++) {
            for (int j = i+1; j<count; j++) {
                if(myArray[i].compareTo(myArray[j])>0) {
                    String temp = myArray[i];
                    myArray[i] = myArray[j];
                    myArray[j] = temp;
                }
            }
        }

        return myArray[0] + "\n" + myArray[count-1];
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}