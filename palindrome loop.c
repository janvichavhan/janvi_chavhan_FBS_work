void main (){
	int no=121;
	int temp=no;
	int rem,rev=0;
	while(no>0){
		rem=no%10;
	rev=rev*10+rem;
		no=no/10;
	}
	if (temp==rev){

		printf("palindrome");
	}
	else{
		printf("not palindrome");
	}
}

