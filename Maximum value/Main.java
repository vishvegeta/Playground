#include<stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
  int a[n];
  for(int i=0;i<n;i++){
    scanf("%d",&a[i]);
  }
  int b=a[0];
  for(int i=0;i<n;i++){
    if(a[i]>=b){
      b=a[i];
    }
  }
  printf("%d",b);
  return 0;
}