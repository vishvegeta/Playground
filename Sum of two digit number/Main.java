#include<stdio.h>
int main()
{
  int a;
  scanf("%d",&a);
  int b=a%10;
  int c=(a/10)%10;
  printf("%d",b+c);
  return 0;
}