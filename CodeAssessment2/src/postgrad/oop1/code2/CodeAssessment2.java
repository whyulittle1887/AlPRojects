package postgrad.oop1.code2;

// Template by Sean Kennedy

// Student ID: A00291769
// 27/11/21
// Code #2 Assessment

import java.util.Scanner;

public class CodeAssessment2
{
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        final int INNER_CLASSES = 1, ENUMS = 2, EXIT = 99;

        MENU:
        while (true)
        {
            switch (userChoice())
            {
                case INNER_CLASSES:
                    innerClasses();
                    break;
                case ENUMS:
                    enums();
                    break;
                case EXIT:
                    System.out.println("Exiting...");
                    break MENU;
                default:
                    System.out.println("\nUnknown entry : \n");
                    break;
            }
        }
    }

    public static void enums()
    {
        System.out.println("\nenums Example");

        for (Planet planet : Planet.values())
        {
            boolean tooFar = tooFarFromSun(planet);

            if (tooFar)
            {
                System.out.println(planet + " - NOT habitable!");
            }
            else
            {
                System.out.println(planet);
            }
        }

        System.out.println("");
    }

    public static boolean tooFarFromSun(Planet planet)
    {
        double distanceFromSun = planet.getDistanceFromSun();

        return distanceFromSun > 200000000 ? true : false;
    }

    public static void innerClasses()
    {
        System.out.println("\ninner classes Example");

        BoxOfMatches boxOfMatches = new BoxOfMatches();
        MatchStick box = boxOfMatches.buyBox("Cara", "Maguire & Patterson", true, 40);
        System.out.println(box.matchHeadIngredients());
        System.out.println("");
    }

    public static int userChoice()
    {
        System.out.println("What do you want to do ?");
        System.out.println("1. Inner Classes");
        System.out.println("2. Enumerations");
        System.out.println("99. Exit");
        System.out.print("Enter choice --> ");
        return sc.nextInt();
    }
}