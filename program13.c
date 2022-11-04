#include<stdio.h>

////////////////////////////////////////////////////////////////
//////////////////////////////////////
//
//Function Name:     Summation
//Description  :     Summation of N numbers
//Input        :     5(any decimal number)
//Output       :     1+2+3+4+5 = 15
//Date         :     29/04/2022
//Author       :     Pankaj Vishnu Dagade
//
////////////////////////////////////////////////////////////////
//////////////////////////////////////

int Summation(int iNo)
{
    int iCnt = 0;
    int iSum = 0;

    for(iCnt = 1 ; iCnt <= iNo ; iCnt++)
    {
        iSum = iSum + iCnt;
    }
    return iSum;
}

int main()
{
    auto int iValue = 0;
    auto int iRet = 0;

    printf("Enter the number : ");
    scanf("%d",&iValue);

    iRet = Summation(iValue);

    printf("%d\n",iRet);

    return 0;
}

////////////////////////////////////////////////////////////////
//Input - 5
//            
//Output - 15 (1+2+3+4+5)
////////////////////////////////////////////////////////////////
