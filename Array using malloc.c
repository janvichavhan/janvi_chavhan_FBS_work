#include <stdio.h>
#include <stdlib.h>
void main() {
    int n = 5;   
    int *arr;
    int sum = 0;
    arr = (int *)malloc(n * sizeof(int));
    if (arr == NULL) {
        printf("Memory not allocated!\n");
        return 1;
    }
    arr[0] = 10;
    arr[1] = 20;
    arr[2] = 30;
    arr[3] = 40;
    arr[4] = 50;
    for (int i = 0; i < n; i++) {
        sum = sum+arr[i];
    }
    printf("Sum of elements = %d\n", sum);
    free(arr);
}
