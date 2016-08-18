/* get_rate_drop_factor.c
   Jeremiah Locke, CSCI112
   2/27/12
*/

#include <stdio.h>

void dropFactor(int *d, int *e)
{
 int b, c;
 printf("Enter rate in ml/hr=> ");
 scanf("%d", &b); // scans in number for rate

 printf("Enter tubing's drop factor(drops/ml)=> ");
 scanf("%d", &c); // scans in number for factor

 *d = b;
 *e = c;
}
