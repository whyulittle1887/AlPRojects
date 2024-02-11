package postgrad.oop1.code2;

// Student ID: A00291769
// 27/11/21
// Code #2 Assessment

public enum Planet
{
    MERCURY(57000000.9, 0),
    VENUS(108000000.2, 0),
    EARTH(149000000.6, 1),
    MARS(227000000.9, 2),
    JUPITER(778000000.3, 67),
    SATURN(1427000000.0, 62),
    URANUS(2871000000.0, 27),
    NEPTUNE(4497000000.1, 13),
    PLUTO(5913000000.0, 4);

    private double distanceFromSun;
    private int numberOfMoons;

    // private by default
    Planet(double distanceFromSun, int numberOfMoons)
    {
        this.distanceFromSun = distanceFromSun;
        this.numberOfMoons = numberOfMoons;
    }

    public double getDistanceFromSun()
    {
        return distanceFromSun;
    }

    public int getNumberOfMoons()
    {
        return numberOfMoons;
    }

    @Override
    public String toString()
    {
        return this.name() + " is " + this.getDistanceFromSun() + " kms from the sun and has " + this.getNumberOfMoons() + (this.getNumberOfMoons() == 1 ? " moon." : " moons.");
    }
}
