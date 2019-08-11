#include<stdio.h>
int main()
{
  int a,b,c;
  scanf("%d%d%d",&a,&b,&c);
  if((a*b)>c){
    printf("Can reach");
  }
  else{
    printf("Cannot reach");
  }
  return 0;
}