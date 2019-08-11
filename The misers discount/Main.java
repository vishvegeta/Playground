#include<stdio.h>
int main()
{
  float a,b,c;
  scanf("%f%f%f",&a,&b,&c);
  printf("%.2f\n%.2f\n%.2f\n",a+b,(a+b)-((a+b)/100)*c,((a+b)/100)*c);
  return 0;
}