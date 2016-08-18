
/**
 * declares and returns variables
 * 
 * @author Jeremiah Locke
 * @version 3/31/11
 */
public class SalesInfo
{
    String objectName;
    double unitPrice;
    int quantity;

    /**
     * initilizes variables
     */
    public SalesInfo(String in_objectName, double in_unitPrice, int in_quantity)
    {
        objectName = in_objectName;
        unitPrice = in_unitPrice;
        quantity = in_quantity;
    }

    /**
     * gets and returns the name of the object
     * @return   objectName
     */
    public String getName()
    {
        return objectName;
    }
    /**
     * returns the price of the unit
     * @return unitprice
     */
    public double getPrice()
    {
        return unitPrice;
    }
    /**
     * gets and returns the quantity
     * @return quantity
     */
    public int getQuantity()
    {
        return quantity;
    }
    /**
     * caculates the cost
     * @return purchase cost
     */
    public double purchaseCost()
    {
        double z = unitPrice * quantity;
        return z;
    }
}
