#include<stdio.h>
int main()
{
  int a;
  scanf("%d",&a);
  int b=a*0.5;
  int c=(a*0.65)+100;
  if(a<=200)
  {
    printf("Rs.%d",b);
  }
  else if((a>200)&&(a<=400))
  {
    printf("Rs.%d",c+1);
  }
  else if((a>400)&&(a<=600))
  {
    printf("Rs.%d",(a*0.80)+200);
  }
  else
  {
    printf("Rs.%d",(a*1.25)+425);
  }
  return 0;
}