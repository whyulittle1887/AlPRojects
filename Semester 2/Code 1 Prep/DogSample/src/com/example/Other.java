package com.example;

public class Other<T>
{
    private T t;

    public T get()
    {
        return t;
    }

    public void add(T t)
    {
        this.t = t;
    }
}
