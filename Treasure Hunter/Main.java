#include<stdio.h>
int main()
{
  int a,b,c;
  scanf("%d%d%d",&a,&b,&c);
  int d=0;
  d=(a*b)/100;
  printf("%d\n",d);
  a=a-d;
  d=(a*c)/100;
  printf("%d\n",d);
  a=a-d;
  printf("%d\n",a/3);
  return 0;
}