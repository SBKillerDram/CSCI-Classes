
/**
 * sets up points array
 * 
 * @author JJ Locke
 * @version 4/6/11
 */
public class Point3DC
{
    private double[] pointArr = new double[3];

    /**
     * Constructor for objects of class Point3DC
     */
    public Point3DC(double in_x, double in_y, double in_z)
    {
        pointArr[0] = in_x;
        pointArr[1] = in_y;
        pointArr[2] = in_z;
    }

    /**
     * gets and returns pointArr
     * 
     * @return  array pointArr
     */
    public double[] getValues()
    {        
        return pointArr;
    }
    /**
     * @return returns the array pointArr in a string format
     */
    public String formatPoint()
    {
        return String.format("(%.1f, %.1f, %.1f)", pointArr[0], pointArr[1], pointArr[2]);
    }
}
