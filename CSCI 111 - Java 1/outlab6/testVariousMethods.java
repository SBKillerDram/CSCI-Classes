

/**
 * tests maxOf6 method in VariousMethods
 *
 * @author  Jeremiah Locke
 * @version 2/24/11
 */
public class testVariousMethods extends junit.framework.TestCase
{
    /**
     * Default constructor for test class testVariousMethods
     */
    public testVariousMethods()
    {                     
      assertEquals(VariousMethods.maxOf6(3,8,2,7,8,9), 9);
      assertEquals(VariousMethods.maxOf6(12,3,2,9,4,5), 12);
      assertEquals(VariousMethods.maxOf6(3,8,9,2,8,6), 9);
    }   
}
