#include<stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
  int a[n];
  for(int i=0;i<n;i++){
    scanf("%d",&a[i]);}
  int b,c;
  scanf("%d %d",&b,&c);
  int index1,index2;
  index1=-1;
  index2=-1;
  for(int j=0;j<n;j++){
    if(a[j]==b){
      index1=j;}
    else if(a[j]==c){
      index2=j;}}
  printf("Element 1 index = %d\n",index1);
  printf("Element 2 index = %d\n",index2);
  	
  return 0;
}