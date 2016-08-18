
/**
 * gets and returns name and gpa
 * 
 * @author JJ Locke
 * @version 3/24/11
 */
import java.util.*;
public class Student
{
    String name;
    double gpa;
    private int[] quizScores = new int[6];

    /**
     * Constructor for objects of class Student
     */
    public Student(String in_name, double in_gpa)
    {
        name = in_name;
        gpa = in_gpa;
        getQuizzes();
    }
     /**
     * 
     */
    private void getQuizzes()
    {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Please enter six quiz scores between 0 and 20");
        
        int q1 = in.nextInt();
        while ( q1 < 0 || q1 > 20)
        {
            System.out.println("Score not between 0 and 20. Please reenter.");
            q1 = in.nextInt();
        }
        quizScores[0] = q1;
        int q2 = in.nextInt();
        while ( q2 < 0 || q2 > 20)
        {
            System.out.println("Score not between 0 and 20. Please reenter.");
            q2 = in.nextInt();
        }
        quizScores[1] = q2;
        int q3 = in.nextInt();
        while ( q3 < 0 || q3 > 20)
        {
            System.out.println("Score not between 0 and 20. Please reenter.");
            q3 = in.nextInt();
        }
        quizScores[2] = q3;
        int q4 = in.nextInt();
        while ( q4 < 0 || q4 > 20)
        {
            System.out.println("Score not between 0 and 20. Please reenter.");
            q4 = in.nextInt();
        }
        quizScores[3] = q4;
        int q5 = in.nextInt();
        while ( q5 < 0 || q5 > 20)
        {
            System.out.println("Score not between 0 and 20. Please reenter.");
            q5 = in.nextInt();
        }
        quizScores[4] = q5;
        int q6 = in.nextInt();
        while ( q6 < 0 || q6 > 20)
        {
            System.out.println("Score not between 0 and 20. Please reenter.");
            q6 = in.nextInt();
        }
        quizScores[5] = q6;
        
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
    int z = Integer.MAX_VALUE;
     String quizName;
     int quizHigh = Integer.MIN_VALUE;
    /**
     * finds the lowest quiz grade and gets the quiz total with the lowest one dropped
     * @return total quiz score
     */
    public int quizTotal()
    {
        if (quizScores[0] < z)
            z = quizScores[0];
        if (quizScores[1] < z)
            z = quizScores[1];
        if (quizScores[2] < z)
            z = quizScores[2];
        if (quizScores[3] < z)
            z = quizScores[3];
        if (quizScores[4] < z)
            z = quizScores[4];
        if (quizScores[5] < z)
            z = quizScores[5];
        int quizTot = quizScores[0] + quizScores[1] + quizScores[2] + quizScores[3] + quizScores[4] + quizScores[5] - z;
        if (quizTot > quizHigh)
        {
            quizName = name;
            quizHigh = quizTot;
        }
        return quizTot;        
        
    }

}
