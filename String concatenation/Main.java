#include<stdio.h>
int main()
{
  char a[100];
  char b[100];
  scanf("%s%s",a,b);
  strcat(a,b);
  printf("The concatenated string is %s",a);
  return 0;
}