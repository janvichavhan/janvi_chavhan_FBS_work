//  Find odd and even among the numbers.
#include<stdio.h>
void main(){
	int arr[6]={5,12,7,25,30,18};
	for(int i=0;i<6;i++){
	if (arr[i]%2==0){
		printf("even num %d\n",arr[i]);
	}
}
for(int i=0;i<6;i++){
	if(arr[i]%2!=0){
		printf("odd num %d\n",arr[i]);
}
	}
}