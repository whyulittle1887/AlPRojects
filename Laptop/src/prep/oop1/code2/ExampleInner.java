package prep.oop1.code2;

public class ExampleInner
{
    public static void main(String[] args)
    {
        Laptop laptop = new Laptop();
        MemoryI memory = laptop.setMemoryCapacity("4MB");
        System.out.println("The memory capacity is: " + memory.getMemoryCapacity());
    }
}
