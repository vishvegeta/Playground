#include<stdio.h>
int main()
{
  int a;
  scanf("%d",&a);
  int c=a;
  int b=0;
  while(a>0){
    b=(b*10)+a%10;
    a=a/10;
  }
  if(b==c){
    printf("Same");
  }
  else{
    printf("Not Same");}
  return 0;
}