
/**
 * Simple class with one constructor and one method for in-lab 1, S’11
 * Keeps name and grade information on a student.
 * 
 * @author Jeremiah Locke 
 * @version 1/19/11
 */
public class Student
{
    // instance variables
    private String name;            // Student's name
    private int credits;            // number of credits taken
    private double qualityPoints;   // A is 4 QP/credit, A- is 3.7, etc.

    /**
     * Constructor for objects of class student
     */
    public Student(String in_name, int in_credits, double in_qualityPoints)
    {
        // initialise instance variables
        name = in_name;
        credits = in_credits;
        qualityPoints = in_qualityPoints;
    }

    /**
     * Compute the student's GPA
     * 
     * @return quality points divided by credits
     */
    public double gpa()
    {
        double gpaValue = qualityPoints / credits;
        return gpaValue;
    }
}
