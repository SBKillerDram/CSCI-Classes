
/**
 * tests BankRecord
 * 
 * @author JJ Locke 
 * @version 1/27/11
 */
public class MainTest
{

    /**
     * Constructor for objects of class MainTest
     */
    public static void main()
    {
        BankRecord student = new BankRecord("John", "Smith", 120);
        BankRecord graduate = new BankRecord("Alice", "Springs");// using both dconstructors
        
        student.makeDeposit(60);      //deposit $60
        student.makeWithdrawal(100);  //withdraw $100
        student.printBalance();
        
        graduate.makeDeposit(6000);      //deposit $6000
        graduate.makeWithdrawal(5000);   // withdraw $5000
        graduate.printBalance();
    }
}
