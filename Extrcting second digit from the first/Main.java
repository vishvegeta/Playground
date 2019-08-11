#include <stdio.h>
int main() {
  int n;
  scanf("%d",&n);
  while(n>100)
    n=n/10;
  if(n<100)
    printf("%d",(n%10));
  else
    printf("Invalid");
  
	return 0;
}