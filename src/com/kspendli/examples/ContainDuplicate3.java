package com.kspendli.examples;

import java.util.Enumeration;
import java.util.TreeSet;

public class ContainDuplicate3 {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();

        int[] nums = new int[]{1,5,9,1,5,9};
        int t = 3;
        int k = 2;
        for(int i=0;i< nums.length;i++){
            Integer val = set.floor(nums[i]);
            if(val !=null && nums[i]- val <= t){
                return;
            }
            Integer cVal = set.ceiling(nums[i]);
            if(cVal !=null && cVal-nums[i] <=t){
                return;
            }
            set.add(nums[i]);
            if(set.size() > k){
                set.remove(nums[i-k]);
            }
        }
    }
}
