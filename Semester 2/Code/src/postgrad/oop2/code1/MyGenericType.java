// Name: Ray Egan - A00291769
package postgrad.oop2.code1;

// This is the INCOMPLETE generically typed MyGenericType class.
// *** INSERT YOUR CODE HERE ***
public class MyGenericType<T>
{
    private T t;

    public void add(T t)
    {
        this.t = t;
    }

    public T get()
    {
        return this.t;
    }
}
