//Print alternate elements in array.
#include<stdio.h>
void main (){
	int arr[7]={10,20,30,40,50,60,70};
	printf("alternate elements in array: ");
	for (int i=0;i<7;i=i+2)
		printf("%d\n",arr[i]);
}