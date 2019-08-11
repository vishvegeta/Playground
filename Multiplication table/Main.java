#include<stdio.h>
int main()
{
  int a,b;
  scanf("%d %d",&a,&b);
  int i=1;
  while(i<=b){
  	printf("%d * %d = %d\n",a,i,a*i);
  	i++;}
  return 0;
}