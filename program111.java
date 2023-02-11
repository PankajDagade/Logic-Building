/*

*******
 *******
  *******
   *******
    *******
     *******
      *******
	  
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
			for(int j = 0 ; j < 2*lines ; j++)
				if( i <= j && j < lines+i)
					System.out.print("*");
				else
					System.out.print(" ");
			System.out.println("");
		}
				
	}
}
class program111
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