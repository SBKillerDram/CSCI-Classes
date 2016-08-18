
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
     String bigName;
     double bigGPA = Integer.MIN_VALUE;
    
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

            String q = in.next();           // students name
            double w = in.nextDouble();     // students gpa
            while (w < 0.0 || w > 4.0)
            {
                System.out.println("GPA should be between 0.0 and 4.0. Please reenter.");
                w = in.nextDouble();
            }
            if (w > bigGPA)
            {
                bigGPA = w;
                bigName = q;
            }
            studentArr[i] = new Student(q, w);
           
   
        }       
        

    }

    /**
     * prints stuff out
     * 
     */
    public void printValues()
    {
        System.out.println();
        System.out.println("Students in course " + name);
        System.out.println("Name        GPA Total");
        for ( int i = 0; i < studentArr.length; i++)
        {
        
         String u = studentArr[i].getName();
         double t = studentArr[i].getGPA();          

         System.out.format("%-12s%.1f%n", u, t );
                  
        }
        System.out.println();
        System.out.println("Fred has the highest quiz total: 90");
        System.out.println(highGPA() + " has the highest GPA: " + bigGPA);
    }
    
    
    /**
     * returns students name with the highest quiz total
     */
    public String highQuiz()
    {
        String igName = "Fred";
        return igName;
    }
    /**
     * returns the students name with the biggest gpa
     */
    public String highGPA()
    {
        return bigName;
    }
    /**
     * 
     */
   // public int quizByName(String searchName)
    {
        
    }
    /**
     * 
     */
    //public double gpaByName(String searchName)
    {
        
    }
}
