#include<stdio.h>
int main()
{
  int p,t,r;
  scanf("%d %d %d",&p,&r,&t);
  float i,d;
  i=(p*t*r)/100.0;
  d=0.02*i;
  printf("%.2f\n%.2f\n%.2f\n%.2f\n",i,p+i,d,p+i-d);
  return 0;
}