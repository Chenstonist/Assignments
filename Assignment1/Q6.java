package Assignments.Assignment1;

import java.math.BigInteger;

public class Q6 {
    public static void main(String[] args) {
        fibonacciNumbers();
    }

    private static void fibonacciNumbers() {
        BigInteger[] ans = new BigInteger[100];
        ans[0] = BigInteger.valueOf(1);
        ans[1] = BigInteger.valueOf(1);
        for(int i = 2; i<=99; i++){
            ans[i] = ans[i-1].add(ans[i-2]);
        }
        int count = 0;
        for(int i = 0; i<=99; i++){
            if(count == 10){
                System.out.println();
                count = 0;
            }
            System.out.print(ans[i]+" ");
            count++;
        }
    }
}
