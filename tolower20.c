#include <stdio.h>
#include <ctype.h>
void main() {
    char ch = 'J';
    char result = tolower(ch);
    printf("Original: %c\n", ch);
    printf("Lowercase: %c\n", result);
}
