package com.gwc.bisv;

import java.util.Scanner;

public class Fibonacci {
    // Version 1: basic for loop - learning loop concept
    public static void main(String[] args) {
        int n = 10, firstTerm = 0, secondTerm = 1;
        System.out.println("Fibonacci Series till " + n + " terms:");

        for (int i = 1; i <= n; ++i) {
            System.out.print(firstTerm + ", ");

            // compute the next term
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }

      // Version 2: Learning While loop
//    public static void main(String[] args) {
//
//        int i = 1, count = 10, firstTerm = 0, secondTerm = 1;
//        System.out.println("Fibonacci Series till " + n + " terms:");
//
//        while (i <= n) {
//            System.out.print(firstTerm + ", ");
//
//            int nextTerm = firstTerm + secondTerm;
//            firstTerm = secondTerm;
//            secondTerm = nextTerm;
//
//            i++;
//        }
//    }

//    // Version 3: Program take user input
//    public static void main(String[] args) {
//
//        int n, firstTerm = 0, secondTerm = 1;
//        System.out.println("How may numbers you want in the sequence:");
//        Scanner scanner = new Scanner(System.in);
//        n = scanner.nextInt();
//        scanner.close();
//        System.out.print("Fibonacci Series of "+ n +" numbers:");
//
//        int i=1;
//        while(i<=n)
//        {
//            System.out.print(firstTerm+" ");
//            int sumOfPrevTwo = firstTerm + secondTerm;
//            firstTerm = secondTerm;
//            secondTerm = sumOfPrevTwo;
//            i++;
//        }
//    }
}
