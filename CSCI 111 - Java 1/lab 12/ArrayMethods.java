
/**
 * Write a description of class ArrayMethods here.
 * 
 * @author JJ Locke
 * @version 4/14/11
 */
public class ArrayMethods
{
    /**
     * prints out all elements of the array
     */
    public static void print1DArr(int[] myArr1D)
    {
       for(int i = 0; i < myArr1D.length; i++)
       {
           if(i == myArr1D.length-1)
            System.out.format("%4d%n",myArr1D[i]);
            else
            System.out.format("%4d", myArr1D[i]);
        }
    } 
    /**
     * prints each element in array with each row being a new line
     */
    public static void print2DArr1(int[][] myArr2D)
    {
        for(int row = 0; row < myArr2D.length; row++)
        {   
              for( int col = 0; col < myArr2D[row].length; col++)
              {
                  if(col == myArr2D[row].length-1)
                     System.out.format("%4d%n",myArr2D[row][col]);
                   else
                     System.out.format("%4d",myArr2D[row][col]);
              }
        }
    }
    /**
     * prints each element in 2d array using the method print1DArr
     */
    public static void print2DArr2(int[][] myArr2D)
    {
        for(int row = 0; row <myArr2D.length; row++)
            print1DArr(myArr2D[row]);
    }
    /**
     * prints out the array with the columns and rows switched
     */
    public static void transpose(int[][] myArr2D)
    {
        for( int row = 0; row < myArr2D.length; row++)
        {  
            for( int col = row; col < myArr2D.length; col++)
            {    
                int z = myArr2D[row][col];
                myArr2D[row][col] = myArr2D[col][row];
                myArr2D[col][row] = z;
            }
        }
    }
    /**
     * returns the numbers in the row
     */
    public static int[] getRow(int[][] myArr2D, int rowNum)
    {
        return myArr2D[rowNum];
    }
    /**
     * returns the numbers in any given column
     */
    public static int[] getColumn(int[][] myArr2D, int colNum)
    {
        int[] x = new int[myArr2D.length];
        for(int row = 0; row < myArr2D.length; row++)
            x[row] = myArr2D[row][colNum];
        
        return x;    
    }
}
