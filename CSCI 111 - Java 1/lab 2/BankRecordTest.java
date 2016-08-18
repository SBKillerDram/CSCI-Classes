

/**
 * The test class BankRecordTest.
 *
 * @author  JJ Locke
 * @version 1/26/11
 */
public class BankRecordTest extends junit.framework.TestCase
{
    /**
     * testing main class
     */
    public static void testBankRecord()
    {
        BankRecord student = new BankRecord("John", "Smith", 120);
        
        assertEquals(student.getBalance(), 120);
        student.makeDeposit(60);
        assertEquals(student.getBalance(), 180);
        
        assertEquals(student.getFirstName(), "John");
        assertEquals(student.getLastName(), "Smith");
    }

    
}
