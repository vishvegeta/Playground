#include<stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
  int a[n];
  for(int i=0;i<n;i++){
    scanf("%d",&a[i]);
  }
  int val;
  scanf("%d",&val);
  for(int i=0;i<n;i++){
    if(a[i]==val){
      a[i]=a[i+1];
    }
  }
  printf("Array after deletion is:\n");
  for(int i=0;i<n-1;i++){
    printf("%d\n",a[i]);
  }
  return 0;
}