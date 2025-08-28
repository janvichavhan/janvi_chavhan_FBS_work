//WAP to Count the Number of Vowels in a String
#include <stdio.h>
#include <string.h>
void main() {
    char str[100];
    int i, count = 0;

    printf("Enter a string: ");
    scanf(" %[^\n]", str);  
    for (i = 0; str[i] != '\0'; i++) {
        char ch = str[i];
        if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||
            ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') {
            count++;
        }
    }
    printf("Number of vowels in the string: %d\n", count);

}
