package oop1.shop;

import java.util.ArrayList;

public class Shop
{
    public static void main(String[] args)
    {
        ArrayList<ElectronicDevice> devices = new ArrayList<>();

        ElectronicDevice ed1 = new Plasma("Sony", "P300");
        devices.add(ed1);

        ElectronicDevice ed2 = new Laptop("Dell", "Inspiron");
        devices.add(ed2);

        processDevices(devices);
    }

    public static void processDevices(ArrayList<ElectronicDevice> devices)
    {
        for (ElectronicDevice device : devices)
        {
            System.out.print(device);

            if (device instanceof HighlyDesirable)
            {
                System.out.print(" - Highly Desirable Item");
            }

            System.out.println("");
        }
    }
}
