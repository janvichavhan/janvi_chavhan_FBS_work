#include <stdio.h>
#include <string.h>

void main() {
    char str1[] = "apple";
    char str2[] = "apricot";
    int result = memcmp(str1, str2, 5); 
    if (result == 0) {
        printf("First 5 char are equal\n");
    } else if (result < 0) {
        printf("str1 is smaller than str2 in first 5 chars\n");
    } else {
        printf("str1 is greater than str2 in first 5 chars\n");
    }
    
}
