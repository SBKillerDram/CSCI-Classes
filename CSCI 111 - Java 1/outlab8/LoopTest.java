
/**
 * Write a description of class LoopTest here.
 * 
 * @author Jeremiah Locke 
 * @version 3/23/11
 */
import java.util.*;
import javax.swing.*;
public class LoopTest
{
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  first name last name and height and ddaughters name
     * @return     names and hieght
     */
    public static void personInfo()
    {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Please enter first and last names and height (int). To end enter done.");
        String z = in.next();   //first name;
        while (!z.equals("done")) 
        {
           
           String w = in.next();   //last name
           int y = in.nextInt();   // height in inches
           String v = in.nextLine();  // space
         
           System.out.println("Please enter his/her daughter's name in any form on one line:");
         
           String x = in.nextLine();  // daughters name
           
           
           int o = y / 12;   // takes the number of inches somone is and makes it into feet
           int t = y % 12;   // gives back the remaining inches left after the feet is determined
           
           System.out.println();
           System.out.println(z + " " + w + " is " + o + " foot " + t + " inches");
           System.out.println("His/her daughter is " + x);
           System.out.println();  
           System.out.println("Please enter first and last names and height (int). To end enter done.");
           
            z = in.next();	
           
          }
                    
    }
    /**
     * gets the average of n varibales
     * @param n doubles
     * @return average of n doubles
     */
    public static void forTest(int n)
    {
        String a = "The average of ";
        double sum = 0.0;
        for(int i = 1; i <= n; i++)
        {
            double k = Double.parseDouble(JOptionPane.showInputDialog(null,"Please enter a double"));
            a += k + ", ";
            sum += k;       
        }
        double ave = sum/n;
        JOptionPane.showMessageDialog(null,String.format("%s is %.2f",a,ave));
    }
    /**
     * returns biggest number after -1.0 is entered
     * @param n doubles
     * @return biggest number
     */
    public static double whileTest()
    {
        Scanner in2 = new Scanner(System.in);
        double max = Integer.MIN_VALUE;
        double h = 1;
        System.out.println("Please enter values.");
        h = in2.nextDouble();
        if (h == -1.0)
        {
            System.out.println("-1.0 is invalid for the first value");
            return 0.0;
        }
        while(h >=0.0)
        {
            h = in2.nextDouble();
            if(h > max)
            {
                max = h;
            }
        
       }
       return max;
    }
    /**
     * 
     */
    public static IntIntDouble doWhileTest()
    {
        Scanner in = new Scanner(System.in);
        int w = 0;
        int max = 0;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        int u = 0;
        System.out.println("Enter a value");
        do
        {
            w = in.nextInt();
            if (w != -1)
            {
                if(w > max)
                max = w;
                if(w < min)
                min = w;
                sum += w;
                u +=1;
            }
        }
        while (w != -1.0);
        {
            if(max < 0)
            {
                System.out.println("There wasnt atleast one positive value");
                return new IntIntDouble(0,0,0);
            }
        }
        return new IntIntDouble(max,min,((double)sum/u));
    }
}

