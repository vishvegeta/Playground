#include<stdio.h>
int main()
{
  int a,b;
  scanf("%d%d",&a,&b);
  int c=0;
  int d=0;
  for(int i=1;i<=a;i++){
    if(a%i==0){
      c=c+i;
    }
  }
  for(int i=1;i<=b;i++){
    if(b%i==0){
      d=d+i;
    }
  }
  if((c/a)==(d/b)){
    printf("Friendly Pair");
  }
  else{
    printf("Not Friendly Pair");
  }
  return 0;


}