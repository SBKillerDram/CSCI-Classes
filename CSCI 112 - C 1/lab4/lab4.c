/* lab4.c
   Jeremiah Locke, CSCI112, Lab4
   2/7/12
*/

#include <stdio.h>

int main(void)
{
 double x;
 double y;

 scanf("%lf%lf", &x,&y);
 
if((x == 0.0) && (y == 0.0)) // checks cordinates to see if they lay on the origin
   printf("(%6.1f,%6.1f) is on the origin.\n",x,y);

else if((x > 0.0 ||  x < 0.0) &&  (y == 0.0)) // checks cordinates if they lay on the x-axis
   printf("(%6.1f,%6.1f) is on the x-axis.\n",x,y);

else if((x == 0.0) && (y < 0.0 || y > 0.0)) // checks cordinates if they lay on the y-axis
   printf("(%6.1f,%6.1f) is on the y-axis.\n",x,y);

else if(x > 0.0 && y > 0.0)  // checks cordinates if they lay in quadrant 1
   printf("(%6.1f,%6.1f) is in quadrant 1.\n",x,y);

else if(x < 0.0 && y > 0.0)  // checks cordinates if they lay in quadrant 2
   printf("(%6.1f,%6.1f) is in quadrant 2.\n",x,y);

else if(x < 0.0 && y < 0.0) // checks cordinates if they lay in quadrant 3
   printf("(%6.1f,%6.1f) is in quadrant 3.\n",x,y);

else if(x > 0.0 && y < 0.0) // checks cordinates if they lay in quadrant 4
   printf("(%6.1f,%6.1f) is in quadrant 4.\n",x,y);

else  // prints out statement saying you did something wrong
   printf("you screwed it up way to go stupid user.\n");

 return(0);
}
