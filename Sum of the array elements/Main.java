#include <stdio.h>
#define MAX_SIZE 100
int sum(int arr[], int start, int len);
int main()
{
    int arr[MAX_SIZE];
    int num, i, sumofarray;
    scanf("%d", &num);
    for(i=0; i<num; i++)
    {
        scanf("%d", &arr[i]);
    } 
    sumofarray = sum(arr, 0, num);
    printf("%d", sumofarray); 
    return 0;
}
int sum(int arr[], int start, int len)
{
    if(start >= len)
        return 0;
 
    return (arr[start] + sum(arr, start + 1, len));
}