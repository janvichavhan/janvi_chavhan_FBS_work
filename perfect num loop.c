void main (){
	int n=28;
	int i=1;
	int sum=0;
	while(i<28){
		if (n%1==0){
			sum=sum+i;
		}
		i++;
	}
	if (sum==n){
		printf("perfect");
	}
	else{
		printf("not perfect");
	}
}
