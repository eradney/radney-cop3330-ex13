/**
 * UCF COP3330 Fall 2021 Assignment 13 Solution
 * Copyright 2021 Emily Radney
 */

package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scnr = new Scanner(System.in);
        double P, interest, r, t, n, A;
        String inter;

        System.out.print("What is the principal amount? ");
        P = scnr.nextDouble();
        System.out.print("What is the rate? ");
        interest = scnr.nextDouble();
        r = interest / 100;
        inter = interest + "%";
        System.out.print("What is the number of years? ");
        t = scnr.nextDouble();
        System.out.print("What is the number of times the interest is compounded per year? ");
        n = scnr.nextDouble();

        A = P * Math.pow((1 + r / n), (n * t));

        System.out.printf("$%.2f invested at %s for %.0f years compounded %.0f times per year is $%.2f.\n", P, inter, t, n, A);
    }
}
