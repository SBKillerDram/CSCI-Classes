
/**
 * Write a description of class Girl here.
 * 
 * @author JJ Locke 
 * @version 4/21/11
 */
public class Girl extends Child
{
    protected String hobby;
    protected String sport;
    /**
     * Constructor for objects of class Girl
     */
    public Girl(String name, int age, String in_hobby, String in_sport)
    {
        super(name, age, "FEMALE");
        
        hobby = in_hobby;
        sport = in_sport;

    }

    /**
     * prints stuff out if the gender is female
     */
    public void describeGirl()
    {
        super.describeChild();
        System.out.println("    She likes " + hobby + " and " + sport);
    }
}
