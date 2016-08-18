
/**
 * to test the classes MathStuff, StringStuff and StrStrPair.
 * 
 * @author JJ Locke 
 * @version 2/10/11
 */
public class MyMain
{
    public static void main()
    {
      // testing round()
      System.out.println("Rounding 123.4567 to two places gives: " +
                          MathStuff.round(123.4567, 2));
      System.out.println("Rounding 123.7654 to three places gives: " +
                          MathStuff.round(123.7654, 3));
      System.out.println("Rounding 123.7654 to zero places gives: " +
                          MathStuff.round(123.7654, 0));
      System.out.println("Rounding 123.7654 to -1 places gives: " +
                          MathStuff.round(123.7654, -1));
      System.out.println();
      // testing cutConeZVolume()
      System.out.println("Volume of a cut cone with radii 10 and 5 and height 3 is: " +
                          MathStuff.round(MathStuff.cutConeVolume(10, 5, 3), 2));
      System.out.println("Volume of a cut cone with radii 10 and 0 and height 6 is: " +
                          MathStuff.round(MathStuff.cutConeVolume(10, 0, 6), 2));
      System.out.println("Volume of a cut cone with radii 5 and 0 and height 3 is: " +
                          MathStuff.round(MathStuff.cutConeVolume(5, 0, 3), 2));
      System.out.println();
      // testing cutName()
      StrStrPair testPair = StringStuff.cutName("EPS Building");
      System.out.println("All but last letter of 'EPS Building' is: " +
                         testPair.getCutName());
      System.out.println("Last letter of 'EPS Building' is: " +
                         testPair.getLastChar());
      testPair = StringStuff.cutName("A");
      System.out.println("All but last letter of 'A' is: " +
                         testPair.getCutName());
      System.out.println("Last letter of 'A' is: " +
                         testPair.getLastChar());
                        }
}
