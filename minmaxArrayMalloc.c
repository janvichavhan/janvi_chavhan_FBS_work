#include <stdio.h>
#include <stdlib.h>
void main() {
    int n = 7;   
    int *arr;
    int i, min, max;
    arr = (int *)malloc(n * sizeof(int));
    if (arr == NULL) {
        printf("Memory not allocated!\n");
        return 1;
    }
    arr[0] = 25;
    arr[1] = 10;
    arr[2] = 56;
    arr[3] = 89;
    arr[4] = 4;
    arr[5] = 99;
    arr[6] = 15;
    min = arr[0];
    max = arr[0];
    for (i = 1; i < n; i++) {
        if (arr[i] < min) {
            min = arr[i];
        }
        if (arr[i] > max) {
            max = arr[i];
        }
    }
    printf("Minimum = %d\n", min);
    printf("Maximum = %d\n", max);
    free(arr);
}
