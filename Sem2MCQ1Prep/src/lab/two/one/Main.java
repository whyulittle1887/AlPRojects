package lab.two.one;

import java.util.ArrayDeque;
import java.util.Deque;

interface I1
{
    default int doStuff()
    {
        return 1;
    }

    static int doStuffS()
    {
        return 1;
    }
}

interface I2
{
    default int doStuff()
    {
        return 2;
    }
}

public class Main implements I1, I2
{

    public static void main(String[] args)
    {


        Main main = new Main();
        Deque<Integer> d = new ArrayDeque<>();
        d.push(1);
        d.push(2);
        d.push(3);

//        d.remove();
//        d.remove();
//        d.remove();

        System.out.println(d.remove());
        System.out.println(d.remove());
        System.out.println(d.remove());

        new Main().doStuffS();
        I1.doStuffS();
        new Main().go();
        new Main().doStuff();

//        new Main().doStuff();


    }

    void go()
    {
        I1.super.doStuff();
        I2.super.doStuff();
    }

    public int doStuff()
    {
        return 3;
    }

    int doStuffS()
    {
        return 1;
    }
}
