#include <stdio.h>
#include <stdlib.h>
void main() {
    int n = 5;  
    int *arr, *brr, *crr;
    arr = (int *)malloc(n * sizeof(int));
    brr = (int *)malloc(n * sizeof(int));
    crr = (int *)malloc(n * sizeof(int));
    if (arr == NULL || brr == NULL || crr == NULL) {
        printf("Memory not allocated!\n");
        return 1;
    }
    arr[0] = 1;  arr[1] = 2;  arr[2] = 3;  arr[3] = 4;  arr[4] = 5;
    brr[0] = 10; brr[1] = 20; brr[2] = 30; brr[3] = 40; brr[4] = 50;

    for (int i = 0; i < n; i++) {
        crr[i] = arr[i] + brr[i];
    }

    printf("arr: ");
    for (int i = 0; i < n; i++) {
        printf("%d ", arr[i]);
    }

    printf("\nbrr: ");
    for (int i = 0; i < n; i++) {
        printf("%d ", brr[i]);
    }

    printf("\ncrr (sum): ");
    for (int i = 0; i < n; i++) {
        printf("%d ", crr[i]);
    }

    free(arr);
    free(brr);
    free(crr);

}
