
/**
 * gets and returns name and gpa
 * 
 * @author JJ Locke
 * @version 3/24/11
 */
public class Student
{
    String name;
    double gpa;

    /**
     * Constructor for objects of class Student
     */
    public Student(String in_name, double in_gpa)
    {
        name = in_name;
        gpa = in_gpa;
    }

    /**
     * gets name
     * @return     returns name 
     */
    public String getName()
    {
        return name;
    }
    /**
     * gets gpa
     * @return gpa
     */
    public double getGPA()
    {
        return gpa;
    }
}
