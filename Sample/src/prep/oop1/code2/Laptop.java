package prep.oop1.code2;

public class Laptop
{
    public MemoryI setMemoryCapacity(String memoryCapacity)
    {
        return new MemoryImpl(memoryCapacity);
    }

    private class MemoryImpl implements MemoryI
    {
        private String memoryCapacity;

        private MemoryImpl(String memoryCapacity)
        {
            this.memoryCapacity = memoryCapacity;
        }

        @Override
        public String getMemoryCapacity()
        {
            return memoryCapacity;
        }
    }
}
