#include<stdio.h>
int main()
{
  int a[50];
  for(int i=0;i<50;i++){
    scanf("%d",&a[i]);
  }
  int b=0;
  int i=0;
  while(a[i]!=-1){
    b=b+a[i];
    i=i+1;
  }
  printf("%d",b);
  return 0;
  
}