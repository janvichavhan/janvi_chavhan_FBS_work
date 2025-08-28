#include <stdio.h>
#include <string.h>
void main() {
    char str[] = "Hello,Janvi";
    char *ptr;
    ptr = strrchr(str, 'e');
    if (ptr != NULL) {
        printf("Char last found at: %s\n", ptr);
    } else {
        printf("Char not found\n");
    }


}
