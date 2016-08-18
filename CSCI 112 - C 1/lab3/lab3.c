/* lab3.c
   Jeremiah Locke, CSCI112, lab3
   1/31/12
*/

#include <stdio.h>
int main(void)
 {
 twoDecimalRnd();
 return(0);
 }

int twoDecimalRnd(void)
 {
 double output,  //the number that will be printed out
        rounding, //the number that will hav the math done to it
        input;   //the number that will be scaned in
 
 scanf("%lf", &input); // scans in number
 printf("Thank you for entering a number. The number you enter was%8.3f.\n", input); // prints scanned number

 rounding = ((input * 100)+0.5); // rounds the number
 rounding = (int)rounding; // cast the rounded number to int to get rid of unneeded numbers
 output = (double)(rounding / 100); // turns number back into correct format

// printf("%7.3f has been rounded to %7.3f.\n", input, output); //prints final number
 printMyResults(input, output);

 return(0);
 }

int printMyResults(double input, double output)
 {
 printf("%7.3f has been rounded to %7.3f.\n", input, output);
 return(0);
 }
