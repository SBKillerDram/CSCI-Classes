
/**
 * a class to figure out the balance in an account
 * 
 * @author JJ Locke 
 * @version 1/26/11
 */
public class BankRecord
{
    private String firstName;
    private String lastName;
    private int balance;

    /**
     * Constructor for objects of class BankRecord
     */
    public BankRecord(String in_firstName, String in_lastName, int in_balance)
    {
        firstName = in_firstName;
        lastName = in_lastName;
        balance = in_balance;
    }

    /**
     * first name
     */
    public String getFirstName()
    {
        String getFirstName = firstName;
        return getFirstName;
       
    }
    /**
     * last name
     */
    public String getLastName()
    {
        String getLastName = lastName;
        return getLastName;
    }
    /**
     *  balance
     */
    public int getBalance()
    {
        int getBalance = balance;
        return getBalance;
    }
    /**
     * 
     */
    public void makeDeposit(int deposit)
    {
        balance = balance + deposit;
    }
}
