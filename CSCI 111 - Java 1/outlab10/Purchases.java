
/**
 * preforms a bunch of stuff
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import javax.swing.*;
import java.util.*;
public class Purchases
{
    private static ArrayList<SalesInfo> myPurchases = new ArrayList<SalesInfo>();

 
    /**
     * asks user to input object name unit price and quantity
     * 
     * @param  a b c
     * @return     a b c 
     */
    public static void newPurchase()
    {
        String a;
        JOptionPane myin = new JOptionPane();        
        a = myin.showInputDialog("Please enter object name");
        
        
        String b;
        b = myin.showInputDialog("Please enter the unit price");
        
        
        String c;
        c = myin.showInputDialog("Please enter the quatity");
        
        
        String name = a;
        double price = Double.parseDouble(b);
        int quantity = Integer.parseInt(c);
        
        JOptionPane outBox = new JOptionPane();        
        outBox.showMessageDialog(null, "New purchase: " + c + " " + a + " @ $" + b);
        
        for(int i = 0; i < myPurchases.size(); i++)
        {
            if(name.compareTo(myPurchases.get(i).getName())<0)
            {
                myPurchases.add(i, new SalesInfo(name, price, quantity));
                return;
            }
        }
        myPurchases.add(new SalesInfo(name, price, quantity));
    }
    /**
     * 
     */
    public static void allPurchases()
    {
        for (int i = 0; i < myPurchases.size(); i++)
        {
            System.out.format("%-11s%9d%12.2f%11.2f%n", myPurchases.get(i).getName(), myPurchases.get(i).getQuantity(), myPurchases.get(i).getPrice(), myPurchases.get(i).purchaseCost());
        }
    }
    /**
     * removes an item from the arrylist myPurchases
     * @return the list with an item deleted
     */
    public static void deletePurchase(String name)
    {
        boolean done = false;
        for(int i = 0; i < myPurchases.size(); i++)
        {
            String a = myPurchases.get(i).getName();
            if(a.equals(name))
            {
              myPurchases.remove(i);  
              done = true;
            }
        }
        if(done == false)
             System.out.println("No object with the name " + name + ", delete failed");
        
    }
    /**
     * makes array local the same as arraylist myPurchases
     */
    public static SalesInfo[] toArray()
    {
        SalesInfo[] local = new SalesInfo[myPurchases.size()];
        
        for(int i = 0; i < local.length; i++)
        {
            local[i] = myPurchases.get(i);
        }        
        return local;
    }
    /**
     * 
     */
    public static void printArray(SalesInfo[] myArr)
    {
        for( int i = 0; i < myPurchases.size(); i++)
        {
           System.out.format("%-11s%9d%12.2f%11.2f%n", myPurchases.get(i).getName(), myPurchases.get(i).getQuantity(), myPurchases.get(i).getPrice(), myPurchases.get(i).purchaseCost());
        }
    }
}
