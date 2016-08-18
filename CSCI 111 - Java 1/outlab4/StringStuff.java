
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
     */
    public static String cutOut(String original, String cut)
    {
      int OriginalLength = original.length(); // length of original
      int cutStart = original.indexOf(cut);  // where the cut starts
      int cutLength = cut.length();          // the length of the cut
      int cutEnd = (cutStart + cutLength);   // where the cut ends
           
     String newString = (original.substring(0,cutStart) + original.substring(cutEnd,OriginalLength));
     return newString;
      
    }
    /**
     * 
     */
    public static StrStrPair cutName(String name)
    {
        int nameLength = name.length();   // length of name
         
        String expr1 = name.substring(0, nameLength-1);
        String expr2 =name.substring(nameLength-1, nameLength);
        return new StrStrPair(expr1, expr2);
    }
}
