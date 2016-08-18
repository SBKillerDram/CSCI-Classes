
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
   
    /**
     * this is the constructor
     */
    public GID(String in_name, String in_gid)
    {
        name = in_name;
        gid = in_gid;
        
       
                  
        int z = removeStar();
        if (z > bigGID)
          {  
              bigGID = z;
              bigName = name;
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
        System.out.format("%s's numeric GID is %d%n", name, removeStar());
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
}