#include<stdio.h>
int main()
{
  char a[100];
  scanf("%s",a);
  int i=0;
  while(a[i]!='\0'){
    a[i]=a[i]-32;
    i++;
  }
  printf("String in uppercase is %s",a);
  return 0;
}