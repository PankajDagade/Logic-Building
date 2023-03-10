/*

     *

    **

   ***

  ****

 *****

******

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
		for(int i = iRow ; i >= 1 ; i--)
		{
			System.out.println();
			for(int j = 1 ; j <= iCol ; j++)
				if( i <= j )
					System.out.print("*");
				else
					System.out.print(" ");
			System.out.println();
		}
	}
}
class program96
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