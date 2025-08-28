//Write a program to check the string is palindrome or not.
#include<stdio.h>
#include<string.h>
 void main(){
 	char str[100];
 	int length,i;
 	int flag=1;
 	printf("enter the string ");
 	scanf("%s",str);
 	length=strlen(str);
 	length=length-1;
 	i=0;
 	while(length>i){
 		if (str[length]!=str[i]){
 			flag=0;
 			break;
		 }
		 length--;
		 i++;
	 } 
	 if(flag)
 	printf("%s is palindrome",str);
 	else 
 	printf("%s is not palindrome",str);
 }