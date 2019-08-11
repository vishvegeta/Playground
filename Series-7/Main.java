#include<stdio.h>
int main()
{
  printf("Enter n value\n");
  int n;
  scanf("%d",&n);
  int a,b,c,d;
  a=10;
  b=5;
  c=50;
  d=10;
  for(int i=1;i<=n;i++){
    if(i%2==1){
      printf("%d ",a);
      a=a+c;
    }
    if(i%2==0){
      printf("%d ",b);
      b=b+d;
    }
  }
  return 0;
}