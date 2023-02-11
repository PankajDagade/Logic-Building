/*


 *           *
   *       *
     *   *
       *
	   
*/

import java.lang.*;
import java.util.*;

class Pattern
{
	private int lines = 0;
	
	public Pattern(int lines)
	{
		this.lines = lines;		
	}
	
	public void Display()
	{
		System.out.println("\n");
		for(int i = 1 ; i <= lines ; i++)
		{
			for(int j = 1 ; j < (2*lines) ; j++)
				if( i == j || j == ((2*lines)-i) )
					System.out.print(" *");
				else
					System.out.print("  ");
			System.out.println();
		}
	}
}
class program104
{
	public static void main(String args[])
	{
	    Scanner sobj = new Scanner(System.in);
		
		System.out.print("Enter the number of lines : ");
		int ilines = sobj.nextInt();
		
		
		Pattern obj = new Pattern(ilines);
		obj.Display();
	}
	
}