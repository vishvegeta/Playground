#include<stdio.h>
#include<string.h>
int main()
{
  int a;
  int i=0;
  scanf("%d",&a);
  int b[100];
  while(a>0){
    b[i]=a%8;
    a=a/8;
    i++;
  }
  for(int j=i-1;j>=0;j--){
    printf("%d",b[j]);
  }
  return 0;
}