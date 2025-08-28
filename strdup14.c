#include <stdio.h>
#include <string.h>
void main() {
    char str[] = "Hello Janvi!";
    char *copy;
    copy = strdup(str);
    printf("Original: %s\n", str);
    printf("Duplicate: %s\n", copy);
    free(copy); 
    
}
