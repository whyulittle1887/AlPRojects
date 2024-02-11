package prep.oop1.code2;

public class Laptop
{
    private class MemoryImpl implements MemoryI
    {
        private String memoryCapacity;

        private MemoryImpl(String memoryCapacity)
        {
            this.memoryCapacity = memoryCapacity;
        }

        public String getMemoryCapacity()
        {
            return memoryCapacity;
        }
    }

    public MemoryI setMemoryCapacity(String memoryCapacity)
    {
        return new MemoryImpl(memoryCapacity);
    }
}
