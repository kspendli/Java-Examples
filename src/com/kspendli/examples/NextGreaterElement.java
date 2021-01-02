package com.kspendli.examples;

import java.util.Arrays;

/*
* Given an array, print the Next Greater Element (NGE) for every element. The Next greater Element for an element x is the first greater element on the right side of x in array. Elements for which no greater element exist, consider next greater element as -1.

Examples:

For any array, rightmost element always has next greater element as -1.
For an array which is sorted in decreasing order, all elements have next greater element as -1.
For the input array [4, 5, 2, 25}, the next greater elements for each element are as follows.
Element       NGE
   4      -->   5
   5      -->   25
   2      -->   25
   25     -->   -1
d) For the input array [13, 7, 6, 12}, the next greater elements for each element are as follows.

  Element        NGE
   13      -->    -1
   7       -->     12
   6       -->     12
   12      -->     -1
* */
public class NextGreaterElement {
    public static void main(String[] args) {
        int a[] = {13, 7, 6, 12};
        printAlongWithElement(a);
        printOnlyNGEValuesInOrder(a);
    }

    private static void printOnlyNGEValuesInOrder(int a[]) {
        int result[]=new int[a.length];
        for (int i=0;i<a.length;i++){
            int cVal = a[i];
            int nGVal = -1;
            for(int j=i+1;j<a.length;j++){
                if(cVal < a[j]){
                    nGVal = a[j];
                    break;
                }
            }
            result[i]=nGVal;
            System.out.print(nGVal);
            System.out.print(i<a.length-1? ", ": "");
        }

    }

    private static void printAlongWithElement(int a[]){
        System.out.println("ELE ---> NGE");
        for (int i=0;i<a.length;i++){
            int cVal = a[i];
            int nGVal = -1;
            for(int j=i+1;j<a.length;j++){
                if(cVal < a[j]){
                    nGVal = a[j];
                    break;
                }
            }
            System.out.println(cVal+" ---> "+nGVal);
        }
    }
}
