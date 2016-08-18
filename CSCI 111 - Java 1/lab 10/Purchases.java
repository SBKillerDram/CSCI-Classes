
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
}
