#include<stdio.h>
int main()
{
  int d;
  scanf("%d",&d);
  float r=d/2.0;
  const float pi=3.14;
  float area;
  area=pi*(r*r);
  printf("%.2f",area);
  return 0;
}