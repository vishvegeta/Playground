#include<stdio.h>
int main()
{
  char a[50];
  char b;
  scanf("%s",a);
  for(int i=0; a[i]!='\0';i++){
    for(int j=i+1;a[j]!='\0';j++){
      if(a[i]>a[j]){
        b=a[i];
        a[i]=a[j];
        a[j]=b;
      }
    }
  }
  printf("The sorted string is %s",a);
  return 0;
        
  
}