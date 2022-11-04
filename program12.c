#include<stdio.h>

void Display(int iNo)
{
    if(iNo < 0)
    {
        iNo = -iNo;
    }

    int iCnt = 1;

    while(iCnt <= iNo)
    {
        printf("%d\n",iCnt);
        iCnt++;
    }
}
int main()
{

    auto int iValue = 0;

    printf("Enter the number : ");
    scanf("%d",&iValue);

    Display(iValue);
  
    return 0;
}
