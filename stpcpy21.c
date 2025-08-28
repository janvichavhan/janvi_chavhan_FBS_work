#include <stdio.h>
#include <string.h>
void main() {
    char src[] = "Hello";
    char dest[20];
    char *end =stpcpy(dest, src);
    printf("Copied string: %s\n", dest);
    if (*end == '\0') {
        printf("Pointer returned by stpcpy() is at the null terminator '\\0'\n");
    }
}
