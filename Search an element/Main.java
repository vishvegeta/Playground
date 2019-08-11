#include<stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
  int a[n];
  for(int i=0;i<n;i++){
    scanf("%d",&a[i]);
  }
  int val,count=0;
  scanf("%d",&val);
  for(int i=0;i<n;i++){
    if(a[i]==val){
      count++;
          }
  }
  if(count){
    printf("%d is present in the array",val);
  }
  else {
      printf("%d is not present in the array",val);
    }
  return 0;
}