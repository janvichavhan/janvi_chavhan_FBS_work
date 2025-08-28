#include<stdio.h>
#include<string.h>
void mystrrev(char str[]) {
    int i = 0, j = 0;
    char temp;
    while (str[j] != '\0') {
        j++;
    }
    j--;
    while (i < j) {
        temp = str[i];
        str[i] = str[j];
        str[j] = temp;
        i++;
        j--;
    }
}
void main() {
    char str1[100] = "Instrumentation Enginerring";
    mystrrev(str1);
    printf("Reversed String: %s\n", str1);
}
