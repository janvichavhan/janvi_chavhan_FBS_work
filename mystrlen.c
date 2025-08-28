#include <stdio.h>
#include<string.h>
int mystrlen(char str[]) {
    int i = 0;
    while (str[i] != '\0') {  
        i++;
    }
    return i;   
}
void  main() {
    char str1[100] = "Instrumentation";
    int length = mystrlen(str1);
   printf("String: %s\n", str1);
    printf("Length string = %d\n", length);
}
