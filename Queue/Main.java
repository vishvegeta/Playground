#include<stdio.h>
int main()
{
  int groups,bus;
  scanf("%d%d",&groups,&bus);
  int a[groups];
  int sum=0;
  for(int i=0;i<groups;i++){
    scanf("%d",&a[i]);
    sum=sum+a[i];
  }
  printf("%d",(sum/bus)+1);
  return 0;
}