
/**
 * Write a description of class Batsman here.
 * 
 * @author JJ Locke 
 * @version 2/3/11
 */
public class Batsman
{
    // instance variables - replace the example below with your own
    private String name;
    private int matches;
    private int innings;
    private int notOut;
    private int runs;
    private int ballsFaced;

    /**
     * Constructor for objects of class Batsman
     */
    public Batsman(String in_name, int in_matches, int in_innings, int in_notOut, int in_runs, int in_ballsFaced)
    {
        //the variables
        name = in_name;
        matches = in_matches;
        innings = in_innings;
        notOut = in_notOut;
        runs = in_runs;
        ballsFaced = in_ballsFaced;
        
    }

    /**
     * gets the average of the batsman
     *  
     */
    public double average()
    {
        double battingAverage = (double) runs / (innings - notOut);
        return battingAverage;
    }
    /**
     * gets the score rate of the batsman
     */
    public double scoringRate()
    {
        double scoringRate = ((double) runs / ballsFaced) * 100;
        return scoringRate;
    }
    /**
     * gets the batsman name
     */
    public String getName()
    {
        String getName = name;
        return getName;
    }
    /**
     * gets the batsman matches
     */
    public int getMatches()
    {
        int getMatches = matches;
        return getMatches;
    }
    /**
     * 
     */
    void batinfo()
    {
        System.out.println(getName() + "'s batting stats:");
        System.out.println("    Batting average: " + average());
        System.out.println("    Scoring rate:    " + scoringRate());
        System.out.println("    Matches played:  " + getMatches());
    }
}
