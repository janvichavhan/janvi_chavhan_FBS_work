//Accept array and print only prime numbers of array. hard code
#include<stdio.h>
int isprime(int num){
	if(num<=1)
	return 0;
	for(int i=2;i<=num/2;i++){
		if (num %i==0)
		return 0;
	}
	return 1;
}
void main() {
    int arr[8] = {5, 12, 7, 25, 30, 18, 11, 19};
    printf("Prime numbers in array: ");
    for (int i = 0; i<8; i++) {
        if (isprime(arr[i])) {
            printf("%d ", arr[i]);
        }
    }
}