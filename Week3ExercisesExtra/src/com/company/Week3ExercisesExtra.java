package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Week3ExercisesExtra
{
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args)
    {
        // Q1
//        int i = 1;
//        int n = 5;
//        int total = 0;
//
//        while(i <= n)
//        {
//            System.out.println("Loop1:i == " + i);
//            total += i;
//            i++;
//        }
//
//        System.out.println("Loop 1: Total == " + total);
//
//        System.out.print("Enter increment amount: ");
//        int increment = input.nextInt();
//
//        i = 1;
//        total = 0;
//
//        while(i <= n)
//        {
//            System.out.println("Loop2:i == " + i);
//            total += i;
//            i += increment;
//        }
//
//        System.out.println("Loop2: Total == " + total);


        // Q2
//        int i = 5;
//        int n = 1;
//        int total = 0;
//
//        while(i >= n)
//        {
//            System.out.println("Loop1:i == " + i);
//            total += i;
//            i--;
//        }
//
//        System.out.println("Loop1: Total == " + total);
//
//        i = 5;
//        n = 1;
//        total = 0;
//
//        System.out.print("Enter increment amount: ");
//        int increment = input.nextInt();
//
//        while(i >= n)
//        {
//            System.out.println("Loop2: i == " + i);
//            total += i;
//            i -= increment;
//        }
//
//        System.out.println("Loop2: Total == " + total);


        // Q3
//        int n = 0;
//        int total = 0;
//
//        while(n >= 0)
//        {
//            total += n;
//            System.out.print("Enter a number (-1 to exit): ");
//
//            try
//            {
//                n = input.nextInt();
//            }
//            catch(InputMismatchException e)
//            {
//                System.out.println("ERR: Tried to add invalid number to sum");
//
//                // add no value
//                n = 0;
//
//                // clear the input buffer of the Mismatch
//                input.next();
//
//                // continue the loop
//                continue;
//            }
//        }
//
//        System.out.println("Sum is " + total);


        // Q4
//        int i = 1;
//        int n = 5;
//        int total = 0;
//
//        do
//        {
//            System.out.println("Loop 1:i == " + i);
//            total += i;
//            i++;
//        } while(i <= n);
//
//        System.out.println("Loop 1:Total == " + total);
//
//        i = 1;
//        n = 5;
//        total = 0;
//
//        System.out.print("Enter increment amount: ");
//        int increment = input.nextInt();
//
//        do
//        {
//            System.out.println("Loop 2:i == " + i);
//            total += i;
//            i += increment;
//
//        } while(i <= n);
//
//        System.out.println("Loop 2:Total == " + total);


        // Q5
//        int i = 5;
//        int n = 1;
//        int total = 0;
//
//        do
//        {
//            System.out.println("Loop 1:i == " + i);
//            total += i;
//            i--;
//        } while(i >= n);
//
//        System.out.println("Loop 1:Total == " + total);
//
//        System.out.print("Enter increment amount: ");
//        int increment = input.nextInt();
//
//        i = 5;
//        n = 1;
//        total = 0;
//
//        do
//        {
//            System.out.println("Loop 2:i == " + i);
//            total += i;
//            i -= increment;
//        } while( i >= n);
//
//        System.out.println("Loop 2:Total == " + total);


        // Q6
//        int n = 0, total = 0;
//
//        do
//        {
//            total += n;
//
//            try
//            {
//                System.out.print("Enter a number (-1 to exit): ");
//                n = input.nextInt();
//            }
//            catch(InputMismatchException e)
//            {
//                System.out.println("ERR: Tried to add invalid number to sum");
//                n = 0;
//                input.next();
//                continue;
//            }
//
//        } while(n >= 0);
//
//        System.out.println("Sum is " + total);


        // Q7
//        int total = 0;
//
//        for(int i = 0; i <= 20; i++)
//        {
//            total += i;
//        }
//
//        System.out.println("Total is " + total);
//
//        total = 0;
//
//        for(int i = 5; i <= 20; i+=5)
//        {
//            total += i;
//        }
//
//        System.out.println("Total is " + total);


        // Q8
//        int total = 0;
//
//        for(int i = 40; i >= 30; i--)
//        {
//            total += i;
//        }
//
//        System.out.println("Total is " + total);
//
//        total = 0;
//
//        for(int i = 40; i >= 30; i-= 5)
//        {
//            total += i;
//        }
//
//        System.out.println("Total is " + total);


        // Q9
//        int total = 0;
//
//        for(int n = 0; n >= 0; )
//        {
//            try
//            {
//                total += n;
//                System.out.print("Enter a number (-1 to exit): ");
//                n = input.nextInt();
//            }
//            catch (InputMismatchException e)
//            {
//                System.out.println("ERR: Tried to add invalid number to sum");
//                n = 0;
//                input.next();
//                continue;
//            }
//        }
//
//        System.out.println("Sum is " + total);


        // Q10
        System.out.print("Enter number of rows: ");
        int x = input.nextInt();

        System.out.print("Enter number of columns: ");
        int y = input.nextInt();

//        for(int i = 0; i < x; i++)
//        {
//            for(int k = 0; k < y; k++)
//            {
//                System.out.print("*");
//            }
//
//            System.out.println("");
//        }

        int i = 0;

        while (i < x)
        {
            int k = 0;

            while (k < y)
            {
                System.out.print("*");
                k++;
            }

            System.out.println("");
            i++;
        }
    }
}
