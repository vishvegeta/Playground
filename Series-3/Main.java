#include<stdio.h>
int main()
{
  printf("Enter n value\n");
  int n;
  scanf("%d",&n);
  int a,b;
  a=6;
  b=9;
  printf("%d ",a);
  printf("%d ",b);
  int c=3;
  int temp=0;
  for(int i=1;i<=n-2;i++){
    c=c+2;
    b=b+c;
    printf("%d ",b);
  }
  return 0;
}