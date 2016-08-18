/* fig_ml_hr.c
   Jermeiah Locke, CSCI112
   2/27/12
*/

#include <stdio.h>

int mlHr(void)
{
 int a;
 printf("Enter number of hours=> ");
 scanf("%d", &a);
 
 a = 1000 / a;
 
 printf("The rate in milliliters per hour is %d\n", a);
 return(0);
}
