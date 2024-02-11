package postgrad.oop2.code1;

public class GenC<T>
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
