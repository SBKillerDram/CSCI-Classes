
/**
 *  FamilyTest tests the other classes.
 * 
 * @author JJ Locke 
 * @version 4/21/11
 */
public class FamilyTest
{
    public static void main()
    {
        Girl jane = new Girl("Jane", 8, "reading", "soccer"),
             susan = new Girl("Susan", 12, "toy helicopters", "swimming");
        Boy fred = new Boy("Fred", "chess", "synchronized swimming", -2),
            denbigh = new Boy("Denbigh", "bridge", "rugby", 15);
        Child terry = new Child("Terry", 5, "Guess"),
              judy = new Child("Judy", 9, "female"),
              jack = new Child("Jack", 2, "MaLe");
              
        System.out.format("%nTesting Child class:%n");
        terry.describeChild();
        judy.describeChild();
        jack.describeChild();
        
        System.out.format("%nTesting Girl class:%n");
        jane.describeGirl();
        susan.describeGirl();
        
        System.out.format("%nTesting Boy class:%n");
        fred.describeBoy();
        denbigh.describeBoy();
        
        System.out.format("%nThere are %d children instances.%n",
                          Child.numKids());
    }
}
