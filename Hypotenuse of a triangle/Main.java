#include<stdio.h>
int main()
{
  float opp,adj;
  scanf("%f %f",&opp,&adj);
  float hyp;
  hyp= (opp*opp)+(adj*adj);
  printf("%.2f",sqrt(hyp));
  return 0;
}