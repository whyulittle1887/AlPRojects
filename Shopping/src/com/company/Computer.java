package com.company;

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

    public abstract boolean login(String user, String pass);

    public abstract boolean logout();
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
        System.out.println("Laptop::Login");
        return true;
    }

    @Override
    public boolean logout()
    {
        System.out.println("Laptop::Logout");
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
    public boolean login(String user, String pass)
    {
        System.out.println("Ipad::Login");
        return true;
    }

    @Override
    public boolean logout()
    {
        System.out.println("Ipad::Logout");
        return true;
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
}
