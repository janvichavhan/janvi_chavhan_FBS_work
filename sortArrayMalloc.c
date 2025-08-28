#include <stdio.h>
#include <stdlib.h>
void main() {
    int n = 5;
    int *arr;
    int i, j, temp;
    arr = (int *)malloc(n * sizeof(int));
    if (arr == NULL) {
        printf("Memory not allocated!\n");
        return 1;
    }
    arr[0] = 50;
    arr[1] = 10;
    arr[2] = 90;
    arr[3] = 40;
    arr[4] = 20;
    for (i = 0; i < n - 1; i++) {
        for (j = 0; j < n - 1 - i; j++) {
            if (arr[j] > arr[j + 1]) {
                temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }

    printf("Sort array = ");
    for (i = 0; i < n; i++) {
        printf("%d ", arr[i]);
    }

    free(arr);

}
