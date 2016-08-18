
/**
 * Write a description of class Bowler here.
 * 
 * @author JJ Locke 
 * @version 2/3/11
 */
public class Bowler
{
    // instance variables
    private String firstName;
    private String lastName;
    private int ballsBowled;
    private int runs;
    private int wickets;

    /**
     * Constructor for objects of class Bowler
     */
    public Bowler(String in_firstName, String in_lastName, int in_ballsBowled, int in_runs, int in_wickets)
    {
        // five parameters
        firstName = in_firstName;
        lastName = in_lastName;
        ballsBowled = in_ballsBowled;
        runs = in_runs;
        wickets = in_wickets;
    }

    /**
     * computs the bowlers average by dividing the runs by the wickets
     * 
     */
    public double average()
    {
        double average = (double) runs / wickets;
        return average;
    }
    /**
     * computes the bowlers economy by dividing the runs by the balls bowled then multipying by 6
     */
    public double economy()
    {
        double economy = ((double) runs / ballsBowled) * 6;
        return economy;
    }
    /**
     * gets the bowlers name
     */
    public String getName()
    {
        String getName = firstName + " " + lastName;
        return getName;
    }
}
