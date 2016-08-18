
/**
 * gets the name without the last letter and also returns the last letter.
 * 
 * @author Jeremiah Locke 
 * @version 2/16/11
 */
public class StrStrPair
{
    // instance variables - replace the example below with your own
    String cutName;
    String lastChar;

    /**
     * Constructor for objects of class StrStrPair
     */
    public StrStrPair(String in_cutName, String in_lastChar)
    {
        // initialise instance variables
        cutName = in_cutName;
        lastChar = in_lastChar;
    }

    /**
     * method for returning cutname
     */
    public String getCutName()
    {
        return cutName; // returns cutName
    }
    /**
     * method for returning lastchar
     */
    public String getLastChar()
    {
        return lastChar; // returns lastChar
    }
}
