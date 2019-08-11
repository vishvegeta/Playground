#include<stdio.h>
int main()
{
  int l1,b1,l2,b2,l3,b3;
  scanf("%d%d%d%d%d%d",&l1,&b1,&l2,&b2,&l3,&b3);
  int a1,a2,a3;
  a1=l1*b1;
  a2=l2*b2;
  a3=l3*b3;
  if(a1>a2+a3){
    printf("Raj can fix both painting");}
  else{
    printf("Raj cannot fix both painting");}
  return 0;
}