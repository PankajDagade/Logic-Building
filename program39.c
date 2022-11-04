#include<stdio.h>
#include<stdbool.h>

////////////////////////////////////////////////////////////////
//////////////////////////////////////
//
//Function Name:     CheckPallindrome
//Description  :     Check Pallindrome number from whole number
//Input        :     123456
//Output       :     12
//Date         :     29/04/2022
//Author       :     Pankaj Vishnu Dagade
//
////////////////////////////////////////////////////////////////
//////////////////////////////////////

bool CheckPallindrome(int iNo)
{
    int iDigit = 0;
    int iRev = 0;
    int iTemp = 0;

    if(iNo < 0)
    {
        iNo = -iNo;
    }

    iTemp = iNo;

    while(iNo > 0)
    {
        iDigit = iNo % 10;
        iRev = iRev * 10 + iDigit;
        iNo = iNo / 10;
    }
    if(iRev == iTemp)
    {
        return true;
    }
    else
    {
        return false;
    }
}
////////////////////////////////////////////////////////////////
int main()
{
    int iValue = 0;
    bool bRet;

    printf("Enter number : ");
    scanf("%d",&iValue);

    bRet = CheckPallindrome(iValue);

    if(bRet == true)
    {
        printf("%d is pallindrome number \n",iValue);
    }
    else
    {
        printf("%d is not a pallindrome number \n",iValue);
    }
    return 0;
}

////////////////////////////////////////////////////////////////
//
//Input - Enter number : 111111
//Output - 111111 is pallindrome number
//
//Input - Enter number : 111222
//Output - 111222 is not a pallindrome number
//
////////////////////////////////////////////////////////////////
