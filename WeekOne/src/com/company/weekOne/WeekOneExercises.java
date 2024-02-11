package com.company.weekOne;

import java.util.InputMismatchException;
import java.util.Scanner;

public class WeekOneExercises
{
    public static void main(String[] args)
    {
        String answer = didOswaldActAlone();

        if (answer.equalsIgnoreCase("yes"))
        {
            System.out.println("That is correct, Oswald did act alone.");
        }
        else if (answer.equalsIgnoreCase("no"))
        {
            System.out.println("No, that is not correct. Oswald did act alone.");
        }
        else
        {
            System.out.println("Sorry, I don't understand that answer.");
        }
//
//        System.out.println("****************************************");
//
//        WeekOneExercises woe = new WeekOneExercises();
//        answer = woe.wasOJGuilty();
//
//        if(answer.equalsIgnoreCase("yes"))
//        {
//            System.out.println("That is correct, OJ was guilty.");
//        }
//        else if(answer.equalsIgnoreCase("no"))
//        {
//            System.out.println("No, that is not correct.OJ WAS guilty.");
//        }
//        else
//        {
//            System.out.println("Sorry, I don't understand that answer.");
//        }
//
//        System.out.println("****************************************");
//
//        String favouriteFilm = woe.favouriteFilm();
//
//        int rating = woe.filmRating(favouriteFilm);
//
//        if(rating >=4)
//        {
//            System.out.println("wow! A rating of " + rating + " for " + favouriteFilm + ". That's quite good!");
//        }
//        else if(rating > 1 && rating < 4)
//        {
//            System.out.println("hmm a rating of " + rating + " for " + favouriteFilm + ". Sounds OK I guess.");
//        }
//        else
//        {
//            System.out.println("You only gave your favourite film, " + favouriteFilm + ", a rating of " + rating +
//                    " out of 5 stars? Are you sure you even like this film?");
//        }


        // page 2 exercises
        WeekOneExercises woe = new WeekOneExercises();
//        int age = woe.getAge();
//        System.out.println("You are: " + age);
//
//        age = woe.getAge("No really, what age are you?");
//
//        System.out.println(age);
//
//        age = woe.getAge("what age are you", "Sean");
//
//        System.out.println(age);

//        boolean eligibleForPension = checkPension(47);
//        boolean eligibleForPension = checkPension(77);
//
//        System.out.println("You are eligible for your pension: " + eligibleForPension);
//
//        String name = getName();
//        System.out.println("You say your name is: " + name);

//        String [] fullName = new String[2];
//
//        woe.getName(fullName);
//
//        for (String eachName:fullName)
//        {
//            System.out.println(eachName);
//        }

//        scopeExample();
    }

    public static String didOswaldActAlone()
    {
        System.out.println("Did Oswald act alone?");

        Scanner input = new Scanner(System.in);

        return input.nextLine();
    }

    public String wasOJGuilty()
    {
        System.out.println("Was OJ guilty?");

        Scanner input = new Scanner(System.in);

        return input.nextLine();
    }

    public String favouriteFilm()
    {
        System.out.println("What is your favourite film?");

        Scanner input = new Scanner(System.in);

        return input.nextLine();
    }

    public int filmRating(String film)
    {
        System.out.println("How many stars out of five would you give " + film + "?");

        Scanner input = new Scanner(System.in);

        return input.nextInt();
    }

    public int getAge()
    {
        System.out.println("What are are you?");

        Scanner input = new Scanner(System.in);
        int age = input.nextInt();

        return (age);
    }

    public int getAge(String question)
    {
        System.out.println(question);

        Scanner input = new Scanner(System.in);
        int age = 0;

        try
        {
            age = input.nextInt();
        }
        catch (InputMismatchException e)
        {
            e.printStackTrace();
        }

        return age;
    }

    public int getAge(String question, String name)
    {
        System.out.println("Hi there " + name + ", " + question);

        Scanner input = new Scanner(System.in);
        int age = -999;
        boolean correctType = input.hasNextInt();

        if (correctType)
        {
            age = input.nextInt();
        }
        else
        {
            System.out.println("That was not in the format we wanted.");
        }

        return age;
    }

    public static boolean checkPension(int age)
    {
//        if(age >=65)
//        {
//            return true;
//        }
//        else {
//            return false;
//        }

        return age >= 65 ? true : false;
    }

    public static String getName()
    {
        System.out.println("What is your name");

        Scanner input = new Scanner(System.in);
        String name = input.nextLine();

        return name;
    }

    public void getName(String[] fullName)
    {
        System.out.println("What is your full name?");

        Scanner input = new Scanner(System.in);
        fullName[0] = input.next();
        fullName[1] = input.next();
    }

//    public static void scopeExample(int age, String toy)
//    {
//        if(age < 5)
//        {
//            String favouriteToy = "lego";
//        }
//
////        System.out.print(favouriteToy);
//    }
}
