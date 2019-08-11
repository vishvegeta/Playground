#include<stdio.h>
int main()
{
  int n1;
  scanf("%d",&n1);
  int a1[n1];
  for(int i=0;i<n1;i++){
    scanf("%d",&a1[i]);
  }
  int n2;
  scanf("%d",&n2);
  int a2[n2];
  for(int i=0;i<n2;i++){
    scanf("%d",&a2[i]);
  }
  int b1=0;
  for(int i=0;i<n1;i++){
    b1=b1+a1[i];
  }
  int b2=0;
  for(int i=0;i<n2;i++){
    b2=b2+a2[i];
  }
  if(b2==b1 && n1==n2){
    printf("Same");
  }
  else{
    printf("Not Same");
  }
  return 0;
}