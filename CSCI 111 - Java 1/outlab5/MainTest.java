
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
    Faculty f1 = new Faculty("Professor", "CS", "Dr. Fred"),
            f2 = new Faculty("Assistant Professor", "ECE", "Dr. Angelina"),
            f3 = new Faculty("Adjunct Professor", "ECE", "Ms. Petronella"),
            f4 = new Faculty("Associate Professor", "CS", "Mr. Smith"),
            f5 = new Faculty("Professor", "ECE", "Dr. Jones"),
            f6 = new Faculty("Assistant Professor", "ECE", "Fred"),
            f7 = new Faculty("Associate Professor", "MATH", "Jackson"),
            f8 = new Faculty("Assistant Professor", "CS", "Ms. Peterson"),
            f9 = new Faculty("Professor", "ECE", "Livingston"),
            f10 = new Faculty("Professor", "ECE", "Jeeves"),
            f11 = new Faculty("Assistant Professor", "ECE", "Jack");
    Faculty.report();
   }
}
