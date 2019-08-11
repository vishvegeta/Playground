#include<stdio.h>
int main()
{
  int a,b;
  scanf("%d %d",&a,&b);
  int c=0;
  while(a<=b){
    c=c+a;
    a=a+1;
  }
  printf("%d",c);
  return 0;
  
}