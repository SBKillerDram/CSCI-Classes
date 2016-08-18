
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
     * 
     */
    public BankRecord(String in_firstName, String in_lastName, int in_balance)
    {
        firstName = in_firstName; 
        lastName = in_lastName;
        balance = in_balance;
    }
    /**
     * 
     */
    public BankRecord(String in_firstName, String in_lastName)
    {
        firstName = in_firstName;
        lastName = in_lastName;
        balance = 0;
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
     * if a deposit is made
     */
    public void makeDeposit(int deposit)
    {
        balance = balance + deposit;
    }
    /**
     * person's fullnname
     */
    public String fullName()
    {
        String getFullName = firstName + " " + lastName;
        return getFullName;
    }
    /**
     * if a withdrawal is made
     */
     public void makeWithdrawal(int withdraw)
     {
         balance = balance - withdraw;
     }
     /**
      * prints out person's name and current balance
      */
     public void printBalance()
     {
         System.out.println(getFirstName() + " " + getLastName() + "'s current balance is $" + getBalance());
     }
        
}
