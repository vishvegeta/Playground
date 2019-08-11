#include <stdio.h>
int main() {
  char alpha;
  scanf("%c",&alpha);
  if(alpha>=65 && alpha<= 91){ //alpha<97){
    alpha=alpha+32;
    printf("%c",alpha);}
  else if(alpha>=97 && alpha<=123){
    alpha=alpha-32;
    printf("%c",alpha);}
   

	return 0;
}