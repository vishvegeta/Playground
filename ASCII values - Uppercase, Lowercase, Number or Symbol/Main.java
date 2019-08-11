#include<stdio.h>
int main()
{
  char a;
  scanf("%c",&a);
  int b=a;
  if(b>=65&&b<=91){
    printf("Upper");}
  else if(b>=97 && b<=123){
    printf("Lower");}
  else{
    printf("Symbol");
  }
  return 0;

  }