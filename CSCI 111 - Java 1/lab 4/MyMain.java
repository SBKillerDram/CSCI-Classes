
/**
 * to test the classes MathStuff and StringStuff.
 * 
 * @author JJ Locke 
 * @version 2/10/11
 */
public class MyMain
{
    public static void main()
    {
        System.out.println("Volume of a cone with radius 3 and height 4 is: " +
                            MathStuff.coneVolume(3, 4));
        System.out.println("Volume of a cone with radius 3 and height 0 is: " +
                            MathStuff.coneVolume(3, 0));
        System.out.println("Area of a triangle with sides 3, 4, and 5 is: " +
                            MathStuff.triangleArea(3, 4, 5));
        System.out.println("Area of a triangle with sides 3, 4, and 7 is: " +
                            MathStuff.triangleArea(3, 4, 7));
        System.out.println("Removing big from Denbigh Starkey leaves: " +
                            StringStuff.cutOut("Denbigh Starkey", "big"));
        System.out.println("Removing D from Denbigh Starkey leaves: " +
                            StringStuff.cutOut("Denbigh Starkey", "D"));
                        }
}
