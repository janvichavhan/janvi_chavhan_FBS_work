#include<stdio.h>
#include<string.h>
void main (){
	char src[]="janviSiya";
	char dest[10];
	strncpy(dest,src,9);
	printf("%s",dest);
}