#include <stdio.h>
#include <string.h>
void main() {
    char str[] = "Hello Janvi!";
    
    char *ptr = memchr(str, 'v', strlen(str));  
    if (ptr != NULL) {
        printf("Found 'v' at position: %ld\n", ptr - str);
    } else {
        printf("'v' not found\n");
    }
}
