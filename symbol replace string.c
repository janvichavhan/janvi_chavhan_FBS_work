#include <stdio.h>
#include <string.h>

void main() {
    char str[100];
    char symbol;
    int i;

    printf("Enter a string: ");
    scanf(" %[^\n]", str);   
    printf("Enter the symbol to replace spaces with: ");
    scanf(" %c", &symbol);

    for (i = 0; str[i] != '\0'; i++) {
        if (str[i] == ' ') {
            str[i] = symbol;
        }
    }

    printf("String after replacing spaces: %s\n", str);

}
