package postgrad.oop2.code2;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CodeTwoSample
{
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception
    {
        final int DATES_TIMES = 1, STREAMS = 2, EXIT = 3;
        String userContinue = "y";

        while (userContinue.equalsIgnoreCase("y"))
        {
            switch (userChoice())
            {
                case DATES_TIMES:
                    datesAndTimes();
                    break;
                case STREAMS:
                    streams();
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

    public static void datesAndTimes()
    {
        /*
        a) Let us assume that mandatory quarantine came in on March 1st, 2021. Joe flies in
        on March 13th, 2021 and Mary flies on January 13th, 2021. Using the Java 8 Date/Time 
        API, output if either/both must quarantine.

        b) If in quarantine, then the quarantine period is 2 weeks. Assuming a date of 
        March 20th, 2021 figure out if, whoever is in quarantine, can leave quarantine.
        */

        // *** INSERT YOUR CODE HERE ***
        LocalDate mandatoryQuarantineStartDate = LocalDate.of(2021, Month.MARCH, 1);
        LocalDate joesFliesInDate = LocalDate.of(2021, Month.MARCH, 13);
        LocalDate marysFliesInDate = LocalDate.of(2021, Month.JANUARY, 13);

        // do they have to quarantine?
        if (joesFliesInDate.isBefore(mandatoryQuarantineStartDate))
        {
            System.out.println("No. Joe does not have to quarantine.");
        }
        else
        {
            System.out.println("Yes. Joe does have to quarantine.");
            // given a certain date, can Joe leave quarantine?
            LocalDate d = LocalDate.of(2021, Month.MARCH, 20);
            LocalDate exitQuarantine = joesFliesInDate.plus(2, ChronoUnit.WEEKS);

            if (d.isEqual(exitQuarantine) || d.isAfter(exitQuarantine))
            {
                System.out.println("Yes, Joe can leave quarantine!");
            }
            else
            {
                System.out.println("No, Joe cannot leave quarantine!");
            }
        }

        if (marysFliesInDate.isBefore(mandatoryQuarantineStartDate))
        {
            System.out.println("No. Mary does not have to quarantine.");
        }
        else
        {
            System.out.println("Yes. Mary does have to quarantine.");
            // given a certain date, can Mary leave quarantine?
            LocalDate d = LocalDate.of(2021, Month.MARCH, 20);
            LocalDate exitQuarantine = marysFliesInDate.plus(2, ChronoUnit.WEEKS);

            if (d.isEqual(exitQuarantine) || d.isAfter(exitQuarantine))
            {
                System.out.println("Yes, Mary can leave quarantine!");
            }
            else
            {
                System.out.println("No, Mary cannot leave quarantine!");
            }
        }
    }

    public static void streams()
    {
        /* Output
            age 18: [Max]
            age 23: [Peter, Pamela]
            age 12: [David]
        */
        // Given.
        List<Person> persons =
                Arrays.asList(
                        new Person("Max", 18),
                        new Person("Peter", 23),
                        new Person("Pamela", 23),
                        new Person("David", 12));

        // 1. Generate a Map which maps from a persons age (Integer) to the list of people who
        //    are that age (List<Person>) i.e. the key is Integer and the value is List<Person>.
        // *** INSERT YOUR CODE HERE ***
        Map<Integer, List<Person>> personsByAge = persons
                .stream()
                .collect(Collectors.groupingBy(p -> p.getAge()));
//                .collect(Collectors.groupingBy(Person::getAge));


        // 2. For each entry in the Map, output the details in the format as shown:
//            18 --> [Max]
//            23 --> [Peter, Pamela]
//            12 --> [David]
        // *** INSERT YOUR CODE HERE ***
        personsByAge
                .forEach((age, listPerson) -> System.out.println(age + " --> " + listPerson));
    }

    public static int userChoice()
    {
        System.out.println("\nWhat do you want to do ?");
        System.out.println("1. Dates/Times");
        System.out.println("2. Streams");
        System.out.println("3. Exit");
        System.out.print("Enter choice --> ");
        return sc.nextInt();
    }
}

// Given.
class Person
{
    private String name;
    private int age;

    Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    @Override
    public String toString()
    {
        return name;
    }
}