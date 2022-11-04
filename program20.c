#include<stdio.h>

////////////////////////////////////////////////////////////////
//////////////////////////////////////
//
//Function Name:     DisplayNonFactors
//Description  :     Accept number from user and display its Nonfactors
//Input        :     10
//Output       :      1    2   5
//Date         :     29/04/2022
//Author       :     Pankaj Vishnu Dagade
//
////////////////////////////////////////////////////////////////
//////////////////////////////////////

void DisplayNonFactors(int iNo)
{
    int iCnt = 0;
    if(iNo < 0)
    {
        iNo = -iNo;
    }

    for(iCnt = 1; iCnt < iNo ; iCnt++)
    {
        if((iNo % iCnt) != 0)
        {
            printf("%d  ",iCnt);
        }
    }
}

int main()
{
    int iValue = 0;

    printf("Enter number : \n");
    scanf("%d",&iValue);

    DisplayNonFactors(iValue);
    return 0;
}

////////////////////////////////////////////////////////////////
//
//Input - 10
// 
//Output -  3  4  6  7  8  9
//
////////////////////////////////////////////////////////////////

























