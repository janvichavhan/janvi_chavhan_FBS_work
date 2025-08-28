#include <stdio.h>
#include <string.h>
void main() {
    char s1[] = "apple";
    char s2[] = "aprlet";
    int res = strncmp(s1, s2, 2);

    if (res == 0) {
        printf("First 2 characters are equal\n");
    } else if (res < 0) {
        printf("s1 is smaller than s2 in first 2 char\n");
    } else {
        printf("s1 is greater than s2 in first 2 char\n");
    }

}
