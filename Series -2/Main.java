#include<stdio.h>
int main()
{
  printf("Enter n value\n");
  int n;
  scanf("%d",&n);
  int a,b,temp;
  a=1;
  b=2;
  printf("%d %d ",a,b);
  for(int i=1;i<=n-2;i++){
    temp=b;
    b=b+a;
    a=temp;
    printf("%d ",b);
  }
  return 0;
}