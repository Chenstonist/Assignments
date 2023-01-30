package Assignments.Assignment1;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        String input = new Scanner(System.in).nextLine();
        System.out.println(palindromeTest(input));

    }

    private static boolean palindromeTest(String input) {
        char[] ans = input.toCharArray();
        boolean flag = true;
        for(int i = 0; i<=(ans.length-1)/2; i++){
            if(ans[i]!=ans[ans.length-1-i]){
                flag = false;
            }
        }
        return flag;
    }
}
