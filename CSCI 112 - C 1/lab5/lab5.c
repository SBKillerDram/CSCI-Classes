/* lab5.c
   Jeremiah Locke, CSCI112
   2/14/12
*/

#include <stdio.h>
#include <math.h>

int main(void)
{
 FILE *datain5;
 datain5 = fopen("datain5.txt","r"); // opens datain5 file
 
 int pali;
 fscanf(datain5, "%d", &pali); // makes pali equal to the number scaned in
 int  countA = 0; // counts the number of times the while loop has run

printf("The palindromes of %d are\n",pali); //prints

 while(countA < pali + 1)
 {
  int countB = 0; // counts the up for the first half of the palindrome
  int countC = countA;// counts down for the second half of the last half of the palindrome

  for(countB; countB < countA; countB++)
  {
   printf("%d ", countB); // prints the first half of the first half of the palindrome
  }
  for(countC; countC > -1; countC--)
  {
   printf("%d ", countC); // prints the last half of the palindrome
  }
  countA++;  // ups countA by 1
  printf("\n"); // makes print go to next line
 }
fclose(datain5);
return(0);
}
