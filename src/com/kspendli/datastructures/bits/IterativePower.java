package com.kspendli.datastructures.bits;

public class IterativePower {

    static int pow(int x, int n){
        int result = 1;
        while(n > 0){
            if((n&1)==1){
                result = result*x;
            }
            n = n>>1;
            x= x*x;
        }

        return result;
    }

    public static void main(String[] args) {
        pow(3,5);
        System.out.println(digitsInFactorial(19));
    }

    public static int digitsInFactorial(int N){
        // code here
        int result = 1;
        for(int i=2;i<=N;i++){
            result*=i;
        }
        System.out.println(result);
        return (int)Math.floor(Math.log10(result)+1);
    }
}
