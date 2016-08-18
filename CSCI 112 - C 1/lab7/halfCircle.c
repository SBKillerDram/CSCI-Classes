/*
   Jeremiah Locke, csci112, HalfCircle.c
   3/05/12
*/

#include <stdio.h>
#include <math.h>

double halfCircle(double x)
{
 double h;
 double s;
 h = 4 - (x * x);
 s = sqrt(h);
 return(s);
}
