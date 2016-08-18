/* lab9.c
   Jeremiah Locke, CSCI112, lab9
   4/3/12
*/

#include <stdio.h>
#include <stdlib.h>

int main(void)
{
 int beg;
 int end;
 int iter;
 int index;
 int aSize;
 int numValues;
 int i;
 int j;
 int k;

 scanf("%d", &aSize);

 int* array = (int*) calloc(aSize, sizeof(int));

 for(i = 0; i < aSize; i++)
 {
  scanf("%d", &array[i]);
 }

 scanf("%d", &numValues);
 
 int* vals = (int*) calloc(numValues, sizeof(int));

 for(j = 0; j < numValues; j++)
 {
  scanf("%d", &vals[j]);
 }

 for(k = 0; k < numValues; k++)
 {
  beg = 0;
  end = aSize - 1;
  iter = 0;

  int temp = vals[k];

  index = Search(temp, beg, end, array, &iter);
  
  if(index == -1)
  {
   printf("%4d not found!\n", temp);
  }
  else
  {
   printf("%4d found at %4d during iteration %4d.\n", temp, index, iter);
  }
 }
 return(0);
}
