/* Jeremiah Locke, lab10, LinkedFunction.c, 2/25/12 */

#include<stdio.h>
#include<stdlib.h>

void doStuff(struct student_info std)
{
 struct std *start;
 struct std *next;
 int num1=0, num2=0, num3=0;
 int i=0, j=0;

 int id=0, sec=0, crd=0, next=0;
 char class=0;

 scanf("%d", &num1); /* number of students*/

 for (i = 0; i < num1; i++)
 {
  
  start = (struct std *) malloc(sizeof(struct std));
  next = start;
  scanf("%d", &stds->studentIds);
  next->next_std = (struct std *) malloc (sizeof(struct std));
  next = next->next_std;
 }
 next->next_std = NULL;

 scanf ("%d", &num2); /* number of initial classes */

 for (i=0; i< num1; i++)
 {
  printf("%d : %c %d %d\n", std->studentId, std->class, std->sec, std->crds);
 }
 printf("-------------------\n");
 printf("After Modifications\n");
 printf("-------------------\n");
 for(i=0; i<num1; i++)
 {
  printf("%d : %c %d %d\n", std->studentId, std->class, std->sec, std->crds);
 }
}
