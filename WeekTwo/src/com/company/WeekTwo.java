package com.company;

import java.util.Scanner;

enum Direction
{
    NORTH, SOUTH, EAST, WEST
}

public class WeekTwo
{
    public static void main(String[] args)
    {
        WeekTwo weekTwo = new WeekTwo();
//        weekTwo.preAndPostDifference();
//        weekTwo.booleanLogicShortCircuitOps();
//        weekTwo.booleanLogicBitwiseOps();
//        weekTwo.compareStrings();

        // q5
//        System.out.println("What is the age rating for the film, and what age are you?");
//        int cert, age;
//
//        Scanner input = new Scanner(System.in);
//
//        cert = input.nextInt();
//        age = input.nextInt();
//
//        System.out.println(weekTwo.admitToFilm(cert, age));

        // q6
//        boolean isHappy = true;
//
//        String mood = isHappy ? "I am happy" : "I am sad";
//        System.out.println(mood);
//
//        int x, y;
//        Scanner input = new Scanner(System.in);
//
//        x = input.nextInt();
//        y = input.nextInt();
//
//        int minVal = x < y ? x : y;
//        System.out.println(minVal);

        // q7
//        System.out.println("Please enter a single letter");
//
//        Scanner input = new Scanner(System.in);
//        char letter;
//
//        letter = input.next().charAt(0);
//
//        switch(letter)
//        {
////            default:
////            {
////                System.out.println(letter + " is a consonant");
//////                break;
////            }
//            case 'a':
//                System.out.println("a is a");
////                break;
//            case 'A':
//            case 'e':
//                System.out.println("e is e");
//            case 'E':
//            case 'i':
//            case 'I':
//            case 'o':
//            case 'O':
//            case 'u':
//            case 'U':
//                System.out.println(letter + " is a vowel");
////                break;
//
//
//        }

        // q8
//        System.out.println("Please enter a month of the year 1-12");
//
//        Scanner input = new Scanner(System.in);
//
//        final int JAN = 1, FEB = 2, MAR = 3, APR = 4, MAY = 5, JUNE = 6, JULY = 7, AUG = 8, SEPT = 9, OCT = 10, NOV = 11, DEC = 12;
//
//        try
//        {
//            int month = input.nextInt();
//
//            switch(month)
//            {
//                case JAN:
//                    System.out.println("January");
//                    break;
//                case FEB:
//                    System.out.println("February");
//                    break;
//                case MAR:
//                    System.out.println("March");
//                    break;
//                case APR:
//                    System.out.println("April");
//                    break;
//                case MAY:
//                    System.out.println("May");
//                    break;
//                case JUNE:
//                    System.out.println("June");
//                    break;
//                case JULY:
//                    System.out.println("July");
//                    break;
//                case AUG:
//                    System.out.println("August");
//                    break;
//                case SEPT:
//                    System.out.println("September");
//                    break;
//                case OCT:
//                    System.out.println("October");
//                    break;
//                case NOV:
//                    System.out.println("November");
//                    break;
//                case DEC:
//                    System.out.println("December");
//                    break;
//                default:
//                    System.out.println("That is an out of range value");
//                    break;
//            }
//        }
//        catch(Exception e)
//        {
//            e.printStackTrace();
//        }

        // q9
//        System.out.println("Please enter a mark between 0 and 100");
//
//        Scanner input = new Scanner(System.in);
//
//        int grade = input.nextInt();
//
//        if(grade < 0 || grade > 100)
//        {
//            System.out.println(("ERR: " + grade + " is not a valid grade"));
//        }
//        else
//        {
//            if(grade >= 70)
//            {
//                System.out.println("A");
//            }
//            else if(grade >= 60)
//            {
//                System.out.println("B");
//            }
//            else if(grade >= 50)
//            {
//                System.out.println("C");
//            }
//            else if(grade >=40)
//            {
//                System.out.println("D");
//            }
//            else
//            {
//                System.out.println("FAIL!");
//            }
//        }

        // 10
//        double answer = 0;
//        boolean charOK = true;
//
//        System.out.println("Please enter two doubles");
//
//        Scanner input = new Scanner(System.in);
//        double num1 = input.nextDouble();
//        double num2 = input.nextDouble();
//
//        System.out.println("Please enter a character");
//        char operation;
//        operation = input.next().charAt(0);
//        System.out.println(operation);
//
//        switch(operation)
//        {
//            case '+':
//                answer = num1 + num2;
//                break;
//            case '-':
//                answer = num1 - num2;
//                break;
//            case '*':
//                answer = num1  * num2;
//                break;
//            case '/':
//                answer = num1 / num2;
//                break;
//            default:
//                System.out.println("Unknown mathematical operation: '" + operation + "'");
//                charOK = false;
//                break;
//        }
//
//        if(charOK)
//        {
//            System.out.println("Answer: " + answer);
//        }

        // 11
//        weekTwo.switchEnumType();

        //12
//        int temperature = 0;
//        final int COLD = 0, MILD = 15, WARM = 20, VERY_WARM = 25, HOT = 30;
//
//        System.out.println("Please enter a temperature");
//
//        Scanner input = new Scanner(System.in);
//
//        try
//        {
//            temperature = input.nextInt();
//
//            if(temperature <= COLD)
//            {
//                System.out.println("Cold...");
//            }
//            else if(temperature < MILD)
//            {
//                System.out.println("A little cold but OK...");
//            }
//            else if(temperature < WARM)
//            {
//                System.out.println("Warm...");
//            }
//            else if(temperature < VERY_WARM)
//            {
//                System.out.println("Very warm...");
//            }
//            else if(temperature >= HOT)
//            {
//                System.out.println("Scorchio!!");
//            }
//        }
//        catch(Exception e)
//        {
//            System.out.println("Exception Caught");
//            e.printStackTrace();
//        }

        // 13
        int year, month, numDays = 0;
        boolean validMonth = true;
        final int JAN = 1, FEB = 2, MAR = 3, APR = 4, MAY = 5, JUNE = 6, JULY = 7, AUG = 8, SEPT = 9, OCT = 10, NOV = 11, DEC = 12;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a year");
        year = input.nextInt();

        System.out.println("Please enter a month");
        month = input.nextInt();

        switch (month)
        {
            case JAN:
            case MAR:
            case MAY:
            case JULY:
            case AUG:
            case OCT:
            case DEC:
                numDays = 31;
                break;
            case APR:
            case JUNE:
            case SEPT:
            case NOV:
                numDays = 30;
                break;
            case FEB:
                if (year % 4 == 0)
                {
                    numDays = 29;
                }
                else
                {
                    numDays = 28;
                }
                break;
            default:
                System.out.println("That is not a valid month of the year.");
                validMonth = false;
        }

        if (validMonth)
        {
            System.out.println("There are " + numDays + " days in month " + month + " in the year " + year);
        }
    }

