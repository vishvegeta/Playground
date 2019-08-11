#include<stdio.h>
int main()
{
  int a[50];
  for (int i=0;i<=100;i++){
    scanf("%d",&a[i]);
  }
  int i=0;
  int even,odd;
  even=0;
  odd=0;
  float count2=0;
  float count1=0;
  while(a[i]!=-1){
    if(a[i]%2==0){
      even=even+a[i];
      count1=count1+1;}
    else if(a[i]%2==1){
      odd=odd+a[i];
      count2=count2+1;}
    i=i+1;
  }
  printf("%d\n",even);
  printf("%d\n",odd);
  printf("%.2f\n",even/count1);
  printf("%.2f\n",odd/count2);
  
  
  return 0;
}