#include<stdio.h>

////////////////////////////////////////////////////////////////
//////////////////////////////////////
//
//Function Name:     DisplayDigits
//Description  :     Seperate digits from whole number
//Input        :     --
//Output       :     --
//Date         :     29/04/2022
//Author       :     Pankaj Vishnu Dagade
//
////////////////////////////////////////////////////////////////
//////////////////////////////////////

void DisplayDigits(int iNo)
{
    int iDigit = 0;
    if(iNo < 0)
    {
        iNo = -iNo;
    }
    while(iNo != 0)
    {
        iDigit = iNo % 10;
        printf("%d",iDigit);
        iNo = iNo /10;
    }
}
///////////////////////////////////////////////////////////////
int main()
{
    int iValue = 0;

    printf("Enter number\n");
    scanf("%d",&iValue);

    DisplayDigits(iValue);

    return 0;
}

////////////////////////////////////////////////////////////////
//
//Input - Enter number : 6587
//Output - 7
           8
           5
           6
//
////////////////////////////////////////////////////////////////
