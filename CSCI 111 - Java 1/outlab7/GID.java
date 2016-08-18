
/**
 * Write a description of class GID here.
 * 
 * @author Jeremiah Locke
 * @version 3/3/11
 */

public class GID
{
    private String name;
    private String gid;
    static String bigName;
    static String minName;
    private static boolean notDone = true;
    /**
     * this is the constructor
     */
    public GID(String in_name, String in_gid)
    {
        name = in_name;
        gid = in_gid;
        
        if (notDone)
        {
            System.out.format("%-23s%s%n","Name", "GID");
            notDone = false;           
        }
        else
        {
            printInfo();
        }
       
        
        int z = removeStar();
        if (z > bigGID)
          {  
              bigGID = z;
              bigName = name;
          }
          int q = removeStar();
        if (q < minGID)
          {
            minGID = q;
            minName = name;
          }
              
    }
    
    /**
     * takes away first character of gid
     */
    private int removeStar()
    {
        String rofl =  gid.replace("*", "");
        int lol = Integer.parseInt(rofl);
        return lol;
    }

    /**
     * prints students name and gid
     * 
     */
    public void printInfo()
    {
        System.out.format("%-20s%s%n", name, gid);
    }
    static int bigGID = Integer.MIN_VALUE;
    
    /**
     * returns the biggest gid
     * @return biggest gid
     */
    public static String maxGID()
    {
         
        return "*" + Integer.toString(bigGID);
    }
    
    /**
     * returns the name of the name with the biggest gid
     * @return name with largest gid
     */
    public static String maxName()
    {
         
         return bigName;
        
    }
    static int minGID = Integer.MAX_VALUE;
    /**
     * returns smallest gid
     * @return smallest gid
     */
    public static String minGID()
    {
        if(minGID < 1000000)
        {
            return "*00" + Integer.toString(minGID);
        }
        else if(minGID < 10000000)
        {
            return "*0" + Integer.toString(minGID);
        }
        else
        {
            return "*" + Integer.toString(minGID);
        }
    }
    /**
     * returns name of the person with the smallest gid
     * @return name
     */
    public static String minName()
    {
        return minName;
        
    }
}
