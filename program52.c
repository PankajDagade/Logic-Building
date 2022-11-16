#include<stdio.h>
#include<stdlib.h>

////////////////////////////////////////////////////////////////
//////////////////////////////////////
//
//Function Name:     Minimum
//Description  :     Display Minimum number from Array Elements
//Input        :     Array Elements
//Output       :     Minimum Array Elements
//Date         :     29/04/2022
//Author       :     Pankaj Vishnu Dagade
//
////////////////////////////////////////////////////////////////
//////////////////////////////////////

int Minimum(int Arr[] , int iLength)
{
    int iCnt = 0;
    int iMin = Arr[0];

    for(iCnt = 0 ; iCnt < iLength ; iCnt++)
    {
        if(iMin > Arr[iCnt])
        {
            iMin = Arr[iCnt];
        }
    }
    return iMin;
}
////////////////////////////////////////////////////////////////
int main()
{
    auto int *ptr = NULL;
    auto int iSize = 0 , iCnt = 0 , iRet = 0;

    printf("Enter the number of Elemnets :");
    scanf("%d",&iSize);

    ptr = (int *)malloc(iSize * sizeof(int));

    printf("Enter the ELements :\n");
    for(iCnt = 0 ; iCnt < iSize ; iCnt++)
    {
        scanf("%d",&ptr[iCnt]);
    }

    iRet = Minimum(ptr , iSize);

    printf("Minimum number is : %d",iRet);
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
//Output -Minimum number is : 10
//        
////////////////////////////////////////////////////////////////
