#include<stdio.h>
int main()
{
  int balls,truns,sruns,bballs;
  scanf("%d%d%d%d",&balls,&truns,&sruns,&bballs);
  int overs;
  overs=balls/6;
  float oversfin=(bballs/6.0)-0.2;
  float crr=sruns/oversfin;
  float rrr=(float)truns/overs;
  printf("%d\n",overs);
  printf("%.1f\n",oversfin);
  printf("%.1f\n",crr);
  printf("%.1f\n",rrr);
  if(crr>rrr){
    printf("Eligible to Win");}
  else{
    printf("Not Eligible to Win");}
  
  return 0;
}