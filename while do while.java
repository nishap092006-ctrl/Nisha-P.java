package com.tech.shield.service;

public class WhileLoop {
    public static void main(String[] args) {
        
        // Table of 5 using while
        int i = 1;
        System.out.println("Table of 5 - while loop:");
        while (i <= 10) {
            System.out.println("5 * " + i + " = " + (5 * i));
            i++;
        }

        // Table of 5 using do-while
        i = 1;
        System.out.println("\nTable of 5 - do while loop:");
        do {
            System.out.println("5 * " + i + " = " + (5 * i));
            i++;
        } while (i <= 10);
    }
}