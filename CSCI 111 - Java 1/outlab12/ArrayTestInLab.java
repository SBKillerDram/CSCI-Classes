
/**
 * tests the class ArrayMethods
 * 
 * @author JJ Locke
 * @version 4/19/11
 */
public class ArrayTestInLab
{
    public static void main()
{
    int[][] arr2Dc = {{3, 1, 0},
                      {2, 5, 4},
                      {6, 1, 3},
                      {4, 1, 1}},
            arr2Dd = {{1, 2},
                      {3, 4},
                      {5, 6}};
    System.out.format("%nTesting matrixMultiply()%n");
    ArrayMethods.print2DArr1(ArrayMethods.matrixMultiply(arr2Dc, arr2Dd));
    
    int[] arr1Da = {3, 6, -14, 2},
          arr1Db = {4, 5, 6};
          
    System.out.format("%nTesting sum1DArr()%n");
    System.out.println(ArrayMethods.sum1DArr(arr1Da));
    
    System.out.format("%nTesting max1DArr()%n");
    System.out.println(ArrayMethods.max1DArr(arr1Da));
    
    System.out.format("%nNow testing error values%n%n");
    
    int [][] arr2De = {{1, 2, 3},
                       {4, 5}},
             arr2Df = {{1, 2, 3},
                       {4, 5, 6}};
                       
    ArrayMethods.transpose(arr2De);
    ArrayMethods.getRow(arr2De, 2);
    ArrayMethods.getColumn(arr2De, 2);
    ArrayMethods.dotProduct(arr1Da, arr1Db);
    ArrayMethods.matrixMultiply(arr2Dc, arr2Df);
    ArrayMethods.matrixMultiply(arr2Dc, arr2De);
}
}
