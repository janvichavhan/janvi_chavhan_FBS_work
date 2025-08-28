#include<stdio.h>
#include<string.h>
void main (){
	char s1[]="apple";
	char s2[]="apricot";
	int res=strcmp(s1,s2);
	 if (res == 0) {
        printf("Strings are equal\n");
    } else if (res < 0) {
        printf("s1 is smaller than s2\n");
    } else {
        printf("s1 is greater than s2\n");
    }

	
}