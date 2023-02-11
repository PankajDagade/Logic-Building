/*


*    *
 *  *
  *
  *
  *
  *

rows = 6  columns = 6
*/

import java.lang.*;
import java.util.*;

class Pattern
{
	private int lines;
	
	public Pattern(int lines)
	{
		this.lines = lines;
		this.lines = lines;
	}
	
	public void Display()
	{
		System.out.println("\n");
		for(int i = 0 ; i < lines ; i++)
		{
			for(int j = 0 ; j < lines ; j++)
				if( i <= (lines - 1)/2 && (j == i) || i < ((lines - 1)/2) &&  j == (lines -(i+1)) || ( (i > (lines-1)/2) && (j == (lines-1)/2)) )
					System.out.print("*");
				else
					System.out.print(" ");
			System.out.println("");
		}
				
	}
}
class program107
{
	public static void main(String args[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.print("Enter the number of lines :  ");
		int Lines = sobj.nextInt();
		
		Pattern obj = new Pattern(Lines);
		obj.Display();
	}
}