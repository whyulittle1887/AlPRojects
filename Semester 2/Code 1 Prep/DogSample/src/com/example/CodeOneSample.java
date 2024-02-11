package com.example;

import java.util.*;
import java.util.function.IntSupplier;

public class CodeOneSample
{
    public static void main(String[] args)
    {
        final int LAMBDAS = 1, GENERICS = 2, SORT_NATURAL_ORDER = 3, EXIT = 4;

        String userContinue = "y";
        while (userContinue.equalsIgnoreCase("y"))
        {
            // IntSupplier is a functional interface (has only one abstract method)
            //      int getAsInt();
            IntSupplier s = () -> userChoice();
            switch (s.getAsInt())
            { // execute the Supplier lambda
                case LAMBDAS:
                    lambdas();
                    break;
                case GENERICS:
                    generics();
                    break;
                case SORT_NATURAL_ORDER:
                    sortNaturalOrder();
                    break;
                case EXIT:
                    System.out.println("Exiting...");
                    userContinue = "n";
                    break;
                default:
                    System.out.println("Unknown entry : ");
                    break;
            }
        }
    }

    private static void generics()
    {
        System.out.println("generics() was called");

        Other<String> otherS = new Other<>();
        otherS.add("RE");
        System.out.println(otherS.get());

        Other<Integer> otherI = new Other<>();
        otherI.add(40);
        System.out.println(otherI.get());

        Other<Dog> otherD = new Other<>();
        otherD.add(new Dog("Rex", 5));
        System.out.println(otherD.get());
    }

    private static void sortNaturalOrder()
    {
        System.out.println("sortNaturalOrder() was called");
        List<Dog> dogs = new ArrayList<>();

        dogs.add(new Dog("Fido", 2));
        dogs.add(new Dog("Rex", 5));
        dogs.add(new Dog("Gizmo", 1));
        dogs.add(new Dog("Spot", 8));

        System.out.println("\nDogs in original insertion order\n");
        dogs.forEach(d -> System.out.println(d));

        Set<Dog> oDogs = new TreeSet<>(dogs);
        System.out.println("\nDogs ordered by ordinal on name using Comparable in Dog class\n");
        oDogs.forEach(System.out::println);

    }

    private static void lambdas()
    {
        System.out.println("lambdas() was called");

        List<Dog> dogs = new ArrayList<>();

        dogs.add(new Dog("Fido", 2));
        dogs.add(new Dog("Rex", 5));
        dogs.add(new Dog("Gizmo", 1));
        dogs.add(new Dog("Spot", 8));

        System.out.println("Dogs in original insertion order");
        dogs.forEach(d -> System.out.println(d));


//        dogs.sort((d1, d2) -> d1.getAge().compareTo(d2.getAge()));
        dogs.sort(Comparator.comparing(d -> d.getAge()));

        System.out.println("\nDogs ordered by age using Comparator");
        dogs.forEach(System.out::println);
    }

    public static int userChoice()
    {
        Scanner input = new Scanner(System.in);

        System.out.println("What do you want to do ?");
        System.out.println("1. Lambdas");
        System.out.println("2. Generics");
        System.out.println("3. Sort (Natural Order)");
        System.out.println("4. Exit");
        System.out.print("Enter choice --> ");

        return input.nextInt();
    }
}
