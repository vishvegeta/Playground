#include<stdio.h>
int main()
{
  char a[100];
  scanf("%s",a);
  int count =0;
  for(int i=0;a[i]!='\0';i++){
    if(a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u'){
      count=count+1;
    }
  }
  printf("Number of vowels: %d",count);
  return 0;
}