#include<stdio.h>
int main()
{
  int a,b;
  scanf("%d%d",&a,&b);
  int c=(a*a*a)*1000;
  if(c>b){
    printf("Can store");
  }
  else printf("Cannot store");
  return 0;
}