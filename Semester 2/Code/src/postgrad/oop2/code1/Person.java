// Name: Ray Egan - A00291769
package postgrad.oop2.code1;

// This is the INCOMPLETE Person class that sorts itself in alphabetic name order.
// *** INSERT YOUR CODE HERE ***
public class Person implements Comparable<Person>
{
    private String theName;
    private Integer theAge;

    public Person(String theName, Integer theAge)
    {
        this.theName = theName;
        this.theAge = theAge;
    }

    public String getTheName()
    {
        return theName;
    }

    public Integer getTheAge()
    {
        return theAge;
    }

    @Override
    public String toString()
    {
        return "Person{" + "theName=" + theName + ", theAge=" + theAge + '}';
    }

    @Override
    public int compareTo(Person otherPerson)
    {
        return this.getTheName().compareTo(otherPerson.getTheName());
    }
}
