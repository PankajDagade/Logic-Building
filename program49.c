#include<stdio.h>
#include<stdlib.h>

////////////////////////////////////////////////////////////////
//////////////////////////////////////
//
//Function Name:     CountEven
//Description  :     Display Count Even Array Elements
//Input        :     Array Elements
//Output       :     CountEven Array Elements
//Date         :     29/04/2022
//Author       :     Pankaj Vishnu Dagade
//
////////////////////////////////////////////////////////////////
//////////////////////////////////////

int CountEven(int Arr[], int iLength)
{
    register int iCnt = 0;
    int iCountEven = 0;

    for(iCnt = 0 ; iCnt < iLength ; iCnt++)
    {
        if((Arr[iCnt] % 2) == 0)
        {
            iCountEven++;
        }
    }
    return iCountEven;
}
////////////////////////////////////////////////////////////////
int main()
{
    int *ptr = NULL;
    auto int iSize = 0, iCnt = 0;
    int iRet = 0;

    printf("Enter the size of Elements : ");
    scanf("%d",&iSize);

    ptr = (int *)malloc(iSize * sizeof(int));

    printf("Enter the Elements : \n");
    for(iCnt = 0 ; iCnt < iSize ; iCnt++)
    {
        scanf("%d",&ptr[iCnt]);
    }

    iRet = CountEven(ptr, iSize);

    printf("Number of even Elements are : %d\n",iRet);
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
//Output -Number of even Elements are : 2
//        
////////////////////////////////////////////////////////////////
