//que= Write a program to printf sum of prime numbers in a given range.
#include <stdio.h>
void main() {
    int start, end;
    int i, j, sum = 0, isPrime;

    printf("Enter the start number: ");
    scanf("%d", &start);

    printf("Enter the end number: ");
    scanf("%d", &end);

    for (i = start; i <= end; i++) {
        if (i > 1) { 
        isPrime = 1; 
    for (j = 2; j <= i / 2; j++) {
         if (i % j == 0) {
        isPrime = 0;  
        break;
        }
    }

   if (isPrime == 1) {
       sum += i; 
    }
	  }
    }
    printf("Sum of prime numbers between %d and %d = %d\n", start, end, sum);
}