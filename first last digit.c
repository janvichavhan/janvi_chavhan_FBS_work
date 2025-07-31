void main(){
	int n=12345;
	int last=n%10;
	int first=n;
	int sum=0;
	while(first>=10){
		first=first/10;
		}	
	 sum = first + last;
	printf("Sum = %d\n", sum);

}