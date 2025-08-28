#include <stdio.h>
#include <string.h>
void main() {
    char str[] = "siya";
    char set[] = "aeiou";   
    char *ptr;
    ptr = strpbrk(str, set);
    if (ptr != NULL) {
        printf("First matching character: %c\n", *ptr);
        printf("String from that point: %s\n", ptr);
    } else {
        printf("No matching character found\n");
    }

    
}
