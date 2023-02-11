/* 
        1
	0  1
	1  0  1
	0  1  0  1
	1  0  1  0  1
	
	iRow = 5 , iCol = 5
*/

import java.lang.*;
import java.util.*;

class Pattern
{
	private int iRow, iCol;
	
	public Pattern(int iRow, int iCol)
	{
		this.iRow = iRow;
		this.iCol = iCol;
	}
	
	public void Display()
	{
		System.out.println();
		for(int i = 1 ; i <= iRow ; i++)
		{
			for(int j = 1 ; j <= i ; j++)
				if( ( (i + j) % 2) == 0)
					System.out.print(" 1");
				else
					System.out.print(" 0");
		System.out.println("");
		}
	}
}
class program117
{
	public static void main(String args[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.print("Enter the number of rows : ");
		int rows = sobj.nextInt();
		System.out.print("Enter the number of columns : ");
		int col = sobj.nextInt();
		
		Pattern obj = new Pattern(rows,col);
		obj.Display();
	}
}	