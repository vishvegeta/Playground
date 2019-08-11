#include<stdio.h>
int main()
{
  int mugs,jarvolume;
  scanf("%d%d",&mugs,&jarvolume);
  int a[mugs];
  int count=0;
  for(int i=0;i<mugs;i++){
    scanf("%d",&a[i]);
    count=count+a[i];
  }
  if(count<jarvolume){
    printf("YES");
  }
  return 0;
}