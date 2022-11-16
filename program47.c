#include<stdio.h>
#include<stdlib.h>

////////////////////////////////////////////////////////////////
//////////////////////////////////////
//
//Function Name:     Display
//Description  :     Display the Array Elements
//Input        :     Array Elements
//Output       :     Array Elements
//Date         :     29/04/2022
//Author       :     Pankaj Vishnu Dagade
//
////////////////////////////////////////////////////////////////
//////////////////////////////////////

void Display(int Arr[], int iLength)
{
    int iCnt = 0;
    
    printf("Elements are : \n");
    for(iCnt = 0 ; iCnt < iLength ; iCnt++)
    {
         printf("%d\n",Arr[iCnt]);
    }
}
////////////////////////////////////////////////////////////////
int main()
{
    int *ptr = NULL;
    auto int iSize = 0 , iCnt = 0;

    printf("Enter the number of Elements : \n");
    scanf("%d",&iSize);

    ptr = (int *)malloc(iSize * sizeof(int));

    printf("Enter the Elements : \n");
    for(iCnt = 0 ; iCnt < iSize ; iCnt++)
    {
        scanf("%d",&ptr[iCnt]);
    }

    Display(ptr,iSize);
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
//        10
//        20
//
////////////////////////////////////////////////////////////////
