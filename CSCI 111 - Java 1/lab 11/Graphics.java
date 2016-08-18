
/**
 *deals with vector3D
 * @author JJ Locke
 * @version 4/6/11
 */
public class Graphics
{
   
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public static double dotProduct(double[] arr1, double[] arr2)
    {
        double sum = 0;
        for(int i = 0; i < 3; i++)
        {
            double p = ( arr1[i] * arr2[i]);
            sum += p;
            
        }
        return sum;
    }
    /**
     * 
     */
    public static double cosine(Point3DC point1, Point3DC point2, Point3DC point3)
    {
        Vector3D u = new Vector3D(point1, point2);
        Vector3D v = new Vector3D(point3, point2);
        double dotProd = dotProduct(u.getValues(), v.getValues());
        
        double angle = (dotProd/(u.size()*v.size()));
        return angle;
    }
}
