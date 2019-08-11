#include<stdio.h>
int main()
{
  int n,c;
  scanf("%d",&n);
  int a[n];
  int b[n];
  for (int i=0;i<n;i++){
    scanf("%d",&a[i]);
  }
  for (int i=0;i<n;i++){
    scanf("%d",&b[i]);
  }
  for (int i = 0; i < n; ++i) 
  {
    for (int j = i + 1; j < n; ++j)
    {
      if (a[i] > a[j])
      {
        c =  a[i];
        a[i] = a[j];
        a[j] = c;
      }
    }
  }
  for (int i = 0; i < n; ++i) 
  {
    for (int j = i + 1; j < n; ++j)
    {
      if (b[i] < b[j])
      {
        c =  b[i];
        b[i] = b[j];
        b[j] = c;
      }
    }
  }
  int sum=0;
  for(int i=0; i<n;i++){
    sum=sum+(a[i]*b[i]);
  }
  printf("%d",sum);
  return 0;
  
}