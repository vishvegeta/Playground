#include <stdio.h>
int main() {
  int n;
  scanf("%d",&n);
  int a=1;
  for(a;a<2*n;a=a+2)
    printf("%d\n",a);
	return 0;
}