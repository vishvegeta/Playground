#include<stdio.h>
int main()
{
  int a;
  scanf("%d",&a);
  int b,c;
  b=7;
  c=5;
  //printf("%d ",b);
  //printf("%d ",c);
  for(int i=1;i<=a;i++)
  {
    if(i%2==1){
      printf("%d ",b);
      b=b+1;
    	
    }
    if(i%2==0){
      printf("%d ",c);
      c=c+1;
    	
  }
  }
  return 0;
  
}