#include<stdio.h>
int main()
{
  char a[100];
  int reg;
  float gpa;
  int arr;
  scanf("%s %d %f %d",&a,&reg,&gpa,&arr);
  if((gpa<7.5)&& (arr>0)){
    printf("%s\n%d\nNot Eligible to attend placement",a,reg);}
  return 0;

}