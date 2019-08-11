#include<stdio.h>
int main()
{
  int a;
  scanf("%d",&a);
  int b=0;
  int c=a;
  while(a>0){
    b=b+(a%10);
    a=a/10;
  }
  if(c%b==0){
    printf("Harshard Number");}
  else if((c%b) != 0){
    printf("Not Harshard Number");}
  return 0;
}