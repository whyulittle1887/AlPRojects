package com.company;

import java.lang.reflect.AnnotatedArrayType;

public class Cartoon extends Drawing
{
    public Cartoon()
    {
        super();
        System.out.println("Cartoon constructor");
    }

    @Override
    public void sketch()
    {
        System.out.println("Cartoon::sketch()");
    }

    public void tomAndJerry()
    {
        System.out.println("Cartoon::tomAndJerry()");
    }

    public void sketchIt(Art a)
    {
        a.sketch();

        if (a instanceof Cartoon)
        {
            ((Cartoon) a).tomAndJerry();
        }
    }

    public static void upcasting()
    {
        Art a1 = new Art();
        System.out.println(a1);

        Art a2 = new Drawing();
        System.out.println(a2);

        Art a3 = new Cartoon();
        System.out.println(a3);

        Drawing d1 = new Drawing();
        System.out.println(d1);

        Drawing d2 = new Cartoon();
        System.out.println(d2);

        Cartoon c1 = new Cartoon();
        System.out.println(c1);
    }

    public static void downcasting()
    {
        Art a1 = new Drawing();

        // a1 is of Art reference, Drawing object
        // cannot assign an Art reference to a Drawing reference without casting
        Drawing d1 = (Drawing) a1;

        System.out.println(d1);

        Art a2 = new Cartoon();
        Drawing d2 = (Drawing) a2;

        System.out.println(d2);

        Cartoon c1 = (Cartoon) a2;
        System.out.println(c1);

        Drawing d3 = new Cartoon();
        Cartoon c2 = (Cartoon) d3;
        System.out.println(c2);

        // even with a cast, an Art can never be a Drawing or a Cartoon
        Drawing d4 = (Drawing) new Art();

        Cartoon c3 = (Cartoon) new Art();

        // even with a cast, a Drawing can never be a Cartoon
        Cartoon c4 = (Cartoon) new Drawing();
    }

    public static void main(String[] args)
    {
        Cartoon c = new Cartoon();

        c.sketchIt(new Art());
        c.sketchIt(new Drawing());
        c.sketchIt(new Cartoon());

        upcasting();
        downcasting();
    }
}
