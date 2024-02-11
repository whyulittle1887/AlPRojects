package com.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

interface Printable<T>
{
    void print(T t);
}

interface Retrievable<T>
{
    T retrieve();
}

interface Evaluate<T>
{
    Boolean isNegative(T t);
}

interface Functionable<R, T>
{
    R applyThis(T t);
}

//interface Functionable<T, U, R>
//{
//    R applyThis(T t, U u);
//}

class Person
{
    private String name;
    private Integer age;
    private Double height;

    Person(String name, Integer age, Double height)
    {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName()
    {
        return name;
    }

    public Integer getAge()
    {
        return age;
    }

    public Double getHeight()
    {
        return height;
    }

    public String toString()
    {
        return ("Name: " + getName() + ", Age: " + getAge() + ", Height: " + getHeight());
    }
}


public class BasicLambdas
{
    public static void main(String[] args)
    {
        BasicLambdas bl = new BasicLambdas();
        bl.consumer();
        bl.supplier();
        bl.predicate();
        bl.function();

        List<Person> listPeople = bl.getPeople();

        bl.sortName(listPeople);
        System.out.println("*******************");
        bl.sortAge(listPeople);
        System.out.println("*******************");
        bl.sortHeight(listPeople);
    }

    // Q1
    public void consumer()
    {
        Printable<String> lambda = l -> System.out.println(l);
        lambda.print("Printable Lambda");

        // java interface
        Consumer<String> consumer = c -> System.out.println(c);
        consumer.accept("Consumer Lambda");

        // reference method
        Consumer<String> consumerMR = System.out::println;
        consumerMR.accept("Consumer Reference Method");
    }

    //Q2
    public void supplier()
    {
        Retrievable<Integer> lambda = () -> 77;
        lambda.retrieve();

        Supplier<Integer> supplier = () -> 77;
        supplier.get();
    }

    //Q3
    public void predicate()
    {
        Evaluate<Integer> lambda = l -> l < 0;
        lambda.isNegative(-1);
        lambda.isNegative(1);

        Predicate<Integer> predicate = p -> p < 0;
        predicate.test(-1);
        predicate.test(1);

        check(4, l -> l % 2 == 0);
        check(7, l -> l % 2 == 0);

        String name = "Mr. Joe Bloggs";

        System.out.println(check(name, l -> l.substring(0, 3).equals("Mr.")));

        name = "Ms. Ann Bloggs";
        ;
        System.out.println(check(name, l -> l.substring(0, 3).equals("Mr.")));

        System.out.println(check(33, l -> l >= 18));
        System.out.println(check(13, l -> l >= 18));
    }

    //Q4
    public void function()
    {
//        Functionable<Integer, Integer, String> lambda = (l, m)  -> "number is: " + (l + m);
//        System.out.println(lambda.applyThis(25, 5));

        Functionable<String, Integer> lambda = (l) -> "number is: " + (l);
        System.out.println(lambda.applyThis(25));

        Function<Integer, String> f1 = f -> "number is " + f;
        System.out.println(f1.apply(25));
    }

    public static <T> Boolean check(T t, Predicate<T> lambda)
    {
        return lambda.test(t);
    }

    public static void sortName(List<Person> listPeople)
    {
        // Sort using lambda
//        listPeople.sort(Comparator.comparing(p -> p.getName()));

        listPeople.sort((p1, p2) -> p1.getAge().compareTo(p2.getAge()));

        // Print out listPeople using lambda
        listPeople.forEach(p -> System.out.println(p));

        // Sort using Method Reference
//        listPeople.sort(Comparator.comparing(Person::getName));

        // Print out listPeople using Method Reference
//        listPeople.forEach(System.out::println);
    }

    public static void sortAge(List<Person> listPeople)
    {
        listPeople.sort(Comparator.comparing(p -> p.getAge()));

        listPeople.forEach(p -> System.out.println(p));

//        listPeople.sort(Comparator.comparing(Person::getAge));
//
//        listPeople.forEach(System.out::println);
    }

    public static void sortHeight(List<Person> listPeople)
    {
        listPeople.sort(Comparator.comparing(p -> p.getHeight()));

        listPeople.forEach(p -> System.out.println(p));

//        listPeople.sort(Comparator.comparing(Person::getHeight));
//
//        listPeople.forEach(System.out::println);
    }

    private static List<Person> getPeople()
    {
        List<Person> result = new ArrayList<>();
        result.add(new Person("Mike", 33, 1.8));
        result.add(new Person("Mary", 25, 1.4));
        result.add(new Person("Alan", 34, 1.7));
        result.add(new Person("Zoe", 30, 1.5));
        return result;
    }

}

