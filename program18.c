// 1    4000
// 2    8000
// 5    20000
// 10   40000

#include<stdio.h>

////////////////////////////////////////////////////////////////
//////////////////////////////////////
//
//Function Name:     JwelersPortal
//Description  :     Display Bill Amount of JwelersPortal
//Input        :     10
//Output       :     Your bill amount is 40000
//Date         :     29/04/2022
//Author       :     Pankaj Vishnu Dagade
//
////////////////////////////////////////////////////////////////
//////////////////////////////////////

void JwelersPortal(int iWeight)
{
    switch(iWeight)
    {
        case 1:
            printf("Your bill amount is 4000\n");
            break;

        case 2:
            printf("Your bill amount is 8000\n");
            break;

        case 5:
            printf("Your bill amount is 20000\n");
            break;

        case 10:
            printf("Your bill amount is 40000\n");
            break;

        default:
            printf("Invalid weight\n");
    }
}

int main()
{
    int iValue = 0;

    printf("Enter the gold coin size that you want to purchase\n");
    scanf("%d",&iValue);

    JwelersPortal(iValue);

    return 0;
}

////////////////////////////////////////////////////////////////
//
//Input - Enter the gold coin size that you want to purchase
// 10
//Output - Your bill amount is 40000
//
////////////////////////////////////////////////////////////////
