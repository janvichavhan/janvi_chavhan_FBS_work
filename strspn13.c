#include <stdio.h>
#include <string.h>
void main() {
    char str[] = "123456janvi";
    char accept[] = "0123456789"; 
    int len;
    len = strspn(str, accept);
    printf("Length of initial segment with only digits: %d\n", len);
}
