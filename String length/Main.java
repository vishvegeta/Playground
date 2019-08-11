#include<stdio.h>
int main()
{
  char a[50];
  scanf("%s",a);
  int b;
  b=strlen(a);
  printf("The length of %s is %d",a,b);
  return 0;
}