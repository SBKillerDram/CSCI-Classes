/* 
  Jeremiah Locke, csci112, trap.c
  3/05/12
*/

#include <stdio.h>
#include <math.h>

void trap(double f(double f_arg), double a, double b, double n, double *h, double *area)
{
 double h1;
 double h2;
 double hAvg;

 h1 = f(a);
 h2 = f(b);

 hAvg = (h1 + h2) / 2;

 *area = ( *area + (hAvg * n));
}
