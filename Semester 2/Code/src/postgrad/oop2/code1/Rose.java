// Name: Ray Egan - A00291769
// Code the enumeration type Rose as per the UML. This enumeration should contain
// references that represent four types of roses: RED, YELLOW, WHITE and PINK
// (representing "Red", "Yellow", "White" and "Pink" respectively).
package postgrad.oop2.code1;

public enum Rose
{
    // *** INSERT YOUR CODE HERE ***
    RED("Red"),
    YELLOW("Yellow"),
    WHITE("White"),
    PINK("Pink");

    private Rose(String theColour)
    {
        this.theColour = theColour;
    }

    private String theColour;

    public String getColour()
    {
        return this.theColour;
    }

    ;
}
