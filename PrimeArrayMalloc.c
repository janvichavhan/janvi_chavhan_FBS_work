#include <stdio.h>
#include <stdlib.h>
int isprime(int num) {
    if (num <= 1)  
        return 0;

    for (int i = 2; i <= num / 2; i++) {
        if (num % i == 0) 
            return 0;
    }
    return 1;  
}

void main() {
    int n = 8;
    int *arr;
    int i;

    // Allocate memory dynamically
    arr = (int *)malloc(n * sizeof(int));
    if (arr == NULL) {
        printf("Memory not allocated!\n");
        return 1;
    }
    arr[0] = 5;
    arr[1] = 12;
    arr[2] = 7;
    arr[3] = 25;
    arr[4] = 30;
    arr[5] = 18;
    arr[6] = 11;
    arr[7] = 19;
    printf("Prime numbers in array: ");
    for (i = 0; i < n; i++) {
        if (isprime(arr[i])) {
            printf("%d ", arr[i]);
        }
    }
    free(arr);
}
