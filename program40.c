/*
    START
        Accept one number as no1
        Acccept another number as no2

        Create one variable as Mult
        Set the value 1 in the variable Mult

        Create one counter as cnt
        Set the counter to 1

        LOOP:
        Itreate till the counter is less than or equal to no2
            mult = Mult * no1
            increment the counter by 1
       Goto LOOP

        Display the value of mult
    END

    for(cnt = 1; cnt <= no2; cnt++)
    {
        mult = mult * no1;
    }
*/

#include<stdio.h>

int Power(int iNo1, int iNo2)   
{
    int iMult = 1;
    register int iCnt = 0;
               
    for(iCnt = 1; iCnt <= iNo2; iCnt++)
    {
        iMult = iMult * iNo1;       
    }
    return iMult;
}
////////////////////////////////////////////////////////////////
int main()
{
    auto int iValue1 = 0, iValue2 = 0;
    auto int iRet = 0;

    printf("Enter base :  ");
    scanf("%d",&iValue1);

    printf("Enter power :  ");
    scanf("%d",&iValue2);

    iRet = Power(iValue1, iValue2); // Power(3,4)

    printf("Result is : %d\n",iRet);

    return 0;
}

////////////////////////////////////////////////////////////////
//
//Input -Enter base : 2    
/        Enter power : 4
//Output - Result is : 16
//
////////////////////////////////////////////////////////////////
