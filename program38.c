#include<stdio.h>

////////////////////////////////////////////////////////////////
//////////////////////////////////////
//
//Function Name:     Reverse
//Description  :     Reverse number from whole number
//Input        :     123456
//Output       :     654321
//Date         :     29/04/2022
//Author       :     Pankaj Vishnu Dagade
//
////////////////////////////////////////////////////////////////
//////////////////////////////////////

int Reverse(int iNo)
{
    int iDigit = 0;
    int iRev = 0;

    while(iNo > 0)
    {
        iDigit = iNo % 10;
        iRev = iRev * 10 + iDigit;
        iNo = iNo / 10;
    }

   return iRev;
}
////////////////////////////////////////////////////////////////
int main()
{
    int iValue = 0;
    int iRet = 0;
    printf("Enter number : ");
    scanf("%d",&iValue);

    iRet = Reverse(iValue); // Reverse(7562)

    printf("Reverse number is : %d\n",iRet);

    return 0;
}

////////////////////////////////////////////////////////////////
//
//Input - Enter number : 123456
//Output - Reverse number is: 654321
//
////////////////////////////////////////////////////////////////
