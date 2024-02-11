package prep.oop1.code2;

public enum Farmer
{
    DAIRY(200),
    BEEF(150),
    SHEEP(160);

    private int numAcres;

    private Farmer(int numAcres)
    {
        this.numAcres = numAcres;
    }

    @Override
    public String toString()
    {
        final int DAIRY = 0, BEEF = 1, SHEEP = 2;
        String farmer = "";

        switch (this.ordinal())
        {
            case DAIRY:
                farmer = "Dairy Farmer";
                break;
            case BEEF:
                farmer += "Beef Farmer";
                break;
            case SHEEP:
                farmer += "Sheep Farmer";
                break;
            default:
                break;
        }

        return farmer;
    }

    public int getNumAcres()
    {
        return numAcres;
    }

    public void setNumAcres(int numAcres)
    {
        this.numAcres = numAcres;
    }
}
