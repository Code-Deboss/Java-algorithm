package com.company;

import java.util.Scanner;

public class Algorithm {
    public static String first = "Hello";
    public static String second = "hELLo";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int num = input.nextInt();
//        int temp = num;
//
//        int rev = 0;
//        while (num > 0) {
//            rev = rev * 10 + num % 10;
//            num /= 10;
//        }
//        System.out.println(temp==rev?"palindrome":"not palindrome");

        if(first.equals(second)) {
            // Check if first string is equal to second string. lower/upper case matter.
            System.out.println("a duplicate");
        }else{
            System.out.println("not a duplicate");
        }

//        int num[] = {2,3,4,1,9};
//        for (int i = 0; i<num.length; i++){
//            System.out.println(num[i] + " index "+i);
//        }
    }
}
