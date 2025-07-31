void main (){
	int num=19;
	if (num%3==0 && num%5==0){
	printf("divisible by both");
}
else if (num%3==0){
printf("divisible by 3 but not by 5");
}
else if ( num%5==0){
	printf("divisible by 5 but not by 3");
}
else
 printf("divisible by none");
}
