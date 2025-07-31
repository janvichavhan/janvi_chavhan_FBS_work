void main (){
	int no=153;
	int temp=no;
	int rem,sum=0;
	while(no>0){
		rem=no%10;
		sum=sum+rem*rem*rem;
		no=no/10;
	}
	if (temp==sum){
		printf("Armstrong");
	}
	else{
		printf("not Armstrong");
	}
}

