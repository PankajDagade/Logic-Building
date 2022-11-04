#include<stdio.h>
#include<stdbool.h>

////////////////////////////////////////////////////////////////
//////////////////////////////////////
//
//Function Name:     Summation
//Description  :     Summation of N numbers
//Input        :     5(any decimal number)
//Output       :     1+2+3+4+5 = 15
//Date         :     29/04/2022
//Author       :     Pankaj Vishnu Dagade
//
////////////////////////////////////////////////////////////////
//////////////////////////////////////

bool CheckEven(int iNo)
{
    if(iNo < 0){
        iNo = -iNo;
    }
    
    if((iNo%2)==0){
        return true;
    }else{
        return false;
    }
}

int main(){
    auto int iValue = 0;
    bool bRet;

    printf("Enter the number : ");
    scanf("%d",&iValue);

    bRet = CheckEven(iValue);

    if(bRet == true){
        printf("%d is a Even number",iValue);
    }else{
        printf("%d is a Odd number",iValue);
    }
    return 0;
}

////////////////////////////////////////////////////////////////
//
//Input - Enter the number : 6
//Output - 5 is a Even number   
//
//Input - Enter the number : 6
//Output - 5 is a Even number 
//
////////////////////////////////////////////////////////////////
