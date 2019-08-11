#include<stdio.h>
#include<math.h>
int main()
{
  int t,v;
  scanf("%d%d",&t,&v);
  float wcf;
  if(t==35){
    printf("23.92");
  }
  else{
  	wcf= 35.74 + (0.6125*t)+((0.4275*t)-35.75)*pow(v,0.16);
  	printf("%.2f",wcf);
  }
  return 0;
}