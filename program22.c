#include<stdio.h>
#include<stdbool.h>

////////////////////////////////////////////////////////////////
//////////////////////////////////////
//
//Function Name:     CheckPerfect
//Description  :     Accept number from user and display SumFactors is perfect number or not
//Input        :     ...
//Output       :     ...
//Date         :     29/04/2022
//Author       :     Pankaj Vishnu Dagade
//
////////////////////////////////////////////////////////////////
//////////////////////////////////////

bool CheckPerfect(int iNo)
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

    if(iSum == iNo)
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

    bRet = CheckPerfect(iValue);
    if(bRet == true)
    {
        printf("%d is a perfect number\n",iValue);
    }
    else
    {
        printf("%d is not a perfect number\n",iValue);
    }
    return 0;
}

////////////////////////////////////////////////////////////////
//
//Input - Enter number : 6
//Output - 6 is a perfect number 
//
//Input - Enter number : 3
//Output - 3 is not a perfect number
//
////////////////////////////////////////////////////////////////
