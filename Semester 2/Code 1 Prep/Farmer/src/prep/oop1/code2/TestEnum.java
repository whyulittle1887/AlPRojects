package prep.oop1.code2;

public class TestEnum
{
    public static void main(String[] args)
    {
        enums();
    }

    public static void enums()
    {
        Farmer john = Farmer.BEEF;

        john.setNumAcres(500);

        System.out.println("John is a " + john);
        System.out.println("His grant is " + calculateGrant(john));
    }

    public static double calculateGrant(Farmer farmer)
    {
        double grant = 0.0;
        double numAcres = farmer.getNumAcres();

        switch (farmer)
        {
            case DAIRY:
                grant = numAcres < 200 ? 300 * numAcres : 80 * numAcres;
                break;
            case BEEF:
                grant = numAcres < 200 ? 200 * numAcres : 50 * numAcres;
                break;
            case SHEEP:
                grant = numAcres < 200 ? 150 * numAcres : 40 * numAcres;
                break;
            default:
                break;
        }

        return grant;
    }
}
