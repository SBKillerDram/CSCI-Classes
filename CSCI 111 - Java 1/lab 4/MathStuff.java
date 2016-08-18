
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
    public static double coneVolume(double radius, double height)
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
}
