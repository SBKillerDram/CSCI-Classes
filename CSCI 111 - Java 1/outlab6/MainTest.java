
/**
 * test of VariousMethods
 * 
 * @author Jeremiah Locke 
 * @version 2/24/11
 */
public class MainTest
{
   public static void main()
   {
     VariousMethods.dates2(18);
     VariousMethods.dates1(80);
     VariousMethods.dates2(62);
     VariousMethods.dates2(60);
     VariousMethods.dates2(20);
    
     System.out.println();
    
     System.out.println("Max of 3, 8, 2, 7, 8, 9 is: " +
                VariousMethods.maxOf6(3, 8, 2, 7, 8, 9));
     System.out.println("Max of 12, 3, 2, 9, 4, 5 is: " +
                VariousMethods.maxOf6(12, 3, 2, 9, 4, 5));
     System.out.println("Max of 3, 8, 9, 2, 8, 6 is: " +
                VariousMethods.maxOf6(3, 8, 9, 2, 8, 6));
     
     VariousMethods.sort6(3, 8, 2, 5, 7, 5);
     VariousMethods.sort6(-8, -7, -6, -5, -4, -3);
     VariousMethods.sort6(-3, -2, -1, 0, 1, 2);
     VariousMethods.sort6(2, 1, 0, -1, -2, -3);
     VariousMethods.sort6(0, 0, 0, 0, 0, 0);
   }
}
