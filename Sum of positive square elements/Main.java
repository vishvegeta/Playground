#include<stdio.h>
#include<math.h>
int main()
{
  int n;
  scanf("%d",&n);
  int a[n];
  for(int i=0;i<n;i++){
    scanf("%d",&a[i]);
  }
  int b;
  float c;
  int d;
  for(int i=0;i<n;i++){
    b=sqrt(a[i]);
    c=sqrt(a[i]);
    if(c-b==0){
      d=a[i];
    }
  }
  printf("%d",d);
  return 0;
  
  
}