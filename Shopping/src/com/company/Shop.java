package com.company;

import java.util.ArrayList;

public class Shop
{
    public static void main(String[] args)
    {
        ArrayList<ElectronicDevice> devices = new ArrayList<>();

        ElectronicDevice p1 = new Plasma("Sony", "P300");
        devices.add(p1);

        ElectronicDevice l1 = new Laptop("Dell", "Inspiron");
        devices.add(l1);

        ElectronicDevice i1 = new Ipad("Apple", "Ipad");
        devices.add(i1);

        ElectronicDevice l2 = new LED("Samsung", "S1");
        devices.add(l2);

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
