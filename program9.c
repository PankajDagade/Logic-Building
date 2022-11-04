#include<stdio.h>

//////////////////////////////////////////////////////////////
////////////////////////
//  Function Name :    Display
//  Description   :    Used to perform Addition of 2 numbers(take input from user)
//  Input         :     Integer,Integer
//  Output        :        Integer
//  Date          :       12/04/2022
//  Author        :       Pankaj Vishnu Dagade
//
//////////////////////////////////////////////////////////////
////////////////////////

void Display(int iNo)
{
    if(iNo < 0){
        iNo = -iNo;
    }

    int iCnt = 0;

    for(iCnt = 1 ; iCnt <= iNo ; iCnt++)
    {
        printf("Hello World\n");
    }
}

//////////////////////////////////////////////////////////////
//WAP to display N times Hello World
//////////////////////////////////////////////////////////////

int main()
{
      auto int iValue = 0;

      printf("Enter the number : ");
      scanf("%d",&iValue);

      Display(iValue);

      return 0;
}
