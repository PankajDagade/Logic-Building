 /*
 
 *  *  *  *  *  *
 *  *  *  *  *
 *  *  *  *
 *  *  *
 *  *
 *
 
*/

import java.lang.*;
import java.util.*;

class Pattern
{
	public
	       int iRow;
		   int iCol;
		   
	public Pattern(int iNo1, int iNo2)
	{
		iRow = iNo1;
		iCol = iNo2;
	}
	public void Display()
	{
		System.out.println();
		for(int i = 1 ; i <= iRow ; i++)
		{
			for(int j = iCol ; j >= i ; j--)
				System.out.print(" * ");
			System.out.println();
		}
	}
}
class program95
{
	public static void main(String args[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.print("Enter the first number :  ");
		int iNo1 = sobj.nextInt();
		System.out.print("Enter the second number :  ");
		int iNo2 = sobj.nextInt();
		
		Pattern obj = new Pattern(iNo1,iNo2);
		obj.Display();
	}
}