#include <stdio.h>
int main() {
  int n;
  scanf("%d",&n);
  int first=n%10;
  while(n>10)
    n=n/10;
  int second=n;
  printf("%d",first+second);
	return 0;
}