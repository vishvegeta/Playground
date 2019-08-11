#include<stdio.h>
int main()
{
  int a;
  scanf("%d",&a);
  int b;
  b=a%10;
  a=a/10;
  b=b+a%10;
  printf("%d",b);
  return 0;
}