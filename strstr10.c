#include <stdio.h>
#include <string.h>
void main() {
    char str[] = "Hello Firstbit solution";
    char sub[] = "t";
    char *ptr;
    ptr = strstr(str, sub);
    if (ptr != NULL) {
        printf("Substring found: %s\n", ptr);
    } else {
        printf("Substring not found\n");
    }


}
