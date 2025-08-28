//Merge two arrays using funation.
#include <stdio.h>
void mergeArrays(int a[], int n1, int b[], int n2, int c[]);
void  main() {
    int a[5] = {10, 20, 30, 40, 50};  
    int b[3] = {60, 70, 80};           
    int c[8];                          
    int n1 = 5, n2 = 3;
    mergeArrays(a, n1, b, n2, c);//call
    printf("Merged array = ");
    for (int i = 0; i < n1 + n2; i++) {
        printf("%d ", c[i]);
    
}
}
void mergeArrays(int a[], int n1, int b[], int n2, int c[]) {
    int i, j;
    for (i = 0; i < n1; i++) {
    c[i] = a[i];
    }
    for (j = 0; j < n2; j++) {
	 c[i] = b[j];
        i++;
    }
}
