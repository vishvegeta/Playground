#include<stdio.h>
int main()
{
  int sal,bank,hostel,food,parents;
  scanf("%d%d%d%d%d",&sal,&bank,&hostel,&food,&parents);
  if(sal>bank+hostel+food+parents){
    printf("He can save the money");}
  else{
    printf("He has to work hard");}
  return 0;
}