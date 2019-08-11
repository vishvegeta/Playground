#include<stdio.h>
int main()
{
  int n,c=0;
  scanf("%d",&n);
  int a[n];
  for(int i=0;i<n;i++){
    scanf("%d",&a[i]);}
  int sch;
  scanf("%d",&sch);
  for(int j=0;j<n;j++){
    if(a[j]==sch){
      printf("%d",j+1);}
      else if(a[j]!=sch){
        c=c+1;
        if(c==n){
      		printf("%d isn't present in the array.",sch);}}}
  return 0;
}