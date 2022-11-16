// Input :  5
// Output :     5   *   4   *   3   *   2   *   1   *
// Complexity O(N)

#include<stdio.h>

void Display(int iNo)
{
    int iCnt = 0;

    for(iCnt = iNo; iCnt >= 1; iCnt--)
    {
        printf("%d\t*\t",iCnt);
    }
}

int main()
{
    int iValue =0;

    printf("Please enter the value :\n");
    scanf("%d",&iValue);

    Display(iValue);

    return 0;
}
