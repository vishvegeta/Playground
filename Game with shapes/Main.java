#include<stdio.h>
int main()
{
  int r,l;
  scanf("%d %d",&r,&l);
  if(r>l){
    printf("circle cannot be inside a Square");
  }
  else{
    printf("circle can be inside a square");}
  return 0;
}