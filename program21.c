#include<stdio.h>

////////////////////////////////////////////////////////////////
//////////////////////////////////////
//
//Function Name:     SumFactors
//Description  :     Accept number from user and display its SumFactors
//Input        :     --
//Output       :     --
//Date         :     29/04/2022
//Author       :     Pankaj Vishnu Dagade
//
////////////////////////////////////////////////////////////////
//////////////////////////////////////

int SumFactors(int iNo)
{
    int iCnt = 0;
    int iSum = 0;
    if(iNo < 0)
    {
        iNo = -iNo;
    }

    for(iCnt = 1; iCnt <= (iNo /2); iCnt++)
    {
        if((iNo % iCnt) == 0)
        {
              iSum =  iSum + iCnt;
        }
    }
    return iSum;
}

int main()
{
    int iValue = 0;
    int iRet = 0;

    printf("Enter number : ");
    scanf("%d",&iValue);

    iRet = SumFactors(iValue);
    printf("Sum of factors : %d\n",iRet);
    return 0;
}

////////////////////////////////////////////////////////////////
//
//Input - Enter number : 10
//Output -  Sum of factors : 8 
//
//Input - Enter number : 9             
//Output - Sum of factors : 4
//
////////////////////////////////////////////////////////////////
