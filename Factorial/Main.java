#include<stdio.h>
int main()
{
  int a;
  scanf("%d",&a);
  int n=1;
  if(a==1 || a==0){
    printf("1");}
  else{
    for(int i=a;i>=2;i--){
      n=n*i;
    }
  }
  printf("%d",n);
  return 0;
}