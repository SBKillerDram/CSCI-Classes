/**
 * gets and prints out 3 ints
 * 
 * @author Jeremiah Locke 
 * @version 3/1/11
 */
public class ThreeInts
{
    // instance variables - replace the example below with your own
    private static int int1,
                       int2,
                       int3;

    public ThreeInts(int in_int1, int in_int2, int in_int3)
    {
        int1 = in_int1;
        int2 = in_int2;
        int3 = in_int3;
    }
    /**
     * gets and returns int1
     */
    public int getInt1()
    {
       return int1;
    }
    /**
     * gets and returns int2
     */
    public int getInt2()
    {
        return int2;
    }
    /**
     * gets and returns int3
     */
    public int getInt3()
    {
        return int3;
    }

    /**
     * prints out int1 int2 int3
     */
    public static void outvals()
    {
        System.out.print(int3);
        System.out.print(int2);
        System.out.print(int1);
    }
}
