package postgrad.oop2.code1;

import java.time.*;
import java.util.*;

public class Main
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
//         Write a localisation() method that avails of the given properties files:
//            - using the default locale load the ResourceBundle named "GoodMannersBundle"
//            - prompt the user "Output the greetings in which language?\n(G)erman, (F)rench or English (any other key)"
//                - if they say "F/f", set the locale for France and load the corresponding GoodMannersBundle file
//                - if they say "G/g", set the locale for Germany and load the corresponding GoodMannersBundle file
//            - output the 4 greetings
//                - note that "hello is " is hardcoded
//                - note that "goodbye is " is hardcoded
//                - note that "please is " is hardcoded
//                - note that "thanks is " is hardcoded

        /* Output
            g
            hello is hallo
            goodbye is auf wiedersehen
            please is bitte
            thanks is vielen dank

            f
            hello is bonjour
            goodbye is au revoir
            please is s'il vous plaît
            thanks is merci

            z
            hello is hello
            goodbye is goodbye
            please is please
            thanks is thanks
        */
        Locale currentLocale = Locale.getDefault();
        System.out.println(currentLocale);
        ResourceBundle greetings = ResourceBundle.getBundle("GoodMannersBundle", currentLocale);

        System.out.println("Output the greetings in which language?\\n(G)erman, (F)rench or English (any other key): ");
        String lang = sc.next();
        if (lang.equalsIgnoreCase("F"))
        {
            currentLocale = Locale.FRANCE;
            greetings = ResourceBundle.getBundle("GoodMannersBundle", currentLocale);
        }
        else if (lang.equalsIgnoreCase("G"))
        {
            currentLocale = Locale.GERMANY;
            greetings = ResourceBundle.getBundle("GoodMannersBundle", currentLocale);
        }

        System.out.println("hello is " + greetings.getString("hello"));
        System.out.println("goodbye is " + greetings.getString("goodbye"));
        System.out.println("please is " + greetings.getString("please"));
        System.out.println("thanks is " + greetings.getString("thanks"));
    }

    public static void datesAndTimes()
    {
        /*
            The Java 8 Time/Date:
                - using the Java 8 Date/Time API do the following:
                    - A flight leaves an airport in the GMT timezone on 30th May, 2020 at 1300 hours.
                    - The flights destination is Moscow with a flight time of 4 hours.
                    - What time will it be in Moscow (local time) when the flight arrives?
                        - Note: there is a +3 hour difference between Moscow and GMT; however,
                          this is NOT part of your calculation - just helps in verifying your answer.

            Output
                    Leaving at 2020-05-30T13:00Z[GMT]
                    Arriving at 2020-05-30T20:00+03:00[Europe/Moscow]
        */

        LocalDateTime flightDeptTime = LocalDateTime.of(2020, Month.MAY, 30, 13, 0);
        ZonedDateTime flightDeptTimeZ = flightDeptTime.atZone(ZoneId.of("GMT"));

        System.out.println("Leaving at " + flightDeptTimeZ);

        ZonedDateTime arrivalTimeZ = flightDeptTimeZ.withZoneSameInstant(ZoneId.of("Europe/Moscow")).plusHours(4);
        System.out.println("Arrival time: " + arrivalTimeZ);

    }

    public static void streams()
    {
        /*
            Output:
                [Polo_VW, Passat_vw, Panda_Fiat, V40_Volvo, Camry_Toyota, Golf_vW]
                Number of Volkswagen cars is : 3

        You are given a List of cars in the form of Strings : model_make i.e. the car maker
        is appended. How many Volkswagen car (i.e. VW/vw/Vw/vW) are in the list?

        Implement the algorithm in Java 8 using Streams.
         */

        // DO NOT edit the next 2 lines.
//        List<String> carList = Arrays.asList("VW_Polo", "vw_Passat", "Fiat_Panda", "Volvo_V40", "Toyota_Camry", "vW_Golf");
        List<String> carList = Arrays.asList("Polo_VW", "Passat_vw", "Panda_Fiat", "V40_Volvo", "Camry_Toyota", "Golf_vW");
        System.out.println(carList);

        long result = carList.stream()
                .map(carDetails -> carDetails.toUpperCase())      //R apply(T t)
                //.map(String::toUpperCase)
//                            .filter(carDetailsUpper -> carDetailsUpper.startsWith("VW"))
                .filter(carDetailsUpper -> carDetailsUpper.endsWith("VW"))
                .count();
        System.out.println("Number of Volkswagen cars is: " + result);
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
