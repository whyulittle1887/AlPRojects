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

    public static int userChoice()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("What do you want to do ?");
        System.out.println("1. Lambdas");
        System.out.println("2. Generics");
        System.out.println("3. Sort (Natural Order)");
        System.out.println("4. Exit");
        System.out.print("Enter choice --> ");
        return sc.nextInt();
    }

    public static void lambdas()
    {
        List<Lion> lions = new ArrayList<>();
        lions.add(new Lion(3, "Ari", "Male"));
        lions.add(new Lion(2, "Haider", "Male"));
        lions.add(new Lion(5, "Corin", "Female"));
        lions.add(new Lion(8, "Abbas", "Female"));

        lions.sort((l1, l2) -> l1.getAge().compareTo(l2.getAge()));
        lions.sort(Comparator.comparing(l -> l.getAge()));


        System.out.println("Lions sorted by age:");
        lions.forEach(System.out::println);

        System.out.println("Lions sorted by gender");
        lions.sort(Comparator.comparing(l -> l.getGender()));
        lions.forEach(l -> System.out.println(l));
    }

    public static void generics()
    {
        Other<String> name = new Other<>();
        name.add("SK");
        System.out.println(name.get());

        Other<Integer> age = new Other<>();
        age.add(3);
        System.out.println(age.get());

        Other<Lion> animal = new Other<>();
        animal.add(new Lion(4, "Ariel", "Female"));
        System.out.println(animal.get());
    }

    public static void sortNaturalOrder()
    {
        List<Lion> lions = new ArrayList<>();// will not sort
        lions.add(new Lion(3, "Ari", "Male"));
        lions.add(new Lion(2, "Haider", "Male"));
        lions.add(new Lion(5, "Corin", "Female"));
        lions.add(new Lion(8, "Abbas", "Female"));
        System.out.println("ArrayList - will not sort; order is order of insertion.");
        lions.forEach(lion -> System.out.println(lion));

        Set<Lion> sortedLions = new TreeSet<>(lions);// sorting by natural order, by name
        System.out.println("TreeSet - sorts depending on the Lion class (by name).");
        sortedLions.forEach(lion -> System.out.println(lion));
    }
}
