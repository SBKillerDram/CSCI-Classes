
/**
 * it does alot of stuff with arrays
 * 
 * @author JJ Locke
 * @version 4/19/11
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
     * @return array transposed
     */
    public static void transpose(int[][] myArr2D)
    {
        if(isRect(myArr2D)== false)
        {
           System.out.println("The array is not a rectangle");
        }
        else
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
    }
    /**
     * returns the numbers in the row
     * @return row
     */
    public static int[] getRow(int[][] myArr2D, int rowNum)
    {
        if( rowNum > myArr2D.length-1)
        {
            System.out.println("That row does not exsit");
            int[] zero = new int[0];
            return zero;
        }
        else
          return myArr2D[rowNum];
        
    }
    /**
     * returns the numbers in any given column
     * @return column
     */
    public static int[] getColumn(int[][] myArr2D, int colNum)
    {
        int[] x = new int[myArr2D.length];
        for(int row = 0; row < myArr2D.length; row++)
        {   
           if(colNum > myArr2D[row].length-1)
           {
               System.out.println("That column does not exsit");
           }
            else
            {
             x[row] = myArr2D[row][colNum];
            }
        }
        return x;    
    }
    /**
     * checks to see if the matrix is rectangular
     * @return true or false
     */
    public static boolean isRect(int[][] myArr2D)
    {
        boolean rect = false;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for( int i =0; i<myArr2D.length; i++)
        {
            if(myArr2D[i].length >= max)
                max = myArr2D[i].length;
            if(myArr2D[i].length <= min)
                min = myArr2D[i].length;
        }
        if(min==max)
           rect = true;
           return rect;
    }
    /**
     * gets the sum of all the elements add together
     * @return  dot product of arr1 and arr2
     */
    public static int dotProduct(int[] arr1, int[] arr2)
    {
        int sum = 0;
        if(arr1.length == arr2.length)
        {
          for(int i = 0; i < 3; i++)
         {
            int p = (arr1[i] * arr2[i]);
            sum += p;
            
         }
         return sum;
        }
        else
        {
          System.out.println("The arrays arent the same length");
          return -1;
        }
    }
    /**
     * it first checks to see if you r able to multiply the two matrices and then 
     *   multiplies them
     * @return matC
     */
    public static int[][] matrixMultiply(int[][] matA, int[][] matB)
    {
        if(isRect(matA)== false || isRect(matB)== false || matA[0].length != matB.length)
        {
            System.out.println("You cant not multiply these matrices");
            int[][] matC = {{}};
            return matC;
        }
        else
        {
            int[][] matC = new int[matA.length][matB[0].length];
            for(int i = 0; i < matA.length; i++)
             for(int j = 0; j < matB[0].length; j++)
              for(int k = 0; k < matA[0].length; k++)
                  {
                    matC[i][j] += matA[i][k] * matB[k][j];
                  }
            return matC;
        }
    }
    /**
     * recursivly adds each element within the range of the array
     * @return sum
     */
    private static int sum1DArrRecursive(int[] myArr1D, int min, int max)
    {
        int sum = 0;
        if(min==max)
        { 
          sum += myArr1D[max];
          return sum;
        }
        else
        {
             sum += myArr1D[min] + sum1DArrRecursive(myArr1D, min+1, max);
             return sum;
        }
    }
    /**
     * call apon sum1DArrRecursive to get the sum of all the elements in the array
     * @return sum
     */
    public static int sum1DArr(int[] myArr1D)
    {
        return sum1DArrRecursive(myArr1D, 0, myArr1D.length - 1);
    }
    /**
     * recursivly sorts through the arry to find the largest element
     * @return biggest element
     */
    private static int max1DArrRecursive(int[] myArr1D, int min, int max)
    {
        int huge = 0;
        if(min == max)
        {
            huge = myArr1D[max];
            return huge;
        }
        else
        {
            huge = Math.max(myArr1D[min], max1DArrRecursive(myArr1D, min+1,max));
            return huge;
        }
    }
    /**
     * uses max1DArrRecursive to find the largest element in the entire array
     * @return biggest element
     */
    public static int max1DArr(int[] myArr1D)
    {
        return max1DArrRecursive(myArr1D, 0, myArr1D.length - 1);
    }
}
