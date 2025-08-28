//Print alternate elements in array using function.
#include <stdio.h>
void printAlternate(int arr[], int size);// Function Declaration
void main() {
    int arr[7] = {10, 20, 30, 40, 50, 60, 70};
    int size = 7;
    printf("Alternate elements in array:\n");
    printAlternate(arr, size);// fun call
}
void printAlternate(int arr[], int size) {// Function Definition
    for (int i = 0; i < size; i = i + 2) {
        printf("%d\n", arr[i]);
    }
}
