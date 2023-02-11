/*

*    *
 *  *
  **
  **
 *  *
*    *

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
		System.out.println("\n");
		for(int i = 0 ; i < iRow ; i++)
		{
			for(int j = 0 ; j < iCol ; j++)
				if(i == j || j == iCol - (i+1))
					System.out.print("*");
				else
					System.out.print(" ");
			System.out.println("");
		}
	}
	
}
class program105
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