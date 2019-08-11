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
  int i=0;
  int f[100];
  while(sum>0){
    f[i]=sum%8;
    sum=sum/8;
    i++;
  }
  for(int j=i-1;j>=0;j--){
    printf("%d",f[j]);
  }
  return 0;
}
