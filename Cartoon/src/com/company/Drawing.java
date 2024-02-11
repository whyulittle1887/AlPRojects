package com.company;

class Drawing extends Art
{
    Drawing()
    {
        super();
        System.out.println("Drawing() constructor");
    }

    @Override
    public void sketch()
    {
        System.out.println("Drawing::sketch()");
    }

    @Override
    public String toString()
    {
        return "Drawing::toString()";
    }
}
