package oop1.casting;

import jdk.nashorn.internal.runtime.SharedPropertyMap;
import sun.java2d.pipe.ShapeSpanIterator;

import java.awt.*;

public class CastingPgm
{
    public static void main(String[] args)
    {
//        upcasting();

        downcasting();
    }

    public static void upcasting()
    {
        Triangle t = new RightAngledTriangle();
        t.draw();

        Triangle t1 = new Triangle();
        t1.draw();

        RightAngledTriangle r1 = new RightAngledTriangle();
        r1.draw();

        t1 = r1;
        t1.draw();

        Shape s = new Triangle();
        s.draw();

        s = r1;
        s.draw();

        progToTheInterface(new Triangle());

        progToTheInterface(new RightAngledTriangle());
    }

    public static void downcasting()
    {
        Triangle t = new Triangle();

        RightAngledTriangle r = new RightAngledTriangle();

        t = r;

        t.draw();
//        ((RightAngledTriangle) t).area();

        Triangle t1 = new Triangle();

        RightAngledTriangle r1 = new RightAngledTriangle();

        // ClassCastException
        // You can never saw a Triangle is a RightAngledTriangle at runtime
        // Cast makes it OK at compile time
        // r1 = t1; is a compile time error
//        r1 = (RightAngledTriangle) t1;

        Triangle t2 = new RightAngledTriangle();

        // same as above - compile time error without the cast
        // even with the cast, this will throw a runtime ClassCastException
        // A Triangle is not a RightAangledTriangle
//        RightAngledTriangle r2 = (RightAngledTriangle) new Triangle();

        Triangle t5 = new RightAngledTriangle();
        t5.draw();

        RightAngledTriangle r5 = (RightAngledTriangle) t5;
        r5.draw();
        r5.area();

        Triangle t6 = new Triangle();
        RightAngledTriangle r6 = (RightAngledTriangle) t6;
        r6.area();

    }

    public static void progToTheInterface(Shape s)
    {
        s.draw();
    }
}
