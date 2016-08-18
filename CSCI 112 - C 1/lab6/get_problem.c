/* get_problem.c
   Jeremiah Locke
   2/26/12
*/

#include <stdio.h>

int getProblem(void)
{
 int choice; // selects problem
 
 // varibles for problem 1
 int rate; // ml/hr
 int factor; // drops/ml
 int dropRate; // drop/min

 // varibles for problem 3
 double mkh; // mg/kg/hr
 int pwkg; // patient weight in kg
 int cmm; // concentration in mg/ml
 int rateMill; // rate in ml/hr

 // varibles for problem 4
 int hrRate; // rate in units/hr
 int cum; // concentratrion in units/ml
 int mh; // ml/hr

 printf("INTREAVENOUS RATE ASSISTANT\n");
do
{
 printf("\nEnter the number of the problem you wish to solve.\n");
 printf("    GIVEN A MEDICAL ORDER IN                CALCULATE RATE IN\n");
 printf("(1) ml/hr & tubing drop factor              drops / min\n");
 printf("(2) 1 L for n hr                            ml / hr\n");
 printf("(3) mg/kg/hr & concentration in mg/ml       ml / hr\n");
 printf("(4) units/hr & concentration in units/ml    ml / hr\n");
 printf("(5) QUIT\n");

 printf("Problem=>  ");
 scanf("%d", &choice);

switch(choice)
{
 case 1:
     dropFactor(&rate, &factor);
     dropsMin(rate, factor);
     break;
 case 2:
     mlHr();
     break;
 case 3:
     kgRate(&mkh, &pwkg, &cmm);
     weight(mkh, pwkg, cmm);
     break;
 case 4:
     unitsConc(&hrRate, &cum);
     units(hrRate, cum);
     break;
 case 5:
     break;
 default:
     printf("\nUnexpected input parameter. Please, behave or I am going to have a talk with your Mama!\n");
}
}while(choice != 5);
return(0);
}
