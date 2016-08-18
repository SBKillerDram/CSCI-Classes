/* lab2.c
   Jeremiah Locke, CSCI112, Lab2
   1/24/12
*/

#include <stdio.h>

int main(void)
{
double fahrenheit,  //temprature in Fahrenheit
       celsius;  // tempreture in Celsius
scanf("%lf", &fahrenheit); // scans in number for Fahrenheit

printf("Thank you for submitting temperature reading in Fahrenheit.\n");

celsius = (5.0/9.0) * (fahrenheit - 32);  // converts Fahrenheit into Celsius

printf("The temperature in degrees Celsius =%7.3f.\n", celsius);
return(0);
}
