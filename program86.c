// Input :  4
// Output :        -4   -3  -2  -1  0   1   2   3   4

#include<stdio.h>

void Display(int iNo)   // 3
{
       int iCnt =0;
        //          1               2               3
       for(iCnt = -iNo; iCnt <= iNo; iCnt++)
       {
            printf("%d\t",iCnt);        // 4
       }
}

int main()
{
    int iValue =0;

    printf("Please enter the value :\n");
    scanf("%d",&iValue);

    Display(iValue);    // Display(3)

    return 0;
}
