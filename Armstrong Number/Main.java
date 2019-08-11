#include<stdio.h>
#include<math.h>
int main()
{
  int a;
  scanf("%d",&a);
  int b=a;
  int c=0;
  while(a>0){
    c=c+pow((a%10),3);
    a=a/10;
  }
  if(c==b){
    printf("Armstrong Number");
  }
  else{
    printf("Not Armstrong Number");
  }
  return 0;
    
}