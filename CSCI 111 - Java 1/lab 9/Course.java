
/**
 * gets the name and gpa of each student and prints it out
 * 
 * @author JJ Locke
 * @version 3/24/11
 */
import java.util.*;
public class Course
{
    private String name;
    private Student[] studentArr;
    private int numStudents;

    /**
     * initalizes variables
     */
    public Course(String in_name, int in_numStudents)
    {
        name = in_name;    //name of course
        numStudents = in_numStudents; //number of students
        studentArr = new Student[numStudents];

    }

    /**
     * gets the name and gpa for each student in the array
     * @param name and gpa
     * @return name and gpa 
     */
    public void enterValues()
    {
        Scanner in = new Scanner(System.in);        

        for(int i = 0; i < studentArr.length ; i++)
        {

            System.out.println("Enter values for student " + i);

            String q = in.next();           
            double w = in.nextDouble();
            studentArr[i] = new Student(q, w);
           
   
        }
        
        

    }
    /**
     * 
     * 
     * 
     */
    public void printValues()
    {
        System.out.println();
        System.out.println("Students in course " + name);
        for ( int i = 0; i < studentArr.length; i++)
        {
        
         String u = studentArr[i].getName();
         double t = studentArr[i].getGPA();    
         
         System.out.format("%s %.2f%n",u, t);
        }
    }
}
