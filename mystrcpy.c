#include <stdio.h>
#include<string.h>
void mystrcpy(char dest[], char src[]) {
    int i = 0;
    while (src[i] != '\0') {  
        dest[i] = src[i];
        i++;
    }
    dest[i] = '\0';   
}
void main() {
    char str1[100] = "Hello,Janvi Chavhan!";
    char str2[100];
    mystrcpy(str2, str1);   
    printf("Source String: %s\n", str1);
    printf("Copied String: %s\n", str2);
}
