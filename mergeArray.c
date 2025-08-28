//merge two arrays
#include<stdio.h>
void main(){
	int a[5]={10,20,30,40,50};
	int b[3]={60,70,80};
	int c[8];
	int i,j;
	for(i=0;i<5;i++){
		c[i]=a[i];
	}
	for(j=0;j<3;j++){
		c[i]=b[j];
		i++;
	}
	printf("merge array=");
	for(i=0;i<8;i++){
		printf("%d\n",c[i]);
	}
}