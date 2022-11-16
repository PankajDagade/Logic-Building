#include<stdio.h>
#include<stdlib.h>

////////////////////////////////////////////////////////////////
//////////////////////////////////////
//
//Function Name:     DisplayEven
//Description  :     Display Even Array Elements
//Input        :     Array Elements
//Output       :     Even Array Elements
//Date         :     29/04/2022
//Author       :     Pankaj Vishnu Dagade
//
////////////////////////////////////////////////////////////////
//////////////////////////////////////

void DisplayEven(int Arr[], int iLength)
{
    register int iCnt = 0;
    
    printf("Even number are : ");
    for(iCnt = 0 ; iCnt < iLength ; iCnt++)
    {
        if((Arr[iCnt] % 2) == 0)
        {
            printf("%d\t",Arr[iCnt]);
        }
    }
}
////////////////////////////////////////////////////////////////
int main()
{
    auto int *ptr = NULL;
    auto int iSize = 0 , iCnt = 0;
   
    printf("Enter the number of Elements : ");
    scanf("%d",&iSize);

    ptr = (int *)malloc(iSize * sizeof(int));

    printf("Enter the ELements : \n");
    for(iCnt = 0 ; iCnt < iSize ; iCnt++)
    {
        scanf("%d",&ptr[iCnt]);
    }

    DisplayEven(ptr, iSize);
    free(ptr);
    return 0;
}

////////////////////////////////////////////////////////////////
//
//Input - Enter the number of Elements :
//         2
//        Enter the Elements :
//        10
//        20
//Output -Elements are :
//        10  20
//        
////////////////////////////////////////////////////////////////
