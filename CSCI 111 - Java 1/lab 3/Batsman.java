
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
     * An example of a method - replace this comment with your own
     *  
     */
    public double average()
    {
        double battingAverage = (double) runs / (innings - notOut);
        return battingAverage;
    }
    /**
     * 
     */
    public double scoringRate()
    {
        double scoringRate = ((double) runs / ballsFaced) * 100;
        return scoringRate;
    }
    /**
     * 
     */
    public String getName()
    {
        String getName = name;
        return getName;
    }
    /**
     * 
     */
    public int getMatches()
    {
        int getMatches = matches;
        return getMatches;
    }
}
