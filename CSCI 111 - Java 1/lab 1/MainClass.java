
/**
 * Holder class for the main() method.
 * 
 * @author Jeremiah Locke 
 * @version 1/19/11
 */
public class MainClass
{
    /**
     * main() method to test the Student class
     */
    public static void main()
    {
        Student fred = new Student("Fred Smith", 33, 66.0), //three students
                jane = new Student("Jane Adams", 60, 239.7),
                jack = new Student("John Adams", 42, 120);
        System.out.println("fred's gpa is " + fred.gpa());
        System.out.println("jane's gpa is " + jane.gpa());
        System.out.println("jack's gpa is " + jack.gpa());
    }
}
