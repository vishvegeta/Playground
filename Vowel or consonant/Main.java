#include<stdio.h>
int main()
{
  char go;
  scanf("%c",&go);
  if (go=='a'||go=='e'||go=='i'||go=='o'||go=='u'||go=='A'||go=='E'||go=='I'||go=='O'||go=='U'){
    printf("Vowel");
  }
  else{
    printf("Consonant");}
    
  return 0;
}