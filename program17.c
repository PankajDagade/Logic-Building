/*
0 to 35         Fail
35 to 50        Pass class
50 to 60        Second class
60 to 70        First class
70 to 100       First class with distinction
*/

#include<stdio.h>

////////////////////////////////////////////////////////////////
//////////////////////////////////////
//
//Function Name:     DisplayClass
//Description  :     Display class from percentage
//Input        :     65
//Output       :     First class
//Date         :     29/04/2022
//Author       :     Pankaj Vishnu Dagade
//
////////////////////////////////////////////////////////////////
//////////////////////////////////////

void DisplayClass(int iMarks){
    if((iMarks >= 0) && (iMarks < 35)){
        printf("You are Fail");
    }
    else if((iMarks >= 35) && (iMarks < 50)){
        printf("Pass class\n");
    }
    else if((iMarks >= 50) && (iMarks < 60)){
        printf("Second class\n");
    }
    else if((iMarks >= 60) && (iMarks < 70)){
        printf("First class\n");
    }
    else if((iMarks >= 70) && (iMarks <= 100)){
        printf("First class with distinction\n");
    }
    else{
        printf("Invalid Marks");
    }
}
int main(){

    auto int iValue = 0;
    printf("Enter the Marks : ");
    scanf("%d",&iValue);

    DisplayClass(iValue);
    return 0;
}

////////////////////////////////////////////////////////////////
//
//Input - Enter the Marks : 76
//Output - First class with distinction   
//
////////////////////////////////////////////////////////////////