    public void preAndPostDifference()
    {
        int x = 5;
        int y = 10;

        System.out.println("The value of x is " + x);
        System.out.println("The value of ++x is " + ++x);
        System.out.println("The value of x++ is " + x++);
        System.out.println("The value of x is " + x);

        System.out.println("The value of y is " + y);
        System.out.println("The value of --y is " + --y);
        System.out.println("The value of y-- is " + y--);
        System.out.println("The valaue of y is " + y);
    }

    public void booleanLogicShortCircuitOps()
    {
        System.out.println("Please enter two numbers");
        int[] nums = new int[2];
        int num1, num2;
        Scanner input = new Scanner((System.in));

//        nums[0] = input.nextInt();
//        nums[1] = input.nextInt();
//
//        System.out.println(nums[0]);
//        System.out.println(nums[1]);

        num1 = input.nextInt();
        num2 = input.nextInt();

        System.out.println("num1a: " + num1);
        System.out.println("num2a: " + num2);

        if (num1 < 0 && num2++ < 0)
        {
            System.out.println("num2b?: " + num2);
        }
        else if (num1 > 0 && num2++ > 0)
        {
            System.out.println("num2b@: " + num2);
        }
        else if (num1 == 0 || num2++ == 0)
        {
            System.out.println("num2b%: " + num2);
        }
        else if (num1 < 0 || num2++ < 0)
        {
            System.out.println("num2b*: " + num2);
        }

        System.out.println("num2c: " + num2);
    }

    public void booleanLogicBitwiseOps()
    {
        System.out.println("Please enter two numbers");
        int[] nums = new int[2];
        int num1, num2;
        Scanner input = new Scanner((System.in));

//        nums[0] = input.nextInt();
//        nums[1] = input.nextInt();
//
//        System.out.println(nums[0]);
//        System.out.println(nums[1]);

        num1 = input.nextInt();
        num2 = input.nextInt();

        System.out.println("num1a: " + num1);
        System.out.println("num2a: " + num2);

        if (num1 < 0 & num2++ < 0)
        {
            System.out.println("num2b?: " + num2);
        }
        else if (num1 > 0 & num2++ > 0)
        {
            System.out.println("num2b@: " + num2);
        }
        else if (num1 == 0 | num2++ == 0)
        {
            System.out.println("num2b*: " + num2);
        }
        else if (num1 < 0 | num2++ < 0)
        {
            System.out.println("num2b%: " + num2);
        }

        System.out.println("num2c: " + num2);
    }

    public void compareStrings()
    {
        String s1, s2;

        Scanner input = new Scanner(System.in);

        s1 = input.nextLine();
        s2 = input.nextLine();

        // without the brackets around s1 == s2
        // s1 is added to the string, and then compared against s2
        // returns only false
        System.out.println("using == returns " + (s1 == s2));

        // print the line + true
        // does brackets first?
        System.out.println("using equals() returns " + s1.equals(s2));

        String name1 = "Sean";
        String name2 = "Sean";

        // true, use same String pool
        System.out.println(name1 == name2);

        String name3 = "John";
        String name4 = new String("John");

        // false, different String pool
        System.out.println(name3 == name4);
    }

    public boolean admitToFilm(int cert, int age)
    {
        return age > cert;
    }

    public void switchEnumType()
    {
        Direction theWay = null;

        System.out.println("Please enter a direction N, E, S or W");

        Scanner input = new Scanner(System.in);
        String direction = input.nextLine();
        direction = direction.toUpperCase();

        switch (direction)
        {
            case "N":
                theWay = Direction.NORTH;
                break;
            case "E":
                theWay = Direction.EAST;
                break;
            case "S":
                theWay = Direction.SOUTH;
                break;
            case "W":
                theWay = Direction.WEST;
                break;
            default:
                System.out.println(direction + " is not recognised");
                break;
        }

        if (theWay != null)
        {
            switch (theWay)
            {
                case NORTH:
                    System.out.println("Santy...");
                    break;
                case EAST:
                    System.out.println("The land of the rising sun...");
                    break;
                case SOUTH:
                    System.out.println("Penguins");
                    break;
                case WEST:
                    System.out.println("Hollywood...");
                    break;
                default:
                    System.out.println("Are you lost?");
                    break;
            }
        }
    }
}
