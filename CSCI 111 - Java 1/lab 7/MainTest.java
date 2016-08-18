
/**
 * test class GID
 * 
 * @author Jeremiah Locke
 * @version 3/3/11
 */
public class MainTest
{
    /**
     * Constructor for objects of class MainTest
     */
    public static void main()
    {
        GID john = new GID("John Smith", "*12345678"),
            ro = new GID("Rosemary Hossack", "*34561234"),
            jack = new GID("John Adams", "*24681256"),
            mick = new GID("Mick Jagger", "*32112332"),
            susan = new GID("Susan Starkey", "*11111111");
            
            susan.printInfo();
            System.out.format("%s has the biggest GID (%S)%n",
                                GID.maxName(), GID.maxGID());
    }
}
