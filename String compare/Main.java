#include<stdio.h>
int main()
{
  char a[100];
  char b[100];
  scanf("%s%s",a,b);
  if(strcmp(a,b)){
    printf("Strings are not same");
  }
  else{
    printf("Strings are same");
  }
  return 0;
}