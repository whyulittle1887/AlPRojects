package oop1.shop;

public class Tester
{
    public static void main(String args[])
    {
//     Dog d = new Dog();
//     d.show();
        // Animal reference but Dog object
        Animal a = new Dog();
        // a.show();
        // a.walk();
//      Animal b = new Dog("Tiger");
//      b.show(); //prints name using method in super class
//      // runs the method in Dog class
//      b.move();
    }
}

class Animal
{
    String name = "Rover";

    //    Animal (){
//        System.out.println("0. Creates Animal "+this.name);
//    }
//    Animal(String name) {
//        this.name = name;
//        System.out.println("1. Creates Animal "+this.name);
//    }
    public void move()
    {
        System.out.println("2. Animal method move " + this.name);
    }

    public void show()
    {
        System.out.println("3. Animal method show " + this.name);
    }
}


class Dog extends Animal
{
    Dog()
    {
        //Try 3 alternatives
//         this("Cat");
//        super();
        System.out.println("4. Creates Dog empty " + this.name);
    }

    Dog(String name)
    {
        //Using super to invoke parent constructor
//         super(name);
        System.out.println("5a. Prints the variable name  " + name);
        System.out.println("5b. Creates Dog with name  " + this.name);
    }

    public void move()
    {
        // invokes the super class method
        // super.move();
        System.out.println("6. Dog method move " + this.name);
    }

    public void walk()
    {
        System.out.println("7. Dogs method walk " + this.name);
    }

    public void show()
    {
        // super.show();
        System.out.println("8. Dogs method show " + this.name);
    }
}

