package com.kspendli.examples;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println("With Using Api Support: "+simpleReverse("kumaraswamypendli"));
        System.out.println("Without Using Api Support: "+reverseWithoutApi("kumaraswamypendli"));
    }

    private static String reverseWithoutApi(String input) {
        char[] inChars = input.toCharArray();
        char[] reChars = new char[inChars.length];
        int index = 0;
        for(int i=inChars.length-1; i >=0;i-- ){
            reChars[index] = inChars[i];
            index++;
        }
        return new String(reChars);
    }

    private static String simpleReverse(String input){
        return new StringBuilder(input).reverse().toString();
    }
}
