package postgrad.oop2.code1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Person
{
    String name;
    String dob;

    public Person(String name, String dob)
    {
        this.name = name;
        this.dob = dob;
    }
}

public class SortTest
{
    public static void main(String[] args)
    {
        ArrayList<Person> al = new ArrayList<>();
        al.add(new Person("Paul", "01012000"));
        al.add(new Person("Peter", "01011990"));
        al.add(new Person("Patrick", "01012002"));


        Collections.sort(al, new Comparator<Person>()
        {
            public int compare(Person o1, Person o2)
            {
                return o1.dob.compareTo(o2.dob);
            }
        });

        for (Person a : al)
        {
            System.out.println(a.name + " " + a.dob);
        }
    }
}