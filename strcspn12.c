#include <stdio.h>
#include <string.h>
void main() {
    char str[] = "janvi31245";
    char reject[] = "1234567890";   
    int len;
    len = strcspn(str, reject);
    printf("Length of initial segment without digits: %d\n", len);
}
