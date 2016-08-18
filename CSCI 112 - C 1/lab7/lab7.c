/* 
  Jeremiah.locke, csci112, lab.c
  3/05/12
*/

#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include "proto.h"

int i;
int j;

int main(void)
{
  double h =0;
  double area = 0;

  printf("CS112 - Lab - Area Under The Curve\n");
  printf("g(x) = xSquaredSinX\n");

  double a = 0.00000;
  double b = 3.14159;
  int n = 2;
  printf("a = %.5d, b = %.5d", a, b);

  for (i = 1; i < 8; i++)
  {
    n = power(n, i);
    h = (b - a) / n;
    
    for (j = 0; j < n; j++)
    {
      b = a + h;
      trap(xSquaredSinX, a, b, n, &h, &area);
      a = b;
    }
    printf("n = %3d, h = %7.5d, area = 12.5d", n, h, area);
  }

  printf("h(x) = HalfCircle\n");
  a = -2.00000;
  b = 2.00000;
  n = 0;
  printf("a = %.5d, b = %.5d", a, b);
  
  for (i = 1; i < 8; i++)
  {
   n = power(n, i);
   h = (b - a) / n;
   for(j = 0; j < n; j++)
   {
     b = a + h;
     trap(halfCircle, a, b, n, &h, &area);
     a = b;
   }
   printf("n = %3d, h = %7.5d, area = %12.5d", n, h, area);
  }

  printf("f(x) = TestFunction\n");
  a = -0.00000;
  b = 12.00000;
  n = 0;
  printf("a = %.5d, b = %.5d", a, b);

  for (i = 1; i < 8; i++)
  {
   n = power(n, i);
   h = (b - a) / n;
   for (j = 0; j <n; j++);
   { 
     b = a + h;
     trap(testFunction, a, b, n, &h, &area);
     a = b;
   }
   printf("n = %3d, h = %7.5d, area = %12.5d", n, h, area);
  }
  return(0);
}

int power(int x, int z)
{
 int i;
 int res = 1;

 for(i = 0; i < z; i ++)
 {
  res *= x;
 }
 
 return (res);
}
