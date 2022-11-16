#include<stdio.h>
#include<stdlib.h>

////////////////////////////////////////////////////////////////
//////////////////////////////////////
//
//Function Name:     Maximum
//Description  :     Display Maximum number from Array Elements
//Input        :     Array Elements
//Output       :     Maximum Array Elements
//Date         :     29/04/2022
//Author       :     Pankaj Vishnu Dagade
//
////////////////////////////////////////////////////////////////
//////////////////////////////////////

int Maximum(int Arr[], int iLength)
{
    int iMax = Arr[0];
    register int iCnt = 0;

    for(iCnt = 0 ; iCnt < iLength ; iCnt++)
    {
        if(iMax < Arr[iCnt] )
        {
            iMax = Arr[iCnt];
        }
    }
    return iMax;
}
///////////////////////////////////////////////////////////////
int main()
{
    auto int *ptr = NULL;
    auto int iSize = 0 , iCnt = 0 , iRet = 0;

    printf("Enter the number of Elements : ");
    scanf("%d",&iSize);

    ptr = (int *)malloc(iSize * sizeof(int));

    printf("Enter the Elements : \n");
    for(iCnt = 0 ; iCnt < iSize ; iCnt++)
    {
        scanf("%d",&ptr[iCnt]);
    }

    iRet = Maximum(ptr, iSize);
    
    printf("Maximum number is : %d",iRet);

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
//Output -Maximum number is : 20
//        
////////////////////////////////////////////////////////////////
