#include<stdio.h>
int main()
{
  int n;
  printf("Enter n value");
  scanf("%d",&n);
  int i=1;
  int d=1;
  int a=1;
  while(a<=n)
  {
    if(a%2==1){
      d=i*i*i;
      printf("%d ",d);
      i=i+1;
    }
    if(a%2==0){
      d=i*i;
      printf("%d ",d);
      i=i+1;}
    a=a+1;
  }
 return 0;
}