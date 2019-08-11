#include <stdio.h>
#include <math.h>
 
int main()
{
   int a, b, c, d;
   double root1, root2;
   scanf("%d%d%d", &a, &b, &c);
 
   d = b*b - 4*a*c;
 
   if (d < 0) { //complex roots
     printf("root1 = %.2lf + %.2lfi  root2 = %.2lf - %.2lfi", -b/(double)(2*a), sqrt(-d)/(2*a), -b/(double)(2*a), sqrt(-d)/(2*a));
     //printf("\n", -b/(double)(2*a), sqrt(-d)/(2*a));
   }
   else { //real roots
      root1 = (-b + sqrt(d))/(2*a);
      root2 = (-b - sqrt(d))/(2*a);
 
      printf("root1 = %.2lf", root1);
      printf("  root2 = %.2lf", root2);
   }
 
   return 0;
}