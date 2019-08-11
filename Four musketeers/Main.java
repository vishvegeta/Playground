#include<stdio.h>
int main()
{
  int x1,x2,x3,y1,y2,y3;
  scanf("%d%d%d%d%d%d",&x1,&y1,&x2,&y2,&x3,&y3);
  float c1,c2;
  c1=(x1+x2+x3)/3.0;
  c2=(y1+y2+y3)/3.0;
  printf("%.1f\n%.1f",c1,c2);
  return 0;


}