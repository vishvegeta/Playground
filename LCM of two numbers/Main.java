#include <stdio.h>
int main()
{
  int a,b,gcd;
  gcd=0;
  scanf("%d %d",&a,&b);
  if(a==0 || a==1)
    printf("%d",a);
  else if(a<0)
    printf("No output");
  else if(a>b){
    for(int i=1;i<=b;i++){
      if(a%i==0 && b%i==0){
      gcd=i;}}
    printf("%d",(a*b)/gcd);}
  else if(b>a){
    for(int i=1; i<=a;i++){
      if(a%i==0 && b%i==0){
      gcd=i;}}
  		printf("%d",(a*b)/gcd);}
  
    
       
   return 0;
}