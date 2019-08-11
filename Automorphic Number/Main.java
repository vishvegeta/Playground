#include<stdio.h>
int main()
{
  int a,b;
  scanf("%d",&a);
  b=a*a;
  b=b%10;
  if(a==b){
    printf("Automorphic Number");}
  else{
    printf("Not Automorphic Number");}
  return 0;
}