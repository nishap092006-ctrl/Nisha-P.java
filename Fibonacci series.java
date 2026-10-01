package com.tech.shield.service;

public class WhileLoop {
    public static void main(String[] args) {
        
        int n = 20;
        int a = 0, b = 1;

        System.out.println("Fibonacci + FizzBuzz (20 terms):");

        for (int i = 1; i <= n; i++) {
            
            // FizzBuzz check on Fibonacci number 'a'
            if (a % 3 == 0 && a % 5 == 0 && a != 0) {
                System.out.println(a + " -> FizzBuzz");
            } else if (a % 3 == 0 && a != 0) {
                System.out.println(a + " -> Fizz");
            } else if (a % 5 == 0 && a != 0) {
                System.out.println(a + " -> Buzz");
            } else {
                System.out.println(a);
            }

            int next = a + b;
            a = b;
            b = next;
        }
    }
}