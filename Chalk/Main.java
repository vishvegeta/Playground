#include<stdio.h>
#include<math.h>
int main()
{
  int n;
  scanf("%d",&n);
  int b;
  b=sqrt(n);
  n=n+b+1;
  printf("%d",n);
  return 0;
}