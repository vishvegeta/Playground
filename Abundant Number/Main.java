#include<stdio.h>
int main()
{
  int a;
  scanf("%d",&a);
  int b=0;
  for(int i=1;i<a;i++){
    if(a%i==0){
      b=b+i;
    }
  }
  if(b>a){
    printf("Abundant Number");}
  else{
    printf("Not Abundant Number");}
  return 0;
}