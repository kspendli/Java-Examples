package com.kspendli.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalTringel {

    public static void main(String[] args) {
        List<List<Integer>> result = new ArrayList<>();

        System.out.println(pascalTringle(result, 4));
    }

    private static List<List<Integer>> pascalTringle(List<List<Integer>> result, int rows) {
        if(rows ==0){
            return result;
        }
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        result.add(firstRow);
        for(int i=1;i<rows;i++){
            List<Integer> prev = result.get(i-1);
            List<Integer> row = new ArrayList<>();
            row.add(1);
            for(int j=1;j<i;j++){
                row.add(prev.get(j-1)+prev.get(j));
            }
            row.add(1);
            result.add(row);
        }
        return result;
    }
}
