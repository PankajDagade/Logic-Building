#include<stdio.h>

////////////////////////////////////////////////////////////////
//////////////////////////////////////
//
//Function Name:     DisplayEven
//Description  :     DisplayEven from whole number
//Input        :     12345
//Output       :     5
//Date         :     29/04/2022
//Author       :     Pankaj Vishnu Dagade
//
////////////////////////////////////////////////////////////////
//////////////////////////////////////

void DisplayEven(int iNo)
{
    int iDigit = 0;

    if(iNo < 0)
    {
        iNo = -iNo;
    }
	printf("Even number are : ");
    while(iNo > 0)
    {
        iDigit = iNo % 10;
        if((iDigit % 2) == 0)
        {
            printf("%d ",iDigit);
        }
        iNo = iNo /10;
    }
}
////////////////////////////////////////////////////////////////
int main()
{
    int iValue = 0;
    int iRet = 0;
    printf("Enter number : ");
    scanf("%d",&iValue);

    DisplayEven(iValue);

    return 0;
}

////////////////////////////////////////////////////////////////
//
//Input - Enter number : 12345678
//Output - 8
//         6
//         4
//         2
//
////////////////////////////////////////////////////////////////
