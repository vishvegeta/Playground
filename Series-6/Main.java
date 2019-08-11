#include<stdio.h>
#include<math.h>
int main()
{
  printf("Enter n value\n");
  int n;
  scanf("%d",&n);
  int i=1;
  int b=0;
  while(i<=n){
    b=pow(i,i);
    printf("%d ",b);
    i++;
  }
  return 0;
  
}