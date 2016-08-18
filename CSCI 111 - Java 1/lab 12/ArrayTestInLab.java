
/**
 * Write a description of class ArrayTestInLab here.
 * 
 * @author JJ Locke
 * @version 4/14/11
 */
public class ArrayTestInLab
{
    public static void main()
{
    int[] arr1D = {3, 6, -14, 2};
    
    System.out.format("Testing print1DArr()%n");
    ArrayMethods.print1DArr(arr1D);
    
    int[][] arr2Da = {{7, -13, 0, 22, 123},
                      {5, 9, 0, -17},
                      {44, 1, 22, -22, 6, 66},
                      {12, 13, 14}};
                      
    System.out.format("%nTesting print2DArr1()%n");
    ArrayMethods.print2DArr1(arr2Da);
    
    System.out.format("%nTesting print2DArr2()%n");
    ArrayMethods.print2DArr2(arr2Da);
    
    System.out.format("%nTesting getRow()%n");
    ArrayMethods.print1DArr(ArrayMethods.getRow(arr2Da, 2));
    
    System.out.format("%nTesting getColumn()%n");
    ArrayMethods.print1DArr(ArrayMethods.getColumn(arr2Da, 2));
    
    int[][] arr2Db = {{7, -13, 0, 22, 123},
                      {5, 9, 0, -17, 3},
                      {44, 1, 22, 6, 66},
                      {12, 13, 14, 5, 5},
                      {2, 3, 4, 5, 6}};
                      
    System.out.format("%nArray before transpose%n");
    ArrayMethods.print2DArr1(arr2Db);
    
    System.out.format("%nTesting transpose()%n");
    ArrayMethods.transpose(arr2Db);
    
    System.out.format("%nArray after transpose%n");
    ArrayMethods.print2DArr2(arr2Db);
}
}
