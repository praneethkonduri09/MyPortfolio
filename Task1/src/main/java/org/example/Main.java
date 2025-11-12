package org.example;

import java.util.*;

public class Main {
    public static void helper(int num) {
        int temp = 0;
        int temp1 = num;

        while (temp1 > 0) {
            int rem = temp1 % 10;
            temp = temp * 10 + rem;
            temp1 = temp1 / 10;
        }

        if (temp == num) {
            System.out.print("Palindrome");
        } else {
            System.out.print("Not a palindrome");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        helper(num);
    }
}
