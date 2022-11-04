#include<stdio.h>

////////////////////////////////////////////////////////////////
//////////////////////////////////////
//
//Function Name:     SumDigits
//Description  :     SumDigits from whole number
//Input        :     12345
//Output       :     5
//Date         :     29/04/2022
//Author       :     Pankaj Vishnu Dagade
//
////////////////////////////////////////////////////////////////
//////////////////////////////////////

int SumDigits(int iNo)
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
        iSum = iSum + iDigit;
        iNo = iNo /10;
    }
    return iSum;
}
////////////////////////////////////////////////////////////////
int main()
{
    int iValue = 0;
    int iRet = 0;
    printf("Enter number\n");
    scanf("%d",&iValue);

    iRet = SumDigits(iValue);

    printf("Summation of digits are : %d\n",iRet);
    return 0;
}

////////////////////////////////////////////////////////////////
//
//Input - Enter number : 12345
//Output - Summation of digits are : 15
//
////////////////////////////////////////////////////////////////
