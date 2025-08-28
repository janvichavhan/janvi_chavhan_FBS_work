#include <stdio.h>
#include<string.h>
int mystrcmp(char str1[], char str2[]) {
    int i = 0;
    while (str1[i] != '\0' && str2[i] != '\0') {
        if (str1[i] != str2[i]) {
            return str1[i] - str2[i];  
  }
        i++;
    }
    return str1[i] - str2[i]; 
}

void main() {
    char s1[100] = "mango";
    char s2[100] = "man";
    int result = mystrcmp(s1, s2);
    if (result == 0)
        printf("Strings are equal\n");
    else if (result > 0)
        printf("String1 is greater\n");
    else
        printf("String2 is greater\n");
}
