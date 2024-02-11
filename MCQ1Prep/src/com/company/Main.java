package com.company;

import java.sql.SQLOutput;

public class Main
{

    public static void main(String[] args)
    {
//	    int c = 0;
//
//        JACK: while(c < 8)
//        {
//            JILL: System.out.println(c);
//            if(c < 3)
//            {
//                break JILL;
//
//            }
//            else
//            {
//                c++;
//            }
//        }


//        int i = 0, j = 10, count = 0;
//
//        while (i < j)
//        {
//            i++;
//            j--;
//            count++;
//        }
//
//        System.out.println(i + " "  + j + " " + count);


//        if(true)
//        System.out.println("False 1");
//        System.out.println("False 2");
//        if(false)
//        System.out.println("True False");
////        System.out.println("Really False");
//        else
//        System.out.println("True True");


//    int i = 1, z = 2, y = 3;
//
//    switch(i)
//    {
//        case z:
//            System.out.println(z);
//        case y:
//            System.out.println(y);
//    }

//        final makes them all compile time constants will allow them in case labels
// final int i = 1, z = 2, y = 3;
//
//    switch(i)
//    {
//        case z:
//            System.out.println(z);
//        case y:
//            System.out.println(y);
//    }

//    String s = "hell";
//
//
//    stringTest(s);
//
//        System.out.println(s);


//        System.out.println("String".replace("g", "g") == "String");

//        String s = "aaa";
//        StringBuilder sb = new StringBuilder("bbb");
//
//
//        new Main().testRefs(s, sb);
//
//
//        System.out.println("s: " + s + ", sb: " + sb);

//        int INT1 = 2;
//        int INT2 = 3;

//        for(int i = INT1; i < INT2; i++)
//        {
//            System.out.println(i);
//        }


//        int i = INT1;
//
//        do
//        {
//            System.out.println(i);
//        }while(i++ < INT2);


        int k = 0;
        int m = 0;

        for (int i = 0; i <= 3; i++)
        {
            k++;
            if (i == 2)
            {
//                break;
//                continue;
//                i = m++;
                i = 4;
            }
            m++;
        }
        System.out.println(k + ", " + m);


//        String[] datalist = {"x", "y", "z"};
//        System.out.println(datalist.length);
//
//        for(String dataElement: datalist)
//        {
//            int innerCounter = 0;
//
//
//            while(innerCounter < datalist.length)
//            {
//                System.out.println(dataElement + ", " + innerCounter);
//                innerCounter++;
//            }
//        }

        int c = 0;
        boolean flag = true;

        for (int i = 0; i < 3; i++)
        {
            while (flag)
            {
                c++;
                if (i > c || c > 5) flag = false;
            }
        }
        System.out.println(c);


    }


    public void testRefs(String str, StringBuilder sb1)
    {
        try
        {
            str = str + sb1.toString();
            sb1.append(str);
            str = null;
            sb1 = null;

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }

    public static String stringTest(String s)
    {
        System.out.println(s);
        s.replace("h", "s");
        System.out.println(s);
        return s;
    }
}
