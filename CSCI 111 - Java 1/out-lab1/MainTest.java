
/**
 * Write a description of class MainTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainTest
{

    /**
     * main() method to test the Swimmer time
     */
    public static void MainTest()
    {
        Swimmer phelps = new Swimmer("Michael Phelps", 50.87, 50.97, 50.58),  //two swimmer's
                cavic = new Swimmer("Milorad Cavic", 50.76, 50.92, 50.59);
                
        System.out.println(phelps.getName() + ":");
        System.out.print("Total time: " + phelps.totalTime() + ", average time: "); 
        System.out.println(phelps.averageTime1() + ", time in finals: " + phelps.getFinals()+"\n");
        System.out.println(cavic.getName() + ":");
        System.out.print("Total time: " + cavic.totalTime() + " average time: ");
        System.out.println(cavic.averageTime1() + " time in finals: " + cavic.getFinals());
        
        
    }
}
