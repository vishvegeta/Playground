#include<stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
  int a[n];
  for(int i=0;i<n;i++){
    scanf("%d",&a[i]);
  }
  int b=0;
  for(int i=0;i<n;i++){
    b=b+a[i];
  }
  printf("%d",b);
  return 0;
}