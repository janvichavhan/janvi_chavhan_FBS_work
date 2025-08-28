//Sort the array.
#include<stdio.h>
void main(){
int arr[5]={50,10,90,40,20};
int i,j,temp;
for(i=0;i<5-1;i++){
for(j=0;j<5-1-i;j++){
if(arr[j]>arr[j+1]){
temp=arr[j];
arr[j]=arr[j+1];
arr[j+1]=temp;
}
}
}
printf("sorting array=");
for(i=0;i<5;i++){
printf("%d\n",arr[i]);
}
}
