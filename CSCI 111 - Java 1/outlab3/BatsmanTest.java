

/**
 * The test class BatsmanTest.
 *
 * @author  JJ Locke
 * @version 2/3/11
 */
public class BatsmanTest extends junit.framework.TestCase
{
    /**
    * 
    */    
    public static void testBatsman()
    {
        Batsman kpBat = new Batsman("Kevin Pietersen", 66, 117, 6,5306, 8521),
               jimmyBat = new Batsman("James Anderson", 52, 71, 31,502, 1398);
               
               assertEquals(kpBat.average(), 47.80,0.01);
               assertEquals(kpBat.scoringRate(), 62.26, 0.01);
               assertEquals(kpBat.getMatches(), 66);
               assertEquals(kpBat.getName(), "Kevin Pietersen");
               
               assertEquals(jimmyBat.average(), 12.55, 0.01);
               assertEquals(jimmyBat.scoringRate(), 35.91, 0.01);
               assertEquals(jimmyBat.getMatches(), 52);
               assertEquals(jimmyBat.getName(), "James Anderson");
    }
}
