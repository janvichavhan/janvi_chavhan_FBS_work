// Find sum of all numbers.
#include<stdio.h>
void main(){
	int arr[6]={5,12,7,25,30,18};
	int sum=0;
	for(int i=0;i<6;i++){
		sum=sum+arr[i];
	}
	printf("sum of all num=%d\n",sum);
}