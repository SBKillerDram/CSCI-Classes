
/**
 * Write a description of class Vector3D here.
 * 
 * @author JJ Locke
 * @version 4/6/11
 */
public class Vector3D
{
    private double[] vectorArr = new double[3];

    /**
     * Constructor for objects of class Vector3D
     */
    public Vector3D(double in_x, double in_y, double in_z)
    {
        vectorArr[0] = in_x;
        vectorArr[1] = in_y;
        vectorArr[2] = in_z;
    }

    /**
     *second constructor
     */
    public Vector3D(Point3DC head, Point3DC tail)
    {
        double[] headArr = head.getValues(),
                 tailArr = tail.getValues();
        vectorArr[0] = headArr[0] - tailArr[0];
        vectorArr[1] = headArr[1] - tailArr[1];
        vectorArr[2] = headArr[2] - tailArr[2];
    }
   /**
    * gets and returns vectorArr
    */ 
   public double[] getValues()
   {
       return vectorArr;
   }
   /**
    * returns the size of the magnitude of the vector
    * @return size
    */
   public double size()
   {
       return Math.sqrt(((vectorArr[0]*vectorArr[0]) + (vectorArr[1]*vectorArr[1]) + (vectorArr[2]*vectorArr[2])));
   }
   
}
