#include<stdio.h>

int CheckEven(int iNo)
{
	if(iNo < 0){
		iNo = -iNo;
	}

	if((iNo % 2) == 0){
		return 1;
	}else{
		return 0;
	}
}

int main(){

	auto int iValue = 0;
	int bRet = 1;

	printf("Enter the numbewr : ");
	scanf("%d",&iValue);

	bRet = CheckEven(iValue);
	if(bRet == 1){
		printf("%d is a Even number",iValue);
	}else{
		printf("%d is a Odd number",iValue);
	}
	return 0;
}
