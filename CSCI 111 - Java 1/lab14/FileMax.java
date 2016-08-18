
/**
 * finds the biggest int in a file
 * 
 * @author JJ Locke 
 * @version 4/28/11
 */
import java.util.*;
import java.io.*;
public class FileMax
{
    public static void main()
    {
        final String filename = "filemaxfile.txt";
        int max = Integer.MIN_VALUE;
        
        try
        {
            FileReader infile = new FileReader(filename);
            Scanner in = new Scanner(infile);
            String next;
            while(in.hasNext())
            {
                try
                {
                    int current = in.nextInt();
                    if( current > max)
                        max = current;
                }
                catch(InputMismatchException exception)
                {
                    System.out.format("Invalid input: %s%n", in.next());
                }
            }
        }
        catch(FileNotFoundException exception)
        {
            System.out.println("Thee file aint bean founds where you said it is");
        }
        System.out.println("Thee largest legal value is " + max);
    }
}
