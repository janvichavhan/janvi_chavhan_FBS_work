//Find odd and even among the numbers using function.
#include <stdio.h>
void findOddEven(int arr[], int size);// Function Declaration
void main() {
    int arr[6] = {5, 12, 7, 25, 30, 18};
    int size = 6;
    findOddEven(arr, size); // Function Call
}
void findOddEven(int arr[], int size) {// Function Definition
    printf("Even numbers:\n");
    for (int i = 0; i < size; i++) {
        if (arr[i] % 2 == 0) {
            printf("%d\n", arr[i]);
        }
	 }
    printf("Odd numbers:\n");
    for (int i = 0; i < size; i++) {
        if (arr[i] % 2 != 0) {
            printf("%d\n", arr[i]);
        }
    }
}
