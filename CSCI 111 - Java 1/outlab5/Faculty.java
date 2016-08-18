
/**
 * gets the number of all the faculty in the departments
 * 
 * @author Jeremiah Locke 
 * @version 2/17/11
 */
public class Faculty
{
    private String rank;
    private String department;
    private String name;
    private static String longName = " ";
    private static int numCSP;
    private static int numCSAI;
    private static int numCSAO;
    private static int numECEP;
    private static int numECEAI;
    private static int numECEAO;
    private static int numWar;
   
    /**
     * all the if else statments
     */
    public Faculty(String in_rank, String in_department, String in_name)
    {
        String rank = in_rank;
        String department = in_department.toUpperCase();
        String name = in_name;
        
            if (name.length() > longName.length())
            {
                longName = name;
            }
        if (department.equals("CS") && rank.equals("Prfessor"))
        {
            numCSP++;  // adds one to cs
        }
        else 
        {
            if (department.equals("CS") && rank.equals("Assistant Professor"))
            {
                numCSAI++;
            }
            else
            {
                if (department.equals("CS") && rank.equals("Associate Professor"))
                {
                    numCSAO++;
                }
                else
                {
                 if (department.equals("ECE") && rank.equals("Professor"))
                {
                     numECEP++;  // adds one to ece
                 }
                 else 
                 {
                     if (department.equals("ECE") && rank.equals("Assistant Professor"))
                     {
                         numECEAI++;
                     }
                     else
                     {
                         if (department.equals("ECE") && rank.equals("Associate Professor"))
                         {
                             numECEAO++;
                         }
                        }}}}
            if (!rank.equals("Professor") && !rank.equals("Assistant Professor") && !rank.equals("Associate Professor"))
             {
                 System.out.println("Warning: " + rank + " is not a valid rank");
                 numWar++;
             }
            if (!department.equals("ECE") && !department.equals("CS"))
            {
                System.out.println("Warning: " + department + " is not a valid department");
                numWar++;
            }            
        }
    }
   
    /**
     * Prints out the number of faculty there are in each section
     */
    public static void report()
    {
        System.out.println("There were " + numWar + " warnings");
        System.out.println("                                  Assistant Associate Professor");
        System.out.println("Electrial & Computer Engineering      " + numECEAI + "         " + numECEAO + "         " + numECEP);
        System.out.println("Computer Science                      " + numCSAI + "         " + numCSAO + "         " + numCSP);
        System.out.println(" ");
        System.out.println("The longest name is " +  longName);
    }    
}

   