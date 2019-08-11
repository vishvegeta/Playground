#include<stdio.h>
#include<string.h>
int main()
{
  char k[50];
  int i,length;
  int count=1;
  gets(k);
  length=strlen(k);
  if(length>20)
  {
    printf("Invalid Input");
  }
  else
  {
  for(i=0;k[i]!='\0';i++)
  {
    if(k[i]==k[i+1])
    {
      count=count+1;
      continue;
    }
  printf("%c%d",k[i],count);
  count=1;
  }
  }
  
}