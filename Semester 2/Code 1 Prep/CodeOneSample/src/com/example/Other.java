package com.example;

public class Other<T>
{
    private T t;

    public void add(T t)
    {
        this.t = t;
    }

    public T get()
    {
        return t;
    }
}
