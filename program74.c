#include<stdio.h>

void DisplayPattern(int iRow)
{
	int i,j,k = 0;
	int iCol = (iRow/2)+1;
	
	for(i = 1 ; i <= iRow ; i++)
	{
		for(j = 1 ; j <= iCol ; j++)
		{
			if((i == 1 ) || (i == iRow) || (j == 1) || (j == iCol))
			{
				printf("*\t");
			}
			else
			{
				printf("\t");
			}
		}
		for(k = 1 ; k <= (iCol/2) +1 ; k++)
		{
			if(i == (iRow/2) + 1)
			{
				printf("*\t");
			}
			else
			{
				printf("\t");
			}
		}
		printf("\n");
	}
}
int main(){
	
	int iValue = 0;
	
	printf("Enter the number of length : ");
	scanf("%d",&iValue);
	
	DisplayPattern(iValue);
	return 0;
}
