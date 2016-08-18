
/**
 * test class
 * 
 * @author Jeremiah Locke
 * @version 3/31/11
 */
public class Main
{
   /**
    * tests other classes
    */
   public static void main()
   {
       Purchases.newPurchase();
       Purchases.newPurchase();
       Purchases.newPurchase();
       Purchases.newPurchase();
       
       Purchases.allPurchases();
       
       System.out.println();
       
       Purchases.deletePurchase("subaru");
       Purchases.deletePurchase("chevy");
       
       System.out.println();
       
       Purchases.allPurchases();
       
       System.out.println();
       
       SalesInfo[] salesArray = Purchases.toArray();
       Purchases.printArray(salesArray);
    }
}
