package com.kspendli.datastructures.arrays;

public class CircularArrayPrint {

    public static void main(String[] args) {
        char[] a={'A','B','C','D','E'};
        circularPrint(a,8);
    }

    private static void circularPrint(char[] a, int index) {
        int length = a.length;
        for (int i=index;i<a.length+index;i++){
            System.out.print(a[i% length]+" ");
        }
    }
}
