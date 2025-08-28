#include <stdio.h>
#include <stdlib.h>
void main() {
    int n = 6;  
    int *arr;
    arr = (int *)malloc(n * sizeof(int));
    if (arr == NULL) {
        printf("Memory not allocated!\n");
        return 1;
    }
    arr[0] = 11;
    arr[1] = 24;
    arr[2] = 37;
    arr[3] = 40;
    arr[4] = 55;
    arr[5] = 68;
    printf("Even numbers: ");
    for (int i = 0; i < n; i++) {
        if (arr[i] % 2 == 0) {
            printf("%d ", arr[i]);
        }
    }
    printf("\nOdd numbers: ");
    for (int i = 0; i < n; i++) {
        if (arr[i] % 2 != 0) {
            printf("%d ", arr[i]);
        }
    }
    free(arr);
}
