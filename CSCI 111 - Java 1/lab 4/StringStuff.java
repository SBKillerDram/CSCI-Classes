
/**
 * Modifies Strings
 * 
 * @author JJ Locke 
 * @version 2/9/11
 */
public class StringStuff
{

    /**
     *This cuts out a part of a string and then pastes the two ends left together 
     * 
     * @param  
     * @return      
     */
    public static String cutOut(String original, String cut)
    {
      int OriginalLength = original.length();
      int cutStart = original.indexOf(cut);
      int cutLength = cut.length();
      int cutEnd = (cutStart + cutLength);
           
     String newString = (original.substring(0,cutStart) + original.substring(cutEnd,OriginalLength));
     return newString;
      
    }
}
