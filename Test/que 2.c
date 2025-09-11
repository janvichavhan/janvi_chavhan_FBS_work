//que= Write a program to accept string from user and replace one character from special symbol.
#include <stdio.h>
#include <string.h>
void main() {
    char str[20]; 
    printf("enter the string=");
    scanf("%s",str);
    
    str[2]='#';
    printf("New string=%s\n",str);
}
