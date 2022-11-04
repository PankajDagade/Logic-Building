#include<stdio.h>
#include<stdbool.h>

////////////////////////////////////////////////////////////////
//////////////////////////////////////
//
//Function Name:    DivisibleBy3and5
//Description  :    check which number is Divisible by 3 and 5
//Input        :     Marks
//Output       :     class
//Date         :     29/04/2022
//Author       :     Pankaj Vishnu Dagade
//
////////////////////////////////////////////////////////////////
//////////////////////////////////////

bool DivisibleBy3and5(int iNo){
    if(((iNo%3)==0) && ((iNo%5)==0)){
        return true;
    }else{
        return false;
    }
}
int main(){
    auto int iValue = 0;
        bool bRet = 0;

    printf("Enter the number : ");
    scanf("%d",&iValue);

    bRet = DivisibleBy3and5(iValue);

    if(bRet == true){
        printf("%d is divisible by 3 and 5",iValue);
    }else{
        printf("%d is not divisible by 3 and 5",iValue);
    }
    return 0;
}

////////////////////////////////////////////////////////////////

//Input - 30
//Output - 30 is divisible by 3 and 5   
//
//Input - Enter the number : 6
//Output - 5 is not divisible by 3 and 5
////
////////////////////////////////////////////////////////////////
