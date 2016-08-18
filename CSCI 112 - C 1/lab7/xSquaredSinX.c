/* Jeremiah Locke, csci112, xSquaredSinX.c
   3/05/12
*/

#include <stdio.h>
#include <math.h>

double xSquaredSinx(double x)
{
 double xSquared;  // use to find x^2
 double sinX;     // used to find the sin of x
 double answer;   // used to return final answer

 xSquared = x * x;
 sinX = sin(((x *180)/3.14159));
 answer = xSquared * sinX;
 return answer;
}
