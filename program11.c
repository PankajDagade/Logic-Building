#include<stdio.h>

void Display(int iNo)
{
    if(iNo < 0)
    {
        iNo = -iNo;
    }
    
    int iCnt = 0;
    for(iCnt = 1 ; iCnt <= iNo ; iCnt++)
    {
        printf("%d\t",iCnt);
    }
}
int main(){

    auto int iValue = 0;

    printf("Enter the nummber : ");
    scanf("%d",&iValue);

    Display(iValue);
    return 0;
}
