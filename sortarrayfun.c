//Sort the array using function.
#include <stdio.h>
void sortArray(int arr[], int n);
void main() {
    int arr[5] = {50, 10, 90, 40, 20};
    int n = 5;
    sortArray(arr, n);
    printf("Sorted array = ");
    for (int i = 0; i < n; i++) {
        printf("%d ", arr[i]);
    }
}
void sortArray(int arr[], int n) {
    int i, j, temp;
    for (i = 0; i < 5 - 1; i++) {
    for (j = 0; j < 5 - 1 - i; j++) {
    if (arr[j] > arr[j + 1]) {
    temp = arr[j];
    arr[j] = arr[j + 1];
    arr[j + 1] = temp;
    }
    }
}
}
