/* get_kr_rate_conc.c
   jeremiah locke, csci112
   2/27/12
*/

#include <stdio.h>

void kgRate(double *g, int *h, int *i)
{
 double o;
 int  p, q;

 printf("Enter rate in mg/kg/hr=> ");
 scanf("%lf", &o); // scans in number for rate

 printf("Enter patient weight in kg=> ");
 scanf("%d", &p); // scans in number for patients weight

 printf("Enter concentration in mg/ml=> ");
 scanf("%d", &q); // scans in concentration

 *g = o;
 *h = p;
 *i = q;
}
