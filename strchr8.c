#include <stdio.h>
#include <string.h>
void main() {
    char str[] = "Hello,Janvi";
    char *ptr;
    ptr = strchr(str, ',');

    if (ptr != NULL) {
        printf("Char found at: %s\n", ptr);
    } else {
        printf("Char not found\n");
    }


}
