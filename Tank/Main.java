#include<stdio.h>
int main()
{
  int r,h,rate;
  float time;
  scanf("%d%d%d%f",&r,&h,&rate,&time);
  float pi=3.14159;
  float vol;
  vol=pi*r*r*h;
  float totwat;
  totwat=rate*time;
  if(totwat>vol){
    printf("The tank can be filled within %.1f hours",time);
  }
  else
    printf("The tank cannot be filled within %.1f hours",time);
return 0;

}
