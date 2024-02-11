// Name: Ray Egan
package postgrad.oop2.code2;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.stream.Collectors;

public class Postgrad_OOP2_CodeAssessment2_2022
{
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception
    {
        final int LOCALISATION = 1, DATES_TIMES = 2, STREAMS = 3, EXIT = 4;
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
                case LOCALISATION:
                    localisation();
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

    public static void localisation()
    {
        // *********************
        // INSERT YOUR CODE HERE 
        // *********************
//        System.out.println("localisation() was called");

        // .properties files in same directory as main java file

        Locale currentLocale = Locale.getDefault();
        Locale dutchLocale = new Locale("nl", "NL");
        Locale finnishLocale = new Locale("fi", "FI");

        ResourceBundle seasons;

        System.out.println("Output the seasons in which language?\n(D)utch, (F)innish or English (any other key): ");

        String lang = sc.next();

        if (lang.equalsIgnoreCase("d"))
        {
            currentLocale = dutchLocale;
        }
        else if (lang.equalsIgnoreCase("f"))
        {
            currentLocale = finnishLocale;
        }
        else
        {
            currentLocale = Locale.getDefault();
        }

        seasons = ResourceBundle.getBundle("postgrad.oop2.code2.SeasonsBundle", currentLocale);
        printSeasons(seasons);
    }

    public static void printSeasons(ResourceBundle seasons)
    {
        System.out.println("spring is " + seasons.getString("spring"));
        System.out.println("summer is " + seasons.getString("summer"));
        System.out.println("autumn is " + seasons.getString("autumn"));
        System.out.println("winter is " + seasons.getString("winter"));
    }

    public static void datesAndTimes()
    {
        // *********************
        // INSERT YOUR CODE HERE 
        // *********************
//        System.out.println("datesAndTimes() was called");

        LocalDate todaysDate = LocalDate.now();
        LocalDate joesBirthday = LocalDate.of(2000, Month.JANUARY, 3);
        LocalDate marysBirthday = LocalDate.of(2011, Month.AUGUST, 13);

        LocalDate joesDrinkDate = joesBirthday.plus(18, ChronoUnit.YEARS);
        LocalDate marysDrinkDate = marysBirthday.plus(18, ChronoUnit.YEARS);

        System.out.println("Joe Bloggs DOB is " + joesBirthday);
        System.out.println("Mary Bloggs DOB is " + marysBirthday);

        if (joesDrinkDate.isBefore(todaysDate) || joesDrinkDate.isEqual(todaysDate))
        {
            System.out.println("Yes. Joe is old enough to drink.");
        }
        else
        {
            System.out.println("No. Joe is too young to drink.");
        }

        if (marysDrinkDate.isBefore(todaysDate) || marysDrinkDate.isEqual(todaysDate))
        {
            System.out.println("Yes. Mary is old enough to drink.");
        }
        else
        {
            System.out.println("No. Mary is too young to drink.");
        }
    }

    public static void streams()
    {
        // This code is given - DO NOT CHANGE. 
        List<Book> books = new ArrayList<>();
        books.add(new Book("Thinking in Java", "Computer Science", 50.0));
        books.add(new Book("Thinking in C++", "Computer Science", 45.0));
        books.add(new Book("Head First Java", "Computer Science", 55.0));
        books.add(new Book("Basic Cooking", "House and Home", 50.0));
        books.add(new Book("Learn the Guitar", "Music", 30.0));
        
        /*  You are given the Book class and the books List above. Using streams,
            figure out the cheapest book in the Computer Science category.

            Output is:
                Cheapest book is: Book{title=Thinking in C++, category=Computer Science, price=45.0}
        
        */
        // *********************
        // INSERT YOUR CODE HERE 
        // *********************
//        System.out.println("streams() was called");

        OptionalDouble cheapestBookPrice = books.stream()
                .filter(b -> b.getCategory().equals("Computer Science"))
                .mapToDouble(b -> b.getPrice())
                .min();

        if (cheapestBookPrice.isPresent())
        {
            System.out.println("Cheapest book is " +
                    books.stream()
                            .filter(b -> b.getCategory().equals("Computer Science"))
                            .filter(b -> b.getPrice() <= cheapestBookPrice.getAsDouble())
                            .collect(Collectors.groupingBy(b -> b.getTitle())));
        }
    }

    public static int userChoice()
    {
        System.out.println("\nWhat do you want to do ?");
        System.out.println("1. Localisation");
        System.out.println("2. Dates/Times");
        System.out.println("3. Streams");
        System.out.println("4. Exit");
        System.out.print("Enter choice --> ");
        return sc.nextInt();
    }
}