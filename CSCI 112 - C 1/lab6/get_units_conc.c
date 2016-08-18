/* get_units_conc.c
   jeremiah locke, csci112
   2/27/12
*/

#include <stdio.h>

void unitsConc(int *k, int *l)
{
 int w, x;

 printf("Enter rate in units/hr=> ");
 scanf("%d", &w); // scans in number for hrRate
 
 printf("Enterconcentration in units/ml=> ");
 scanf("%d", &x); // scans in number for cum

 *k = w;
 *l = x;
}
