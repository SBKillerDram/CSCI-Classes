
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
    private static int numCS;
    private static int numECE;
    private static int numAssoc;
    private static int numFull;
    private static int numAsst;
    /**
     * all the if else statments
     */
    public Faculty(String in_rank, String in_department)
    {
        String rank = in_rank;
        String department = in_department;
        if (department.equals("CS"))
        {
            numCS++;  // adds one to cs
        }
        else 
        {
            if (department.equals("ECE"))
                numECE++;  // adds one to ece
            else 
                System.out.println("Warning: " + department + " is not a valad department"); // prints line
        }
        if (rank.equals("Professor"))
            numFull++;  // adds one to full
        else if (rank.equals("Assistant Professor"))
            numAsst++;   // adds one to asst
        else if(rank.equals("Associate Professor"))
            numAssoc++;  // adds one to assoc
        else 
            System.out.println("Warning: " + rank + " is not a valad department");
    }    
    /**
     * Compares the number of faculty in computer science and electrical and computer engineering .
     * 
     */
    public static void whoHasMore()
    {
        if (numCS > numECE)
        {
            System.out.println("There are more Computer Science faculty than in Electrical & Computer Engineering");
        }
        else
        {
            System.out.println("There are more Electrical & Computer Engineering faculty than in Computer Science");
        }    
    }
    /**
     * Prints out the number of faculty there are in each section
     */
    public static void report()
    {
        System.out.println("There are " + numCS + " Computer Science faculty");
        System.out.println("There are " + numECE + " Electrial & Computer Engineering Faculty");
        System.out.println("There are " + numAsst + " Assistant Professors");
        System.out.println("There are " + numAssoc + " Associate Professors");
        System.out.println("There are " + numFull + " Professors");
    }    
}

   