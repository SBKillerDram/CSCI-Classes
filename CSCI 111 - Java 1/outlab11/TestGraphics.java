
/**
 * tests all the other classes
 * 
 * @author JJ Locke
 * @version 4/6/11
 */
public class TestGraphics
{
    

    /**
     * Constructor for objects of class TestGraphics
     */
    public static void TestGraphics()
    {
        Point3DC p1 = new Point3DC(1, 3, 2),
                 p2 = new Point3DC(1, 1, 2),
                 p3 = new Point3DC(3, 1, 2),
                 
                 p4 = new Point3DC(3, 1, 2),
                 p5 = new Point3DC(1.5, 3.5, -5.5),
                 p6 = new Point3DC(7, 4, 1);
                 
        System.out.format("The cosine of angle %s, %s, %s: %.5f%n",
                           p1.formatPoint(), p2.formatPoint(), p3.formatPoint(),
                           Graphics.cosine(p1, p2, p3));
                           
        System.out.format("The cosine of angle %s, %s, %s: %.5f%n",
                           p4.formatPoint(), p5.formatPoint(), p6.formatPoint(),
                           Graphics.cosine(p4, p5, p6));
                           
        Vector3D up1 = Graphics.upVector(p1, p2, p3);
        System.out.format("Up vector from %s, %s, %s: %s%n",
                           p1.formatPoint(), p2.formatPoint(), p3.formatPoint(),
                           up1.formatVector());
                           
        Vector3D up2 = Graphics.upVector(p4, p5, p6);
        System.out.format("Up vector from %s, %s, %s: %s%n",
                           p4.formatPoint(), p5.formatPoint(), p6.formatPoint(),
                           up2.formatVector());
                           
        System.out.println(Graphics.cull(new Point3DC(3, 4, 5), p2, up1));
        System.out.println(Graphics.cull(new Point3DC(3, 4, -5), p2, up1));
        
        System.out.println(Graphics.cull(new Point3DC(3, 4, 5), p4, up2));
        System.out.println(Graphics.cull(new Point3DC(3, 4, -5), p4, up2));
    }

    
}
