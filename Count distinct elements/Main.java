#include<stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
  int a[n];
  for(int i=0;i<n;i++){
    scanf("%d",&a[i]);
  }
 int res = 1; 
 for (int i = 1; i < n; i++) { 
        int j = 0; 
        for (j = 0; j <= i; j++) 
            if (a[i] == a[j]) 
                break; 
        if (i == j) 
            res++; 
    }
        
  printf("There are %d distinct elements in the array.",res);
  
  return 0;
}