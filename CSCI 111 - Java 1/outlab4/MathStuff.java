
/**
 * used for computing the area of a triangle and the volume of a cone
 * 
 * @author JJ Locke 
 * @version 2/9/11
 */
public class MathStuff
{

    /**
     * Computes the volume of a cone
     * 
     * 
     */
    private static double coneVolume(double radius, double height)
    {
        // computes a cones volume
        double coneVolume = (double) 1/3 * height * Math.PI * (radius * radius);
        return coneVolume;
    }
    /**
     * computes the are of a triangle
     * 
     */
    public static double triangleArea(double a, double b, double c)
    {
        // computes the area of a triangle
        double s = (a + b + c) / 2;
        double triangleArea = Math.sqrt((s * (s - a) * (s - b) * (s - c)));
        return triangleArea;
    }
    /**
     * 
     */
    public static double cutConeVolume(double bigRad, double smallRad, double height)
    {
        // computes the volume of a truncated cone
        double x = (smallRad * height) / (bigRad - smallRad); // gets the height of the small cone
        double totalCone = coneVolume(bigRad, x + height); // gets the value of the whole cone
        double smallCone = coneVolume(smallRad, x); // gets value of the small cone
        double cutConeVolume = totalCone - smallCone;  // gets value of the truncated cone
        return cutConeVolume;
    }
    /**
     * 
     */
    public static double round(double value, int decimal)
    {
        // rounds to a number to a certain place
        double round1 = value * Math.pow(10, decimal);
        double round2 = Math.round(round1);
        double round = round2 / Math.pow(10, decimal);
        return round;
    }
}
