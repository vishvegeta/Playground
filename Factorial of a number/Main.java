#include <stdio.h>
int main() {
	int n;
  scanf("%d",&n);
  int a;
  a=n;
  while(n>1)
  {n=n-1;
  	a=a*n;
  }
  printf("%d",a);
	return 0;
}