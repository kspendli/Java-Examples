package com.kspendli.examples;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainDuplicates {

    public static void main(String[] args) {
        System.out.println(extracted());
        System.out.println(otherway());
    }

    private static boolean otherway() {
        int[] input = new int[]{12,34,11,35,11};
        Arrays.sort(input);
        for (int i=0;i<input.length-1;i++){
            if(input[i]==input[i+1]){
                return true;
            }
        }
        return false;
    }

    /*
    * NO memory concern
     */
    private static boolean extracted() {

        int[] input = new int[]{12,34,11,35,11};
        Set<Integer> result = new HashSet<>(input.length,70);
        for (int i=0; i<input.length;i++){
            if(!result.add(input[i])){
                return true;
            }
        }
        return false;
    }
}
