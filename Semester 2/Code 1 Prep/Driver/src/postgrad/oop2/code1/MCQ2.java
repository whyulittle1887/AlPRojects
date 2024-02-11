package postgrad.oop2.code1;

interface FtoC
{
    double convert(double f);
}

public class MCQ2
{
    FtoC converter = f ->
    {
        return (f - 32.0) * 5 / 9;
    };

    FtoC converter2 = g ->
    {
        return ((g - 32.0) * 5 / 9);
    };
}
