#include<stdio.h>
#include<stdbool.h>

void DisplayF(int iNo)
{
    int iCnt = 0;
    
    for(iCnt = 1; iCnt<= iNo; iCnt++)
    {
        printf("%d\n",iCnt);        
    }
}

void DisplayB(int iNo)
{
    int iCnt = 0;
                                       
    for(iCnt = iNo; iCnt>= 1; iCnt--)
    {
        printf("%d\n",iCnt);        
    }
}

int main()
{
    int iValue = 0;

    printf("Enter number\n");
    scanf("%d",&iValue);
    
    printf("Forward Display\n");
    DisplayF(iValue);
    
    printf("Backard Display\n");
    DisplayB(iValue);
    
    return 0;
}
