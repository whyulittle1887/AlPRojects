package cysec.casting.inheritance;

public class Pie
{
    public static void main(String[] args)
    {
        Human h = new Human();
        System.out.println(h); // 1

        h = new Male();
        System.out.println(h); // 3

        h = new Female();
        System.out.println(h); // 5

        h = new Boy();
        System.out.println(h); // 7

        // Cast makes it compile
        // Still get a runtime ClassCastException
        // Cannot say a Human-is-a-Male
        //Male m = (Male) new Human();

        Boy b = new Boy();
        // Outputs the show() method from the Male class
        // We never override it in the Boy class
        System.out.println(b.show());

        doSomething(new Human());
        doSomething(new Male());
        doSomething(new Female());
        doSomething(new Boy());
        doSomething(new Girl());
        doSomething(new Man());
        doSomething(new Woman());


    }

    public static void doSomething(Human h)
    {
        System.out.println(h.whoAmI());
    }
}

class Human
{
    @Override
    public String toString()
    {
        return "Human::toString()";
    }

    public String whoAmI()
    {
        return "Human::whoAmI()";
    }
}

class Male extends Human
{
    @Override
    public String toString()
    {
        return "Male::toString()";
    }

    @Override
    public String whoAmI()
    {
        return "Male::whoAmI()";
    }

    public String show()
    {
        return "I am a Male";
    }
}

class Man extends Male
{
    @Override
    public String toString()
    {
        return "Man::toString()";
    }
}

class Boy extends Male
{

}

class Female extends Human
{
    @Override
    public String toString()
    {
        return "Female::toString()";
    }

    @Override
    public String whoAmI()
    {
        return "Female::whoAmI()";
    }
}

class Woman extends Female
{
    @Override
    public String toString()
    {
        return "Woman::toString()";
    }
}

class Girl extends Female
{
    @Override
    public String toString()
    {
        return "Girl::toString()";
    }
}


