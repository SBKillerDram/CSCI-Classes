/* fig_drops_min.c
   jeremiah locke, csci112
   2/27/12
*/

#include <stdio.h>

int dropsMin(int rate, int factor)
{
 int dropRate = (rate * factor) / 60; // figures drops per min

 printf("The drop rate per minute is %d.\n",dropRate);

 return(dropRate);
}
