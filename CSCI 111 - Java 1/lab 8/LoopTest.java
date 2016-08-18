
/**
 * Write a description of class LoopTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LoopTest
{
    

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public static void personInfo()
    {
        while ( )
        {
           System.out.println("Please enter first and last names and height (int). To end enter Done.");
         
           String z = in.next();   //first name
           String w = in.next();   //last name
           int y = in.nextInt();   // height in inches
           String v = in.nextLine();  // space
         
           System.out.println("Please enter his/her daughter's name in any form on one line:");
         
           String x = in.nextLine();  // daughters name
           
           numPeople++;
           int o = y / 12;   // takes the number of inches somone is and makes it into feet
           int t = y % 12;   // gives back the remaining inches left after the feet is determined
           
           System.out.println();
           System.out.println(z + " " + w + " is " + o + " foot " + t + " inches");
           System.out.println("His/her daughter is " + x);
           System.out.println();
        }       
        
    }
}
