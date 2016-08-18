
/**
 * Write a description of class Boy here.
 * 
 * @author JJ Locke 
 * @version 4/21/11
 */
public class Boy extends Child
{
    protected String hobby;
    protected String sport;

    /**
     * Constructor for objects of class Boy
     */
    public Boy(String name, String in_hobby, String in_sport, int age)
    {
        super(name, age, "MALE");
        hobby = in_hobby;
        sport = in_sport;
    }
    
    /**
     * 
     */
    public void describeChild()
    {
        System.out.println(name + " is a boy aged " + age + ".");
        int z = age;     
        if(z < 13)
        {
           int n = 13 - age;
           System.out.println("    Warning: he will be a teenager in " + n + " years.");
        }
        else
        {
            System.out.println("    Warning: he is a teenager.");
        }
    }
    /**
     * 
     */
    public void describeBoy()
    {
        describeChild();
        System.out.println("    He likes " + hobby + " and " + sport);
    }
}
