#include<stdio.h>
#include<math.h>
int main()
{
  int bin;
  scanf("%d",&bin);
  int rem=0;
  int sum=0;
  int b=0;
  while(bin!=0){
    rem=(bin%10);
    sum= sum+rem*(pow(2,b));
    b=b+1;
    bin=bin/10;
  }
  printf("%d",sum);
    
  
  
  return 0;
}