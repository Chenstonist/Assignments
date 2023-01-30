package Assignments.Assignment1;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        int year = new Scanner(System.in).nextInt();
        leapYear(year);
    }

    private static void leapYear(int year) {
        System.out.println((year%4==0 && year%100!=0)||(year%400==0));
    }
}
