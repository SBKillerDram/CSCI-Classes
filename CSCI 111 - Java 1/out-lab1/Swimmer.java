
/**
 * Write a description of class Swimmer here.
 * 
 * @author Jeremiah Locke
 * @version 1/20/11
 */
public class Swimmer
{
    // instance variables
    private String name;          //Swimmer's name
    private double heat;          //Swimmer's time in heat
    private double semiFinals;    //Swimmer's time in semiFinals
    private double finals;         //Swimmer's time in finals

    /**
     * Constructor for objects of class Swimmer
     */
    public Swimmer(String in_name, double in_heat, double in_semiFinals, double in_finals)
    {
        // initialise instance variables
        name = in_name;
        heat = in_heat;
        semiFinals = in_semiFinals;
        finals = in_finals;
    }

    /**
     * Compute the swimmer's time
     * 
     * 
     * @return     the sum of x and y 
     */
    public double totalTime()
    {
        // put your code here
        double totalTime = heat + semiFinals + finals;
        return totalTime;
    }
    /**
     * 
     */
    public double averageTime1()
    {
        double averageTime1 = (heat + semiFinals + finals) / 3;
        return averageTime1;
    }
    /**
     * 
     */
    public double averageTime2()
    {
        double averageTime2 = totalTime() /3;
        return averageTime2;
    }
    /**
     * 
     */
    public double getFinals()
    {
        double getFinals = finals;
        return getFinals;
    }
    /**
     * 
     */
    public String getName()
    {
        String getName = name;
        return getName;
    }
}
