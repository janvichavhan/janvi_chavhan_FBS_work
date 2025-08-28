#include <stdio.h>
#include <string.h>
void main() {
    char str[20] = "Hello World";
    memset(str, '#', 7);   
    printf("%s\n", str);
}
