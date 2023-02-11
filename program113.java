/*

 1
 1 2
 1 2 3
 1 2 3 4
 1 2 3 4 5
 1 2 3 4 5 6

rows = 6  columns = 6
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
		for(int i = 1 ; i <= iRow ; i++)
		{
			for(int j = 1 ; j <= iCol ; j++)
				if(i >= j)
					System.out.print(" "+j);
				else
					System.out.print(" ");
		System.out.println("");
		}
	}
}
class program113
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