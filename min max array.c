// Find minimum and maximum number in array.
#include<stdio.h>
void main(){
	int arr[7]={25,10,56,89,4,99,15};
	int min=arr[0];
	int max=arr[0];
	for(int i=1;i<7;i++){
		if(arr[i]<min){
			min=arr[i];
		}
		if(arr[i]>max){
			max=arr[i];
		}
	}
	printf("min=%d\n",min);
	printf("max=%d\n",max);
}
