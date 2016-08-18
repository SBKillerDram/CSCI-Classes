
/**
 * Write a description of class Child here.
 * 
 * @author JJ Locke 
 * @version 4/21/11
 */
public class Child
{
   protected String name;
   protected int age;
   protected String gender;
   private static int numChildren=0;

    /**
     * Constructor for objects of class Child
     */
    public Child(String in_name, int in_age, String in_gender)
    {
        name = in_name;
        age = in_age;
        gender = in_gender.toUpperCase();
        if(!gender.equals("MALE") && !gender.equals("FEMALE"))
        {
            System.out.println("Invalid gender entered");
            gender = "UNKNOWN";
        }
        if(age<0)
        {
           System.out.println("Negative age entered");
           age = in_age;
        }
        numChildren++;
    }

    /**
     * 
     */
    public void describeChild()
    {
        if(gender.equals("MALE"))
           System.out.println(name + " is a boy aged " + age + ".");
        if(gender.equals("FEMALE"))
           System.out.println(name + " is a girl aged " + age + ".");
        if(gender.equals("UNKNOWN"))
           System.out.println(name + " is aged " + age + ". You haven't told me whther (s)he is a boy or girl");
    }
    /**
     * 
     */
    public static int numKids()
    {
       return numChildren;
    }
}
