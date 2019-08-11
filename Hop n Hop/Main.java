#include<stdio.h>
#include<math.h>
int main()
{
  int x1,y1;
  scanf("%d%d",&x1,&y1);
  int a,b,d;
  a=pow(x1-3,2);
  b=pow(y1-4,2);
  d=sqrt(a+b);
  printf("%d",d);
  return 0;
  
}