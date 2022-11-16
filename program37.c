#include<stdio.h>

////////////////////////////////////////////////////////////////
//////////////////////////////////////
//
//Function Name:     DisplayEven
//Description  :     DisplayEven from whole number
//Input        :     12345
//Output       :     6
//Date         :     29/04/2022
//Author       :     Pankaj Vishnu Dagade
//
////////////////////////////////////////////////////////////////
//////////////////////////////////////

int SumEven(int iNo)
{
    int iDigit = 0;
    int iSum = 0;
    if(iNo < 0)
    {
        iNo = -iNo;
    }
	
    while(iNo > 0)
    {
        iDigit = iNo % 10;
        if((iDigit % 2) == 0)
        {
            iSum = iSum + iDigit;
        }
        iNo = iNo/10;
    }
    return iSum;
}
////////////////////////////////////////////////////////////////
int main()
{
    int iValue = 0;
    int iRet = 0;
	
    printf("Enter number : ");
    scanf("%d",&iValue);

    iRet = SumEven(iValue);

    printf("Summation of even digits are : %d\n",iRet);
    return 0;
}

////////////////////////////////////////////////////////////////
//
//Input - Enter number : 12345
//Output - Summation of even digits are : 6
//        
////////////////////////////////////////////////////////////////
