#include<stdio.h>

////////////////////////////////////////////////////////////////
//////////////////////////////////////
//
//Function Name:     CountDigits
//Description  :     CountDigits from whole number
//Input        :     12345
//Output       :     5
//Date         :     29/04/2022
//Author       :     Pankaj Vishnu Dagade
//
////////////////////////////////////////////////////////////////
//////////////////////////////////////

int CountDigits(int iNo)
{
    int iDigit = 0;
    int iCnt = 0;
    if(iNo < 0)
    {
        iNo = -iNo;
    }
    while(iNo > 0)
    {
        iDigit = iNo % 10;
        iCnt++;
        iNo = iNo /10;
    }
    return iCnt;
}
////////////////////////////////////////////////////////////////
int main()
{
    int iValue = 0;
    int iRet = 0;
    printf("Enter number\n");
    scanf("%d",&iValue);

    iRet = CountDigits(iValue);

    printf("Number of digits are : %d\n",iRet);
  
    return 0;
}

////////////////////////////////////////////////////////////////
//
//Input - Enter number : 12345
//Output - Number of digits are : 5
//
///////////////////////////////////////////////////////////////
