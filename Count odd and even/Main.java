#include<stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
  int a[n];
  for(int i=0;i<n;i++){
    scanf("%d",&a[i]);
  }
  int odd=0;
  int even=0;
  for(int i=0;i<n;i++){
    if(a[i]%2==0){
      even++;
    }
    else if(a[i]%2!=0){
      odd++;
    }
  }
  printf("Odd: %d\nEven: %d",odd,even);
  return 0;
    
}