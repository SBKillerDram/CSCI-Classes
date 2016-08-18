/* Jeremiah Locke, lab10,lab10.c,  02/25/12 */

#include<stdio.h>
#include<stdlib.h>

 struct student_info
 {
  int studentId;
  char class[10];
  int sec;
  int crds;
  struct student_info *next_std; 
};

void doStuff(struct student_info);

void main()
{
 struct student_info student;

 doStuff(student);

}
