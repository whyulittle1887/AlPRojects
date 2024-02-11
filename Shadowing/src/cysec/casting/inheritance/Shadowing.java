package cysec.casting.inheritance;

public class Shadowing
{
    public static void main(String[] args)
    {
        C c = new C();

        // these variables are hidden as they are private
        // compile time error
//        System.out.println(c.i);
//        System.out.println(c.j);
        System.out.println(c.k);

        System.out.println(((A) c).i);
        System.out.println(c.m);

        System.out.println(((B) c).m);

        System.out.println(((A) c).m);

        A a = new C();
        a.im();

        a = new B();
        a.im();

        a = new A();
        a.im();

        a = new C();

        a = (A) a;

        a.im();

        A aref = new C();
        System.out.println(aref.m);
        aref.im();
        aref.sm();
    }
}

class A
{
    public int i = 10;
    private int j = 20;
    int m = 1;

    public void im()
    {
        System.out.println("A::im()");
    }

    public static void sm()
    {
        System.out.println("A::sm()");
    }
}

class B extends A
{
    private int i = 30;
    public int k = 40;
    int m = 2;

    @Override
    public void im()
    {
        System.out.println("B::im()");
    }

    public static void sm()
    {
        System.out.println("B::sm()");
    }
}

class C extends B
{
    int m = 3;

    @Override
    public void im()
    {
        System.out.println("C::im()");
    }

    public static void sm()
    {
        System.out.println("C::sm()");
    }
}
