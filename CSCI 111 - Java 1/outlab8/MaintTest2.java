
/**
 * Write a description of class MaintTest2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MaintTest2
{
    static void main()
   {
     LoopTest.personInfo();
    
     LoopTest.forTest(5);
    
     System.out.format("%.2f is the largest value%n",
                        LoopTest.whileTest());
    
     IntIntDouble myTest = LoopTest.doWhileTest();
     System.out.format("The largest input value was %d%n The smallest was %d%n The average was %.2f%n",
                        myTest.getInt1(),
                        myTest.getInt2(),
                        myTest.getDouble1());
   }
}
