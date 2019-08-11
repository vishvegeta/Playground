#include<stdio.h>
int main()
{
  int a;
  scanf("%d",&a);
  int b=a%10;
  a=a/1000;
  b=b+a;
  printf("%d",b);
  return 0;
}