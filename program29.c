#include<stdio.h>
#include<stdbool.h>

////////////////////////////////////////////////////////////////
//////////////////////////////////////
//
//Function Name:     CountFactor
//Description  :     Count Factor
//Input        :     ...
//Output       :     ...
//Date         :     29/04/2022
//Author       :     Pankaj Vishnu Dagade
//
////////////////////////////////////////////////////////////////
//////////////////////////////////////

int CountFactor(int iNo)
{
    int iCnt = 0;
    int iFactCnt = 0;
    if(iNo < 0)
    {
        iNo = -iNo;
    }
    for(iCnt = 2; iCnt <= iNo/2; iCnt++)
    {
        if(iNo % iCnt == 0)
        {
            iFactCnt++;
        }
    }
    return iFactCnt;
}

////////////////////////////////////////////////////////////////
//////////////////////////////////////
//
//Function Name:     CheckPrime
//Description  :     check CountFactor number is prime or not
//Input        :     ...
//Output       :     ...
//Date         :     29/04/2022
//Author       :     Pankaj Vishnu Dagade
//
////////////////////////////////////////////////////////////////
//////////////////////////////////////

bool CheckPrime(int iNo)
{
    int iRet = 0;
    iRet = CountFactor(iNo);
    if(iRet == 0)
    {
        return true;
    }
    else
    {
        return false;
    }
}

int main()
{
    int iValue = 0;
    bool bRet;

    printf("Enter number\n");
    scanf("%d",&iValue);

    bRet = CheckPrime(iValue);

    if(bRet == true)
    {
        printf("%d is prime number\n",iValue);
    }
    else
    {
        printf("%d is not a prime number\n",iValue);
    }
     return 0;
}

////////////////////////////////////////////////////////////////
//
//Input - Enter number : 5
//Output - 5 is prime number
//
//Input - Enter number : 4
//Output - 4 is not a perfect number
//
////////////////////////////////////////////////////////////////
