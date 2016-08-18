
/**
 * test class GID
 * 
 * @author Jeremiah Locke
 * @version 3/3/11
 */
import java.util.*;
public class MainTest
{
    /**
     * Constructor for objects of class MainTest
     */
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Please enter name (first, last) and GID for 7 people");
        
        GID john = new GID(in.next() + " " + in.next(), in.next());
        GID ro = new GID(in.next() + " " + in.next(), in.next());
        GID jack = new GID(in.next() + " " + in.next(), in.next());
        GID bil = new GID(in.next() + " " + in.next(), in.next());
        GID mick = new GID(in.next() + " " + in.next(), in.next());
        GID mum = new GID(in.next() + " " + in.next(), in.next());
        GID susan = new GID(in.next() + " " + in.next(), in.next());
        
        System.out.format("%n%s has the biggest GID (%s)%n",
                            GID.maxName(), GID.maxGID());
            
        System.out.format("%n%s has the smallest GID (%s)%n",
                            GID.minName(), GID.minGID());
    }
}
