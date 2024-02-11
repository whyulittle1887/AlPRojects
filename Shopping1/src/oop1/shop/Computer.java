package oop1.shop;

abstract public class Computer implements ElectronicDevice
{
    private String theMake;
    private String theModel;

    public Computer(String aMake, String aModel)
    {
        theMake = aMake;
        theModel = aModel;
    }

    @Override
    public String getTheMake()
    {
        return theMake;
    }

    @Override
    public String getTheModel()
    {
        return theModel;
    }

    @Override
    public String toString()
    {
        return (getTheMake() + " " + getTheModel());
    }

    abstract public boolean login(String user, String pass);

    abstract public boolean logout();
}

class Laptop extends Computer
{
    Laptop(String aMake, String aModel)
    {
        super(aMake, aModel);
    }

    @Override
    public void turnOn()
    {
        System.out.println("Laptop::turnOn()");
    }

    @Override
    public void turnOff()
    {
        System.out.println("Laptop::turnOff()");
    }

    @Override
    public boolean login(String user, String pass)
    {
        System.out.println("Laptop::login()");
        return true;
    }

    @Override
    public boolean logout()
    {
        System.out.println("Laptop::logout()");
        return true;
    }
}

class Ipad extends Computer implements HighlyDesirable
{
    Ipad(String aMake, String aModel)
    {
        super(aMake, aModel);
    }

    @Override
    public void turnOn()
    {
        System.out.println("Ipad::turnOn()");
    }

    @Override
    public void turnOff()
    {
        System.out.println("Ipad::turnOff()");
    }

    @Override
    public boolean login(String user, String pass)
    {
        System.out.println("Ipad::login()");
        return true;
    }

    @Override
    public boolean logout()
    {
        System.out.println("Ipad::logout()");
        return true;
    }
}
