/* by_weight.c
   jeremiah locke, cscsi112
   2/27/12
*/

#include <stdio.h>

int weight(double mkh, int pwkg, int cmm)
{
 double temp =  mkh * (double) pwkg;

 double temp2 = temp / (double)cmm;
 temp2 + 0.5;
 int  rateMill = (int) temp2;

 printf("The rate in millimeters per hour is %d.\n",rateMill);

 return(rateMill);
}
