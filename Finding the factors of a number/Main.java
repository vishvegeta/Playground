#include <stdio.h>
int main() {
	int n;
  scanf("%d",&n);
  int a=1;
  for (a;a<=n;a++)
  {if(n%a==0)
    printf("%d\n",a);
  }
	return 0;
}