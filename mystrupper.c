#include <stdio.h>
#include<string.h>
void mystrupper(char str[]) {
    int i = 0;
    while (str[i] != '\0') {
        if (str[i] >= 'a' && str[i] <= 'z') {
            str[i] = str[i] - 32;  
        }
        i++;
    }
}
void main() {
    char str1[100] = "Instrumentation Engginerring";
    mystrupper(str1);
    printf("Uppercase String: %s\n", str1);
}
