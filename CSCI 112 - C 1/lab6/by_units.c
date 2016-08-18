/* by_units.c
   jeremiah locke, csci112
   2/27/12
*/

#include <stdio.h>

int units(int hrRate, int cum)
{
 double temp = (double) hrRate / cum;
 temp + 0.5;
 int mh = (int) temp;

 printf("The rate in milliliters per hour is %d.\n", mh);

 return(mh);
}
