#include<stdio.h>
int main()
{
  printf("Enter n value\n");
  int n;
  scanf("%d",&n);
  int a,b;
  a=0;b=3;
  int c=3;
  printf("%d ",a);
  printf("%d ",b);
  for(int i=1;i<=n-2;i++){
    c=c+2;
    b=b+c;
    printf("%d ",b);
  }
  return 0;
  
}