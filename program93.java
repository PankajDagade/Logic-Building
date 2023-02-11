/*

 *  *  *  *  *  *
 *  *  *  *  *  *
 *  *  *  *  *  *
 *  *  *  *  *  *
 *  *  *  *  *  *
 *  *  *  *  *  *
 
 rows = 6 , columns = 6

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
		System.out.println("\n");
		for(int i = 0 ; i < iRow ; i++)
		{
			for(int j = 0 ; j < iCol ; j++)
				System.out.print(" * ");
			System.out.println();
		}
	}
}
class program93
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