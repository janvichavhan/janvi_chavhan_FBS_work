#include <stdio.h>
#include <string.h>
void main() {
    char str[20] = "Hello Janvi";
    memmove(str + 6, str, 5);   
    str[11] = '\0';             
    printf("%s\n", str);
}
