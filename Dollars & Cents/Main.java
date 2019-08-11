#include<stdio.h>
int main()
{
  int a,c;
  float b,d;
  scanf("%d%f%d%f",&a,&b,&c,&d);
  b=(b+d)/100.0;
  a=a+c;
  a=a+b;
  int f=b;
  b=(b-f)*100;
  f=b;
  printf("%d\n%d",a,f);
  return 0;
}