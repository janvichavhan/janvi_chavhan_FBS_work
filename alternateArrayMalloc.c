#include <stdio.h>
#include <stdlib.h>
void main() {
    int n = 7;   // size of array
    int *arr;
    int i;
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
    arr[5] = 60;
    arr[6] = 70;
    printf("Alternate elements in array:\n");
    for (i = 0; i < n; i = i + 2) {
        printf("%d\n", arr[i]);
    }

    free(arr);
}
