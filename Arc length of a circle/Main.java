#include<stdio.h>
int main()
{
  float radius;
  float ca;
  scanf("%f %f",&radius,&ca);
  const float pi=3.14;
  float ta;
  ta= ca/360.0;
  float arcl;
  arcl= 2*pi*radius*ta;
  printf("%.2f",arcl);
  return 0;

}