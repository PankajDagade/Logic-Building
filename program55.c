#include<stdio.h>
#include<stdlib.h>

////////////////////////////////////////////////////////////////
//////////////////////////////////////
//
//Function Name:     Searching
//Description  :     Display Searching number from Array Elements
//Input        :     ---
//Output       :     ---
//Date         :     29/04/2022
//Author       :     Pankaj Vishnu Dagade
//
////////////////////////////////////////////////////////////////
//////////////////////////////////////


int Searching(int Arr[], int iLength , int iNo)
{
    int iCnt = 0;

    for(iCnt = 0 ; iCnt < iLength ; iCnt++)
    {
        if(Arr[iCnt] == iNo)
        {
            break;
        }
    }
    if(iCnt == iLength)
    {
        return -1;
    }
    else
    {
        return iCnt;
    }

}
////////////////////////////////////////////////////////////////
int main()
{
    auto int *ptr = NULL;
    auto int iSize = 0, iCnt = 0, iValue = 0 , iRet = 0;

    printf("Enter the number of Elements :");
    scanf("%d",&iSize);

    ptr = (int *)malloc(iSize * sizeof(int));

    printf("Enter the Elements : \n");
    for(iCnt = 0 ; iCnt < iSize ; iCnt++)
    {
        scanf("%d",&ptr[iCnt]);
    }

    printf("Enter the number that you want to search :");
    scanf("%d",&iValue);

    iRet = Searching(ptr,iSize,iValue);

    if(iRet == -1)
    {
        printf("There is no such Element in Array");
    }
    else
    {
        printf("Element first occured at : %d ",iRet);
    }
    return 0;
}

////////////////////////////////////////////////////////////////
//
//Input - Enter the number of Elements :
//         2
//        Enter the Elements :
//        10
//        20
//       Enter the number that you want to search :10
//Output -Element first occured at : 0
//        
////////////////////////////////////////////////////////////////
