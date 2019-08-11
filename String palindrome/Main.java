#include<stdio.h>
#include<string.h>
int main()
{
  char a[100];
  scanf("%s",a);
  char b[100];
  int n=strlen(a);
  for(int i=n-1;i>=0;i--){
    b[n-1-i]=a[i];
  }
  b[n]='\0';
  
  
  if(strcmp(a,b)){
    printf("Not Palindrome");
  }
  else{
    printf("Palindrome");
}
   return 0;
}