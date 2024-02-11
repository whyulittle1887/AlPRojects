package postgrad.oop2.code1;

import java.util.*;
import java.util.function.IntSupplier;

public class Driver
{
    static Scanner sc = new Scanner(System.in);

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

    private static void sortNaturalOrder()
    {
        System.out.println("sortNaturalOrder() was called");

        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Porshe", "911"));
        cars.add(new Car("BMW", "M4"));
        cars.add(new Car("VW", "Scirocco"));
        cars.add(new Car("Audi", "A5"));

        System.out.println("Cars in original insertion order");
        cars.forEach(System.out::println);

        Set<Car> orderedCars = new TreeSet<>(cars);

        System.out.println("Printing cars in natural sorting order as defined by Comparable's compareTo() method in Car class");

        // Using Method Reference to forEach over all the cars
        orderedCars.forEach(System.out::println);

        // Using lambda to forEach over all the cars
        orderedCars.forEach(c -> System.out.println(c));
    }

    private static void generics()
    {
        System.out.println("generics() was called");

        GenC<String> genS = new GenC<>();
        genS.add("Ray");
        System.out.println(genS.get());

        GenC<Integer> genI = new GenC<>();
        genI.add(40);
        System.out.println(genI.get());

        GenC<Car> genC = new GenC<>();
        genC.add(new Car("Porsche", "911"));
        System.out.println(genC.get());
    }

    private static void lambdas()
    {
        System.out.println("lambdas() was called");

        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Porshe", "911"));
        cars.add(new Car("BMW", "M4"));
        cars.add(new Car("VW", "Scirocco"));
        cars.add(new Car("Audi", "A5"));


        System.out.println("Cars in original insertion order");
        cars.forEach(c -> System.out.println(c));
//        cars.forEach(System.out::println);

        // sorting using compareTo()
//        cars.sort((c1, c2) -> c1.getModel().compareTo(c2.getModel()));

        // using Comparator.comparing with lambda
//        cars.sort(Comparator.comparing(c -> c.getModel()));

        // using Comparator.comparing with Method Reference
        cars.sort(Comparator.comparing(Car::getModel));

        System.out.println("Cars sorted by natural order using Comparable in Car class");

        // print out the results using Method Reference
        cars.forEach(System.out::println);

        // Printing out the results using lambda
        cars.forEach(c -> System.out.println(c));
    }

    public static int userChoice()
    {

        System.out.println("What do you want to do ?");
        System.out.println("1. Lambdas");
        System.out.println("2. Generics");
        System.out.println("3. Sort (Natural Order)");
        System.out.println("4. Exit");
        System.out.print("Enter choice --> ");
        return sc.nextInt();
    }
}
