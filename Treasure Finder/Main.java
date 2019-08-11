#include<stdio.h>
int main()
{
  int a,b,c;
  scanf("%d%d%d",&a,&b,&c);
  int second;
  if(a>b && a>c && b>c)
    second=b;
  else if(a>b&&a>c&&c>b)
    second=c;
  else if(b>a&&b>c&&c>a)
    second=c;
  else if(b>a&&b>c&&a>c)
    second=a;
  else if(c>b&&c>a&&a>b)
    second=a;
  else if(c>b&&c>a&&b>a)
    second=b;
  printf("The treasure is in the box which has number %d.\n",second);
  int gcd;
  if(b%a==0 && c%a==0)
    gcd=a;
  else if(a%b==0 && c%b==0)
    gcd=b;
  else if(a%c==0 && b%c==0)
    gcd=c;
  printf("The code to open the box is %d.",gcd);
  return 0;
  
}