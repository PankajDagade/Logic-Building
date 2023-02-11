/*

 *       *
 *       *
 * * * * *
 *       *
 *       *
 
 rows = 5  column = 5
 */
 
import java.lang.*;
import java.util.*;

class Pattern
{
	private int iRow, iCol = 0;
	
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
			for(int j = 1 ; j <= iCol ; j++)
				if( j == 1 || j == iCol || i == ((iRow/2)+1) )
					System.out.print(" *");
				else
					System.out.print("  ");
			System.out.println();
		}
	}
}
class program102
{
	public static void main(String args[])
	{
	    Scanner sobj = new Scanner(System.in);
		
		System.out.print("Enter the number of rows : ");
		int rows = sobj.nextInt();
		System.out.print("Enter the number of columns : ");
		int columns = sobj.nextInt();
		
		Pattern obj = new Pattern(rows,columns);
		obj.Display();
	}
	
}