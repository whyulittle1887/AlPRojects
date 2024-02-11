package com.company;

import java.util.Scanner;

public class Week3Exercises
{
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args)
    {
        Week3Exercises w3e = new Week3Exercises();
        // Q1
//        System.out.print("Enter x: ");
//        int x = input.nextInt();
//
//        System.out.print("Enter y: ");
//        int y = input.nextInt();
//
//        int sumResult = w3e.calculateSum(x, y);
//        System.out.println("The sum of " + x + " and " + y + " is " + sumResult);
//
//        int productResult = w3e.calculateProduct(x, y);
//        System.out.println("The product of " + x + " and " + y + " is " + productResult);
//
//        int differenceResult = w3e.calculateDifference(x, y);
//        System.out.println("The difference of " + x + " and " + y + " is " + differenceResult);
//
//        int quotientResult = w3e.calculateQuotient(x, y);
//        System.out.println("The quotient of " + x + " and " + y + " is " + quotientResult);


        // Q2
//        System.out.print("Enter length: ");
//        int length = input.nextInt();
//
//        System.out.print("Enter width: ");
//        int width = input.nextInt();
//
//        System.out.print("Enter height: ");
//        int height = input.nextInt();
//
//        int volume = w3e.calcVolume(length, width, height);
//        System.out.println("The volume is " + volume);


        // Q3
//        w3e.carPark();


        // Q4
//        w3e.coordGeometry();


        // Q5
//        System.out.print("Enter opposite side: ");
//        double oppositeSide = input.nextDouble();
//
//        System.out.print("Enter adjacent side: ");
//        double adjacentSide = input.nextDouble();
//
//        double hypotenuse = w3e.calcHypotenuse(oppositeSide, adjacentSide);
//        System.out.println("The length of the hypotenuse is: " + hypotenuse);


        // Q6
//        System.out.print("Enter the base: ");
//        int base = input.nextInt();
//
//        System.out.print("Enter the exponent: ");
//        int exponent = input.nextInt();
//
//        System.out.println(base + " to the power of " + exponent + " is " + (int) w3e.intPower(base, exponent));


        // Q7
//        System.out.print("Enter the number of values to be processed: ");
//        int n = input.nextInt();
//
//        int sum = w3e.sumTheValues(n);
//        System.out.println("The sum of the " + n + " values entered is " + sum);


        // Q8
//        int x = 7;
//        double y = 7.5;
//
//        System.out.println("The square of " + x + " is " + w3e.square(x));
//        System.out.println("The square of " + y + " is " + w3e.square(y));


        // Q9
        System.out.print("Enter x: ");
        int x = input.nextInt();

        System.out.print("Enter y: ");
        int y = input.nextInt();

        int sum = w3e.addNumbers(x, y);
        System.out.println(x + " + " + y + " = " + sum);

        int subtract = Week3Exercises.subtractNumbers(x, y);
        System.out.println(x + " - " + y + " = " + subtract);
    }


    // Q1 functions
    public int calculateSum(int x, int y)
    {
        return (x + y);
    }

    public int calculateProduct(int x, int y)
    {
        return (x * y);
    }

    public int calculateDifference(int x, int y)
    {
        return (x - y);
    }

    public int calculateQuotient(int x, int y)
    {
        return (x / y);
    }


    // Q2 functions
    public int calcVolume(int length, int width, int height)
    {
        return (length * width * height);
    }


    // Q3 functions
    public void carPark()
    {
        System.out.print("How many cars? ");

        int numCars = input.nextInt();

        for (int i = 0; i < numCars; i++)
        {
            System.out.print("How many hours was the car parked for? ");

            double hoursParked = input.nextDouble();

            double parkingCharge = calculateCharges(hoursParked);

            System.out.println("Car # " + (i + 1) + " was parked for " + hoursParked + " hour(s), and was charged " + parkingCharge + " Euro");
        }
    }

    public double calculateCharges(double hours)
    {
        final int HOURLY_RATE = 3;

        if (hours <= 1)
        {
            return (0);
        }
        else if (hours > 8)
        {
            return (21);
        }
        else
        {
            return ((Math.ceil(hours) * 3) - HOURLY_RATE);
        }
    }


    // Q4 functions
    public void coordGeometry()
    {
        System.out.print("Please enter x1: ");
        double x1 = input.nextDouble();

        System.out.print("Please enter y1: ");
        double y1 = input.nextDouble();

        System.out.print("Please enter x2: ");
        double x2 = input.nextDouble();

        System.out.print("Please enter y2: ");
        double y2 = input.nextDouble();

        System.out.println("Distance between the two points is: " + calcDistance(x1, y1, x2, y2));
        System.out.println("Coordinates of the midpoint are: " + calcMidpoint(x1, y1, x2, y2));
        System.out.println("The slope is: " + calcSlope(x1, y1, x2, y2));
    }

    public double calcDistance(double x1, double y1, double x2, double y2)
    {
        // https://www.purplemath.com/modules/distform.htm

        return Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
    }

    public String calcMidpoint(double x1, double y1, double x2, double y2)
    {
        // https://www.purplemath.com/modules/distform2.htm

        double xMidpoint = (x1 + x2) / 2;
        double yMidpoint = (y1 + y2) / 2;
        return ("(" + xMidpoint + ", " + yMidpoint + ")");
    }

    public double calcSlope(double x1, double y1, double x2, double y2)
    {
        // https://www.purplemath.com/modules/slope.htm

        return ((y1 - y2) / (x1 - x2));
    }


    // Q5 functions
    public double calcHypotenuse(double oppositeSide, double adjacentSide)
    {
        return (Math.sqrt(Math.pow(oppositeSide, 2) + Math.pow(adjacentSide, 2)));
    }


    // Q6 functions
    public double intPower(int base, int exponent)
    {
        // using Math.pow()
//        return ( Math.pow(base, exponent) );

        // using a forLoop
        // set result = to the initial value of base
        int result = base;

        // multiply it one less time than the exponent
        for (int i = 0; i < exponent - 1; i++)
        {
            // multiply 'base' by itself
            result *= base;
        }

        // return the final value of base
        return (result);
    }


    // Q7 functions
    public int sumTheValues(int n)
    {
        int runningTotal = 0;

        for (int i = 0; i < n; i++)
        {
            System.out.print("Enter a value: ");
            int newNum = input.nextInt();
            runningTotal += newNum;
        }

        return runningTotal;
    }


    // Q8 functions
    public double square(int x)
    {
        return (Math.pow(x, 2));
    }

    public double square(double x)
    {
        return (Math.pow(x, 2));
    }


    // Q9 functions
    public int addNumbers(int x, int y)
    {
        return (x + y);
    }

    public static int subtractNumbers(int x, int y)
    {
        return (x - y);
    }
}
