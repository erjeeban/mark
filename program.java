/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.marksheet;

import java.util.Scanner;

/**
 *
 * @author serjhk
 */
public class program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Marksheet");
            System.out.println("Enter Name of Student\t");
            String N = input.next();
            System.out.println("Enter the Roll No of Student");
            String R = input.next();
            System.out.println("Enter Marks in Subjects\t");
            System.out.println("1.Science\t");
            double a = input.nextFloat();
            System.out.println("2.CMaths\t");
            double b = input.nextFloat();
            System.out.println("3.Optional Maths\t");
            double c = input.nextFloat();
            System.out.println("4.Nepali\t");
            double d = input.nextFloat();
            System.out.println("5.English\t");
            double e = input.nextFloat();

            double Total = a + b + c + d + e;
            double percentage = Total / 5;

            String Division = null;
            if (percentage >= 80) {
                Division = "DISTINCTION";
            } else if (percentage >= 60) {
                Division = "FIRST DIVISION";
            } else if (percentage >= 40) {
                Division = "SECOND DIVISION";
            } else {
                Division = "THIRD DIVISION";
            }
            System.out.println("\n\nResult\n");
            System.out.println("Name:" + "\t" + "\t" + N);
            System.out.println("Roll No:" + "\t" + R);
            System.out.println("Maeksheet");
            System.out.println("1.Science" + "\t" + "t" + a);
            System.out.println("2.CMaths" + "\t" + "\t" + b);
            System.out.println("3.Optional Maths" + "\t" + "\t" + c);
            System.out.println("4.Nepali" + "\t" + "\t" + d);
            System.out.println("5.Engish" + "\t" + "\t" + e);
            System.out.println("...............................");
            if (a >= 32 && b>=32 && c>=32 && d>=32 && e>=32) {
                System.out.println("Total" + "\t" + "\t" + Total);
                System.out.println("Percentage" + "\t" + "\t" + percentage);
                System.out.println("Division" + "\t" + "\t" + Division);
            } else {
                System.out.println("FAILED");
            }

            System.out.println("Continue[Y/N]");
            String ch = input.next();
            if (ch.equalsIgnoreCase("N")) {
                System.exit(0);
            }
        }
    }
}
