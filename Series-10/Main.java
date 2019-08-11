#include<stdio.h>
int main()
{
  int n;
  printf("Enter n value\n");
  scanf("%d",&n);
  int a=0;
  for(int i=1;i<=n;i++)
  {
    printf("%d ",a);
    a=a+(2*i);
  }
  return 0;
}