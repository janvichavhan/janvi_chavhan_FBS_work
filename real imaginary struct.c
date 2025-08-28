//Complex (real, imaginary) using structure.
#include <stdio.h>
struct Complex {
    float real;
    float imaginary;
};
void main() {
    struct Complex c1, c2;
    c1.real = 3.5;
    c1.imaginary = 2.5;
    
    printf("Enter second complex number (real imaginary): ");
    scanf("%f %f", &c2.real, &c2.imaginary);

    printf("%.2f + %.2fi\n", c1.real, c1.imaginary);

    printf("%.2f + %.2fi\n", c2.real, c2.imaginary);

}
