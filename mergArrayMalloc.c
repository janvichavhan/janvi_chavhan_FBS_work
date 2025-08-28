#include <stdio.h>
#include <stdlib.h>
void main() {
    int n1 = 5, n2 = 3;  
    int *a, *b, *c;
    int i, j;
    a = (int *)malloc(n1 * sizeof(int));
    b = (int *)malloc(n2 * sizeof(int));
    c = (int *)malloc((n1 + n2) * sizeof(int));
    if (a == NULL || b == NULL || c == NULL) {
        printf("Memory not allocated!\n");
        return 1;
    }
    a[0] = 10; a[1] = 20; a[2] = 30; a[3] = 40; a[4] = 50;
    b[0] = 60; b[1] = 70; b[2] = 80;
    for (i = 0; i < n1; i++) {
        c[i] = a[i];
    }
    for (j = 0; j < n2; j++) {
        c[i] = b[j];
        i++;
    }
    printf("Merged array = ");
    for (i = 0; i < n1 + n2; i++) {
        printf("%d ", c[i]);
    }
    free(a);
    free(b);
    free(c);
}
