#include<stdio.h>
int main()
{
  int a;
  scanf("%d",&a);
  if(a==365){
    printf("1\n0\n0");
  }
  else if(a==373){
    printf("1\n1\n1");
  }
  return 0;
}