#include<stdio.h>
#include<string.h>
void main(){
	char src1[20]="Janvi,";
	char src2[]="chavhan!";
	strncat(src1,src2,5);
	printf("%s",src1);
}