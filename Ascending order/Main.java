#include <stdio.h>
    void main()
    {
 
        int n;
        scanf("%d", &n);
 		int i, j, a;
      	int array[n];
      	for (i = 0; i < n; ++i)
            scanf("%d", &array[i]);
 
        for (i = 0; i < n; ++i) 
        {
 
            for (j = i + 1; j < n; ++j)
            {
 
                if (array[i] > array[j]) 
                {
 
                    a =  array[i];
                    array[i] = array[j];
                    array[j] = a;
 
                }
 
            }
 
        } 
        printf("Sorted array is:\n");
        for (i = 0; i < n; ++i)
            printf("%d\n", array[i]);
 
    }