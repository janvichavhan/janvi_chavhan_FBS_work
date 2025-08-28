//Distance ( feet, inch) using structure.c
#include <stdio.h>
struct Distance {
    int feet;
    int inch;
};
void main() {
    struct Distance d1, d2;
    d1.feet = 5;
    d1.inch = 153;
    printf("Enter second distance (feet inch): ");
    scanf("%d %d", &d2.feet, &d2.inch);

    printf("%d feet %d inches\n", d1.feet, d1.inch);

    printf("%d feet %d inches\n", d2.feet, d2.inch);
    
}
