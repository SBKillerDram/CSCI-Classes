
/**
 * tells what happens at a certain age and which number out of a group of 6 is the biggest
 * 
 * @author Jeremiah Locke 
 * @version 2/24/11
 */
public class VariousMethods
{   
    /**
     * tells what good happens at a certain age
     * 
     * @param  16,18,60,62,80
     * @return    what happens at that age 
     */
    public static void dates1(int age)
    {
        if (age==16)
        {
            System.out.println(age + ": legal drinking age in restaurants in the UK");
        }
        else if (age==18)
        {
            System.out.println(age + ": register with Selective Service if you are male");
        }
        else if (age==60)
        {
            System.out.println(age + ": cheap tickets at movies");
        }
        else if (age==62)
        {
            System.out.println(age + ": $10 lifetime senior pass at National Parks");
        }
        else if (age==73)
        {
            System.out.print(age + ":free skiing at Bridger Bowl until 2010");
        }
        else if (age==80)
        {
            System.out.println(age + ": free skiing at Bridger Bowl");
        }
        else
        {
            System.out.println(age + ": nothing interesting happens this year");
        }            
    }
    /**
     * tells what good happens at a certain age
     */
    public static void dates2(int age)
    {
        switch (age)
        {
            case 16: System.out.println(age + ": legal drinking age in restaurants in the UK"); break;
            case 18: System.out.println(age + ": register with Selective Service if you are male"); break;
            case 60: System.out.println(age + ": cheap tickets at movies"); break;
            case 62: System.out.println(age + ": $10 lifetime senior pass at National Parks"); break;
            case 80: System.out.println(age + ": free skiing at Bridger Bowl"); break;
            default: System.out.println(age + ": nothing interesting happens this year"); break;
        }
    }
    /**
     * finds the biggest int in the group of six numbers
     */
    public static int maxOf6(int v1, int v2, int v3, int v4, int v5, int v6)
    {
        int max = Integer.MIN_VALUE;
        if (v1 > max)
        {
            max = v1; // replaces max with v1 if v1 is bigger than max
        }
        if (v2 > max)
        {
            max = v2; // replaces max with v2 if v2 is bigger than max
        }
        if (v3 > max)
        {
            max = v3; // replaces max with v3 if v3 is bigger than max
        }
        if (v4 > max)
        {
            max = v4; // replaces max with v4 if v4 is bigger than max
        }
        if (v5 > max)
        {
            max = v5; // replaces max with v5 if v5 is bigger than max
        }
        if (v6 > max)
        {
            max = v6; // replaces max with v6 if v6 is bigger than max
        }
        return max;        
    }
    
}
