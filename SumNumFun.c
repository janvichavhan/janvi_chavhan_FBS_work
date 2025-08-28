//Find sum of all numbers using function.
#include<stdio.h>
int findSum(int arr[], int n);//fun decl
void main() {
    int arr[6] = {5, 12, 7, 25, 30, 18};
    int n=6;
    int sum = findSum(arr, n);//fun call
    printf("Sum of all numbers = %d\n", sum);
}
int findSum(int arr[], int n) {//fun defination
    int sum = 0;
    for (int i = 0; i < n; i++) {
        sum = sum + arr[i];
    }

    return sum;
}
