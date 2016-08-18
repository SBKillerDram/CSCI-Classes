/* BinarySearch.c
   Jeremiah Locke, CSCI112, lab9
   4/3/12
*/

#include <stdio.h>
#include <stdlib.h>

int Search(int val, int beg, int end, int array[], int *iter)
{
 int index;
 
 if(val < array[beg] || val > array[end])
 {
  return(-1);
 }
 else
 {
  if(beg <= end)
  {
   int mid = (beg + end) / 2;
   if(val == array[mid])
   {
    return(mid);
   }
   else
   {
    *iter +=1;
    if(val < array[mid])
    {
     return(Search(val, beg, mid - 1, array, iter));
    }
    else
    {
     return(Search(val, mid + 1, end, array, iter));
    }
   }
  }
 }
}
