#include <stdio.h>

int main() {
    int s1 = 80, s2 = 75, s3 = 90, s4 = 85, s5 = 70;  
    int total;
    float percentage;

    total = s1 + s2 + s3 + s4 + s5;
    percentage = (total / 500.0) * 100;

    printf("Total Marks = %d\n Percentage = %.2f%\n", total, percentage);

    return 0;
}
