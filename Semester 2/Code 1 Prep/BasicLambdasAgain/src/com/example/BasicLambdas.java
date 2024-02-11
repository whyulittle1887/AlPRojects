package com.example;

import java.util.function.Predicate;

interface Evaluate<T>
{
    boolean checkIfNegative(T t);
}

public class BasicLambdas
{
    public static void main(String[] args)
    {
        // Use Predicate to determine is an int is even or odd
        // Create the lambda to check number
        // Use check method which has been typed for T, and Predicate<T>
        Predicate<Integer> lambda = l -> l % 2 == 0;

        int num = 4;
        System.out.println(num + " is even: " + check(num, lambda));

        num = 7;
        System.out.println(num + " is even: " + check(num, lambda));


        // Use Predicate to determine if the first characters of a string is "Mr."
        // Create another lambda to check string
        // Use same check method which has been typed for T, and Predicate<T>
        Predicate<String> lambda2 = l -> l.startsWith("Mr.");

        String person = "Mr. Joe Bloggs";
        System.out.println(person + " is a man: " + check(person, lambda2));

        person = "Ms. Joe Bloggs";
        System.out.println(person + " is a man: " + check(person, lambda2));
    }

    public static <T> boolean check(T value, Predicate<T> lambda)
    {
        return lambda.test(value);
    }

    public void predicate()
    {
        Evaluate<Integer> lambda = l -> l < 0;

        // check if a number is negative or positive
        lambda.checkIfNegative(4);
        lambda.checkIfNegative(-44);

        Predicate<Integer> predicate = p -> p < 0;

        // check if a number is negative or positive
        predicate.test(4);
        predicate.test(-4);
    }
}
