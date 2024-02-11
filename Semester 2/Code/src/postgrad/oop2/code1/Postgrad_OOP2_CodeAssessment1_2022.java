// Name: Ray Egan - A00291769
package postgrad.oop2.code1;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Predicate;

public class Postgrad_OOP2_CodeAssessment1_2022
{
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        final int ENUMS_AND_LAMBDAS = 1, GENERICS = 2, SORT_NATURAL_ORDER = 3, EXIT = 4;
        String userContinue = "y";

        while (userContinue.equalsIgnoreCase("y"))
        {
            switch (userChoice())
            {
                case ENUMS_AND_LAMBDAS:
                    enumsAndLambdas();
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
    // **********************************************************************************************
    // **********************************************************************************************
    // Enumerations and Lambdas
    // **********************************************************************************************
    // **********************************************************************************************

    public static void enumsAndLambdas()
    {
        // System.out.println("enumsAndLambdas() was called");
        // *** INSERT YOUR CODE HERE ***
        Rose whiteRose = Rose.WHITE;
        Rose yellowRose = Rose.YELLOW;
        Rose redRose = Rose.RED;
        Rose pinkRose = Rose.PINK;

        System.out.println(check(whiteRose, r -> r.getColour().equals("White")));
        System.out.println(check(yellowRose, r -> r.getColour().equals("White")));
        System.out.println(check(redRose, r -> r.getColour().equals("White")));
        System.out.println(check(pinkRose, r -> r.getColour().equals("White")));
    }

    // The generic "check" method is to be coded here...
    // *** INSERT YOUR CODE HERE ***
    public static <T> boolean check(T rose, Predicate<T> lambda)
    {
        return lambda.test(rose);
    }

    public static void sortNaturalOrder()
    {
        //System.out.println("sortNaturalOrder() was called");
        // 1. Declare a 'people' reference which is generically typed for Person
        //    i.e. it holds Person elements only.
        //    In addition:
        //      a) the reference type (which is an interface type) does not
        //         allow duplicates (unique)
        //      b) the object type (which implements the interface used for the
        //         reference) sorts automatically
        //      c) use type inference (the diamond operator)
        // *** INSERT YOUR CODE HERE ***
        Set<Person> people = new TreeSet<>();

        // 2. Insert the people - GIVEN - DO NOT CHANGE - just uncomment these lines.
        //    As you can see the order below is different from the order in the
        //    output above. This is because the Natural Sort order (the people
        //    name in alphabetic order) is set by the Person class itself. In addition,
        //    the 'people' reference is using a collection that sorts automatically,
        //    depending on whatever way the class (Person in this example) specifies.
        people.add(new Person("John Bloggs", 44));
        people.add(new Person("Ann Bloggs", 55));
        people.add(new Person("Charlie Bloggs", 33));

        System.out.println("\nSorted by Name (alphabetically) :");
        // 3. Output 'people' using the "forEach" method in Iterable.
        // *** INSERT YOUR CODE HERE ***
        people.forEach(System.out::println);
    }

    public static void generics()
    {
        //System.out.println("generics() was called");
        // 1. After creating the MyGenericType type, create the required instances
        //    of MyGenericType:
        //          - one that accepts String's only, call it 'myGenString'
        //          - one that accepts Person's only, call it 'myGenPerson'.
        //          - use type inference (the diamond operator)
        // *** INSERT YOUR CODE HERE ***
        MyGenericType<String> myGenString = new MyGenericType<>();
        MyGenericType<Person> myGenPerson = new MyGenericType<>();

        // 2. The String version - using the add() method, insert the String "OOP2"
        //    into 'myGenString'. Then, using the generic's get() method, output it's
        //    contents in a System.out.println() statement.
        // *** INSERT YOUR CODE HERE ***
        myGenString.add("OOP");
        System.out.println(myGenString.get());

        // 3. The Person version - using the add() method, insert the following Person
        // into 'myGenPerson' - name is "April", age is 32.
        // Then, using the generic's get() method, output it's  contents in a
        // System.out.println() statement.
        // *** INSERT YOUR CODE HERE ***
        myGenPerson.add(new Person("April", 32));
        System.out.println(myGenPerson.get());
    }

    public static int userChoice()
    {
        System.out.println("\nWhat do you want to do ?");
        System.out.println("1. Enums and Lambdas");
        System.out.println("2. Generics");
        System.out.println("3. Sort");
        System.out.println("4. Exit");
        System.out.print("Enter choice --> ");
        return sc.nextInt();
    }
}
