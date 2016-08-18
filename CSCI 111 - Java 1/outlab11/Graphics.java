
/**
 *deals with vector3D
 * @author JJ Locke
 * @version 4/6/11
 */
public class Graphics
{
    /**
     * gets the sum of all the elements add together
     * @return  dot product of arr1 and arr2
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
     * gets the angle between two vectors
     * @return angle
     */
    public static double cosine(Point3DC point1, Point3DC point2, Point3DC point3)
    {
        Vector3D u = new Vector3D(point1, point2);
        Vector3D v = new Vector3D(point3, point2);
        double dotProd = dotProduct(u.getValues(), v.getValues());
        
        double angle = (dotProd/(u.size()*v.size()));
        return angle;
    }
    /**
     * gets the cross product of two vector
     * @return new vector
     */
    public static Vector3D crossProduct(Vector3D u, Vector3D v)
    {
        double[] u1 = u.getValues();
        double[] v1 = v.getValues();
        
        double x[] = new double[3];
    
        x[0] = u1[1] * v1[2] - u1[2] * v1[1];
        x[1] = u1[2] * v1[0] - u1[0] * v1[2];
        x[2] = u1[0] * v1[1] - u1[1] * v1[0];
        
        Vector3D t = new Vector3D(x[0], x[1], x[2]);

        return t;       
    }
    /**
     *  gets the upvector between two vectors
     *  @return up vector
     */
    public static Vector3D upVector(Point3DC point1, Point3DC point2, Point3DC point3)
    {
         Vector3D u = new Vector3D(point1, point2);
         Vector3D v = new Vector3D(point3, point2);
                  
         return crossProduct(v,u);
    }
    /**
     * gets the dot product of two vectors and sees what side ur on
     * @return true or false
     */
    public static boolean cull(Point3DC viewer, Point3DC onPlane, Vector3D upVec)
   {
        Vector3D j = new Vector3D(viewer, onPlane);
        double[] j1 = j.getValues();
        double[] k = upVec.getValues();
        
        return dotProduct(k,j1)<0;
    }
}
