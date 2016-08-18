
/**
 * gets prints out a persons first and last name and height with their daughters name
 * 
 * @author Jeremiah Locke 
 * @version 3/10/11
 */
import java.util.*;
public class MainTest
{
   
    /**
     * gets prints out a persons first and last name and height with their daughters name
     */
    public static void main()
    {
         Scanner in = new Scanner(System.in);
         int numPeople = 1;           
         
         System.out.println("Please enter number of people:");
         
         int n = in.nextInt(); // number of people
         
         while (numPeople <= n)
         {
           System.out.println("Please enter first and last names and height (int) for person " + numPeople);
         
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
