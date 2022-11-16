// Input :  5
// Output :     5   4   3   2   1

#include<stdio.h>

void Display(int iNo)
{
    int iCnt = 0;
    //          1               2           3
    for(iCnt = iNo; iCnt >= 1; iCnt--)
    {
        printf("%d\t",iCnt);        // 4
    }
}

int main()
{
    int iValue =0;

    printf("Please enter the value :\n");
    scanf("%d",&iValue);

    Display(iValue);    // Display(5);

    return 0;
}
