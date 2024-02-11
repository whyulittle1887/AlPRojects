package postgrad.oop1.code2;

// Student ID: A00291769
// 27/11/21
// Code #2 Assessment

public class BoxOfMatches
{
    public MatchStick buyBox(String b, String m, boolean d, int n)
    {
        return new MatchStickImpl(b, m, d, n);
    }

    private class MatchStickImpl implements MatchStick
    {
        private String brand;
        private String manufacturer;
        private boolean dangerous;
        private int numberOfMatchSticks;

        private MatchStickImpl(String b, String m, boolean d, int n)
        {
            brand = b;
            manufacturer = m;
            dangerous = d;
            numberOfMatchSticks = n;
        }

        public String matchHeadIngredients()
        {
            return "Match head consists of: Potassium, Sulphur and Powder";
        }
    }
}
