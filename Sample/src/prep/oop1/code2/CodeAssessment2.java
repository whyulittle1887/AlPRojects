package prep.oop1.code2;

// Template by Sean Kennedy

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
                    System.out.println("Unknown entry : ");
                    break;
            }
        }
    }

    public static void enums()
    {
        System.out.println("\nenums Example");
        Farmer john = Farmer.BEEF;
        john.setNumAcres(500);

//        Call to toString() in Farmer
        System.out.println("John is a " + john);

//        An alternative to calling the toString() method
//        for (Farmer farmer : Farmer.values())
//        {
//            if(farmer == john)
//            {
//                System.out.println("Type of farmer: " + farmer);
//            }
//        }

        System.out.println("John's grant is " + calculateGrant(john));
        System.out.println("");
    }

    public static double calculateGrant(Farmer farmer)
    {
        double grant = 0.0;
        double numAcres = farmer.getNumAcres();

        switch (farmer)
        {
            case DAIRY:
                grant = numAcres < 200 ? 300 * numAcres : 50 * numAcres;
                break;
            case BEEF:
                grant = numAcres < 200 ? 200 * numAcres : 50 * numAcres;
                break;
            case SHEEP:
                grant = numAcres < 200 ? 150 * numAcres : 40 * numAcres;
                break;
            default:
                break;
        }

        return grant;
    }

    public static void innerClasses()
    {
        System.out.println("\ninner classes Example");

        Laptop laptop = new Laptop();
        MemoryI memory = laptop.setMemoryCapacity("4MB");
        System.out.println("The memory capacity is: " + memory.getMemoryCapacity());
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