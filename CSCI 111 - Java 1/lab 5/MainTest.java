
/**
 * method used for testing Faculty.
 * 
 * @author Jeremiah Locke 
 * @version 2/17/22
 */
public class MainTest
{
   public static void main()
   {
    Faculty f1 = new Faculty("Professor", "CS"),
            f2 = new Faculty("Assistant Professor", "ECE"),
            f3 = new Faculty("Adjunct Professor", "ECE"),
            f4 = new Faculty("Associate Professor", "CS"),
            f5 = new Faculty("Professor", "ECE"),
            f6 = new Faculty("Assistant Professor", "ECE"),
            f7 = new Faculty("Associate Professor", "MATH"),
            f8 = new Faculty("Assistant Professor", "CS"),
            f9 = new Faculty("Professor", "ECE"),
            f10 = new Faculty("Professor", "ECE"),
            f11 = new Faculty("Assistant Professor", "ECE");
    Faculty.report();
    Faculty.whoHasMore();
   }
}
